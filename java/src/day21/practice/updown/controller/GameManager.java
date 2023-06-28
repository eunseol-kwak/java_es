package day21.practice.updown.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

import day21.practice.updown.vo.RecordGame;

public class GameManager implements Program{
		/* UpDown 프로그램을 작성하고, 기록도 관리하는 기능을 추가하세요.
		 * 1. play
		 * 2. record
		 * 3. exit 
		 * select : 1
		 * ... //3번맞에 맞춤
		 * record id : abc
		 * 1. play
		 * 2. record
		 * 3. exit 
		 * select : 2 
		 * 1. abc : 3 //적게 맞춘 순서대로 나열 
		 *
		 *  */
	
	//리터럴 3에 이름을 붙여서 명확하게 전달하기 위해. 	
	private static final int EXIT = 3;
	
	//다른 메서드에서 매번 객체를 생성하는게 번거로워서
	private Scanner sc = new Scanner(System.in);

	//기록을 저장하는 리스트
	private ArrayList<RecordGame> list = new ArrayList<>();
	
	@Override
	public void printMenu() {
		System.out.println("1. Play");
		System.out.println("2. Record");
		System.out.println("3. Exit");
		System.out.print("Select Menu: ");
	}
	
	@Override
	public void run() {
		System.out.println("Program Start!");
	
		int menu = -1;
		do {
			try {
				printMenu();
				menu = sc.nextInt();
				runMenu(menu);
				
			}catch(InputMismatchException e) {
				System.out.println("Wrong number");
				sc.nextLine();
			}
		} while(menu != EXIT);
		sc.close();
	}	
	
	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case 1:
			playGame();
			break;
		case 2:
			recordGame();
			break;
		case 3: break;
		default:
			System.out.println("Wrong menu!");
		}
	}
		
	private void playGame() {
		int min = 1, max = 100;
		int num = min - 1; // do-while이 아니라서 초기화

		int random = (int) (Math.random() * (max - min + 1) + min);
		System.out.println(random);
		
		int count = 0;
		while (num != random) {
			System.out.println("Input(1~100): ");
			num = sc.nextInt();

			// 정수와 정답을 비교하여 판별 /정수 == num, 정답 == random
			// num가 random보다 크면 Down!,아니고 num가 random보다 작으면 Up!, 아니면 Good!
			if (num > random) {
				System.out.println("Down!");
			} else if (num < random) {
				System.out.println("Up!");
			} else {
				System.out.println("Good!");
			}
			count++;
		}
		//기록: 아이디(입력), 플레이 횟수
		//아이디 입력
		System.out.println("Record ID : ");
		String id = sc.next();
		
		//어떻게 저장해서 관리할 건가?
		RecordGame rec = new RecordGame(id, count); //이것만 만들면 메서드 종료후 날아감. 그래서 위에 ArrayList만들어줌
		list.add(rec); //기록에 추가
		//sort(); //추가 후 한번 정렬
		list.sort(new Comparator<RecordGame>() { //익명 클래스 만들어서 사용

			@Override
			public int compare(RecordGame o1, RecordGame o2) {
				return o1.getCount() - o2.getCount();
			}
		});
	}
	
	//public static void sort(ArrayList<RecordGame> list)
	private void sort() { //버블정렬 사용	
		for(int i = 0; i<list.size()-1; i++) {
			for(int j = 0; j < list.size()-1; j++) {
				if(list.get(j).getCount() > list.get(j+1).getCount()) {//참조변수끼리는 비교가 안되서, 레코드게임안에 있는 횟수를 비교
					RecordGame tmp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, tmp);
				}
			}
		}
	}
		
	private void recordGame() {
		for(RecordGame tmp : list) {
			System.out.println(tmp);
		}
	}

}