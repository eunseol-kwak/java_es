package day26.library.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import day26.library.vo.Book;
import day26.library.vo.LoanBrowsing;


public class LibraryController {
	private Scanner sc = new Scanner(System.in);
	private static final int EXIT = 4;
	//도서리스트
	List<Book> bookList = new ArrayList<>();
	//대출 열람 리스트
	List<LoanBrowsing> loanList = new ArrayList<>();
	
	public void run() {
		int menu;
		String bookFileName = "src/day26/library/book.txt";
		String loanFileName = "src/day26/library/book.txt";
		loadBook(bookFileName);//반복문안에 들어가면 등록후에도 또 불러오고 저장이안됨
		loadLoan(loanFileName);//반복문안에 들어가면 등록후에도 또 불러오고 저장이안됨
		do {
			System.out.println("=====================");
			printMenu();
			menu = sc.nextInt();
			runMenu(menu);
			System.out.println("=====================");
		}while(menu != EXIT);
		saveBook(bookFileName);
		saveBook(loanFileName);
		sc.close();
	}


	private void loadBook(String fileName) {
		try(ObjectInputStream ois 
			= new ObjectInputStream(new FileInputStream(fileName))){
			 while(true) {
				Book tmp = (Book)ois.readObject();
				bookList.add(tmp);
			 }
		} catch (FileNotFoundException e) {
			System.out.println("불러올 파일이 없습니다!");
		} catch (EOFException e) {
			System.out.println("불러오기 완료!");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			//ObjectInputStream을 이용하여 객체단위로 읽어올때 클래스가 Serializable인터페이스를 구현하지 않으면 발생
			System.out.println("Book 클래스를 찾을 수 없습니다.");
		}
		//System.out.println(bookList); 확인
	}
	private void loadLoan(String fileName) {
		try(ObjectInputStream ois 
				= new ObjectInputStream(new FileInputStream(fileName))){
				 while(true) {
					LoanBrowsing tmp = (LoanBrowsing)ois.readObject();
					loanList.add(tmp);
				 }
			} catch (FileNotFoundException e) {
				System.out.println("불러올 파일이 없습니다!");
			} catch (EOFException e) {
				System.out.println("불러오기 완료!");
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				//ObjectInputStream을 이용하여 객체단위로 읽어올때 클래스가 Serializable인터페이스를 구현하지 않으면 발생
				System.out.println("LoanBrowsing 클래스를 찾을 수 없습니다.");
			}
	}
	
