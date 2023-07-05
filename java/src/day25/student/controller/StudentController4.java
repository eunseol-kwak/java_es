package day25.student.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day25.student.vo.Student;


public class StudentController4 { 
	private Scanner sc = new Scanner(System.in);
	private List<Student> list = new ArrayList<Student>(); //매개변수로 계속 넘기기 귀찮아서 멤버변수로 변경
	public void run() {
		int menu;
		String fileName = "src/day25/student/student.txt";
		load(fileName);//반복문안에 들어가면 학생등록후에도 또 불러오고 저장이안됨
		do {
			printMenu();
			menu = sc.nextInt();
			runMenu(menu);
			
		}while(menu != 3);
		save(fileName);
		sc.close();
	}
	private void save(String fileName) {//매번복붙하기 싫으면 String fileName 추가
		//학생 정보를 저장 => 리스트 => 하나씩 꺼내서 저장
		//저장 => OutputStream 바이트,문자,객체단위
		//객체단위로 저장 => ObjectOutputStream
		try(FileOutputStream fos = new FileOutputStream(fileName);
				                                        //"src/day25/student/student.txt"
														//"D:\\student.txt" 절대경로						
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
				for(Student tmp : list) {
					oos.writeObject(tmp); //학생정보를 하나씩 찍어줌
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	private void load(String fileName) {
		try(ObjectInputStream ois 
				= new ObjectInputStream(new FileInputStream(fileName))){
		 while(true) {
			Student tmp = (Student)ois.readObject();
			list.add(tmp);
		  }
		} catch (FileNotFoundException e) {
			System.out.println("불러올 파일이 없습니다.!");
		} catch (EOFException e) {
			System.out.println("불러오기 완료!");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			//ObjectInputStream을 이용하여 객체단위로 읽어올때 클래스가 Serializable인터페이스를 구현하지 않으면 발생
			System.out.println("Student 클래스를 찾을 수 없습니다.");
		}
	}
	private void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 학생등록");
		System.out.println("2. 학생확인");
		System.out.println("3. 종료");
		System.out.print("메뉴선택: ");
	}
	//값을 바꾸거나(출력하거나): 지역변수 =을 기준으로 왼쪽/ 값을 사용하는건지 확인 : 매개변수
	private void runMenu(int menu) {
		//String num, name, major; //넘겨줘봐야 바로 바꾸니까 지역변수
		//Student tmp; /원래 여기서 사용됐는데 메서드로 빠지면서 쓸모없어짐
		switch(menu) {
		case 1: 
			insertStudent();
			break;
		case 2: 
			print();
			break;
		case 3: 
			break;
		default:
		}
	}
	public void insertStudent() {
		String num, name, major;
		Student tmp;
		System.out.println("학번 : ");
		num = sc.next();
		sc.nextLine();
		System.out.println("이름: ");
		name = sc.nextLine();
		System.out.println("전공 : ");
		major = sc.nextLine();
		tmp = new Student(num, name, major);
		list.add(tmp);
	}
	public void print() {
		for(Student tmp2 : list) {
			System.out.println(tmp2);
		}
	}
}