	private void saveLoan(String fileName) {
		try(FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			for(LoanBrowsing tmp : loanList) {
				oos.writeObject(tmp); //여러개를 저장하기 위해 반복문 이용
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void saveBook(String fileName) { //매개변수명은 수정 안해도됨
		try(FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			for(Book tmp : bookList) {
				oos.writeObject(tmp); //도서정보를 하나씩 찍어줌
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 도서 등록");
		System.out.println("2. 도서 대출");
		System.out.println("3. 도서 반납");
		System.out.println("4. 종료");
		System.out.print("메뉴선택: ");
	}

	private void runMenu(int menu) {
		switch(menu) {
		case 1:
			insertBook();
			break;
		case 2:
			loanBook();
			break;
		case 3:
			returnBook();
			break;
		case 4:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("잘못된 메뉴 선택!");
		}
	}
	
	private void insertBook() {
		String title,author,isbn,number;
		//도서 정보 입력
		sc.nextLine();
		System.out.print("도서 번호 :");
		number = sc.nextLine();
		System.out.print("도서 제목 :");
		title = sc.nextLine();
		System.out.print("도서 저자 :");
		author = sc.nextLine();
		System.out.print("ISBN    :");
		isbn = sc.nextLine();
		
		//입력 정보를 이용하여 도서 객체를 생성
		Book book = new Book(number, title, author, isbn);
		//도서번호 중복 체크
		if(bookList.contains(book)) {
			System.out.println("이미 등록된 도서 번호입니다. 확인해주세요.");
			return;
		}
		//도서 리스트에 도서 객체를 추가
		bookList.add(book);
		//System.out.println(bookList); 확인
	}
	
	
	private void loanBook() {
		//대출 가능한 도서들을 조회 => (람다식 이용하여)필터작업 필요
		//Stream<Book> stream = bookList.stream();
		bookList
			.stream()
			.filter(b-> !b.isLoan()) 	//대출 가능한 도서만 추출
			.forEach(b->{ //boolean은 is //추출한 도서를 출력
				System.out.println("=====================");
				System.out.println(b);
				System.out.println("=====================");
			}); 
		/*
		for(Book tmp : bookList) {
			if(!tmp.isLoan()) {
				System.out.println(tmp);
			}
		}
		*/
		//도서 번호를 입력
		sc.nextLine(); //이전에 입력한 엔터 처리		
		System.out.print("도서번호: ");
		String number = sc.nextLine();
		
		//대출을 신청
		//도서 번호가 올바른지 확인
		//번호에 맞는 도서가 있는지 확인
		//도서가 없으면 올바르지 않음
		//도서가 있으면 대출중인지 확인
		boolean possible 
			= bookList
				.stream()
				//대출되지 않았고, 검색한 도서번호와 같은번호애들이, 집계한애들이 0보다 크면
				.filter(b-> !b.isLoan()&&b.getNumber().equals(number))
				.count() > 0;
		//올바르지 않으면(없는 도서번호이거나, 대출중인 도서인 경우)
		//대출 할 수 없다고 출력
		if(!possible) {
			System.out.println("대출 할 수 없습니다.");
			return;
		}
		//올바르면 대출을 진행
		//도서 대출 객체를 생성. 도서, 대출일 필요 및 대출기간(반납예정일때문에 미리 만들어 놓음) 표시
		//indexOf는 equals를 호출함
		int index = bookList.indexOf(new Book(number, null, null, null));
		Date loanDate = new Date();
		LoanBrowsing lb 
			= new LoanBrowsing(bookList.get(index), loanDate, 14);//생성자 없으면 error
		//대출열람 리스트에 추가
		loanList.add(lb);
		bookList.get(index).loanBook(); //도서에 대출했다고 수정 /다음에 실행했을때 대출도서 안보임
		//대출일을 출력(입력X)
		System.out.println("대출일 : " + lb.getLoanDateStr());
		//반납예정일 출력
		System.out.println("반납일 : " + lb.getEstimatedDateStr());
	}
		
	

	private void returnBook() {
		//도서 번호를 입력
		sc.nextLine(); 		
		System.out.print("도서번호: ");
		String number = sc.nextLine();
		
		//대출한 도서가 아니면 반납을 X(책이 있는지 없는지 확인)
		int index = bookList.indexOf(new Book(number, null, null, null));
		if(index == -1) {
			System.out.print("대출한 도서가 아닙니다.");
			return;
		}
		//맞으면 반납
		//반납한 도서의 상태를 대출 가능으로 수정
		Book returnBook = bookList.get(index);
		returnBook.returnBook();
		
		//대출 열람 리스트에서 대출한 도서에 반납일을 오늘날짜로 수정
		//반납한 도서의 대출 열람을 찾아야 함/List는 순서를 보장하기 때문에 마지막대출이==마지막대출
		//=>LastIndexOf사용 같은클래스의 같은객체여야 사용가능?
		int lbIndex = loanList.lastIndexOf(new LoanBrowsing(returnBook, null, 14));//반납한 도서를 기준으로 대출열람을 새로 하나 만듬
		LoanBrowsing tmpLb = loanList.get(lbIndex);
		tmpLb.setReturnDate(new Date());
		System.out.println("대출일 : " + tmpLb.getLoanDateStr());
		System.out.println("반납일 : " + tmpLb.getReturnDateStr());
	}
}