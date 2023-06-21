package day16.homework;

import java.util.Scanner;


public class BeverageMachineEx {
	//멤버변수
	private Scanner sc = new Scanner(System.in); 
	private BeverageMachineEx list[] = new BeverageMachineEx[3];
	private int count = 0; 
	private String product; //사이다,콜라,환타
	private int price; //가격
	
	//생성자
	public BeverageMachineEx(String product, int price) {
		this.product = product;
		this.price = price;
	}
	
	//메서드
	public void run() {
		System.out.println("프로그램 시작!");
		
		//반복: 선택한 메뉴가 종료가 아닐때
		int menu = -1;
		final int EXIT = 4;
		do {
			printMenu();
			
			menu = sc.nextInt();
			
			runMenu(menu);
			
		}while(menu != EXIT);
		System.out.println("프로그램 종료!");
	
	}
	private void printMenu() {
		System.out.println("1. 금액 투입");
		System.out.println("2. 메뉴 선택");
		System.out.println("3. 제품 입고");
		System.out.println("4. 프로그램 종료");
	}
	
	private void runMenu(int menu) {
		System.out.println("===============");
		System.out.println(menu + "를 선택");
		
		
		switch(menu) {
		case 1: 
			insertMoney();
			break;
		case 2:
			selectMenu();
			break;
		case 3:
			store();
			break;
		case 4:
			break;
		default:
			System.out.println("잘못된 메뉴!");
		}
	}
	
	private void store() {
		// TODO Auto-generated method stub
		
	}

	private void selectMenu() {
		System.out.println("메뉴 선택 : ");
		int selectMenu = sc.nextInt();
		
		printSubMenu();
		int selectBev = sc.nextInt();
		
		//금액이 충분한 경우
		if(money >= price) {
			switch(selectBev) {
			case 1:
			System.out.println("사이다를 선택했습니다.");
			System.out.println("잔돈 " + (money-price) + "이 나옵니다.");
			break;
			case 2:
			System.out.println("콜라를 선택했습니다.");
			System.out.println("잔돈 " + (money-price) + "이 나옵니다.");
			break;
			case 3:
			System.out.println("환타를 선택했습니다.");
			System.out.println("잔돈 " + (money-price) + "이 나옵니다.");
			break;
			default:
				System.out.println("잘못된 메뉴를 선택했습니다.");
			}
		//금액이 부족한 경우
		}else if(price > money) {
			System.out.println("금액이 부족합니다.");
			System.out.println("잔돈 " + money + "이 나옵니다.");
		}
	}
	private void printSubMenu() {
		System.out.println("=====================");
		System.out.println("1. 사이다");
		System.out.println("2. 콜라");
		System.out.println("3. 환타");
		System.out.println("음료 선택 : ");
		
	}

	private void insertMoney() {
		System.out.println("금액을 투입해 주세요.");
		int money = sc.nextInt();
	}

	public static void main(String[] args) {
		/* 음료수를 뽑는 자판기 프로그램을 작성하세요.
		 * 단 음료수 자판기에 음료수는 사이다, 콜라, 환타가 고정이라고 가정
		 * 메뉴를 선택하면 음료수와 잔액이 나옴(출력).
		 * 1. 금액 투입
		 * 2. 메뉴 선택
		 * 3. 제품 입고
		 * 4. 프로그램 종료
		 * 
		 * 메뉴 선택 : 2
		 * 1. 사이다
		 * 2. 콜라
		 * 3. 환타
		 * 음료 선택 : 1
		 * 사이다를 선택했습니다. 
		 * 사이다가 나옵니다. /금액이 충분한 경우
		 * 잔돈 xxx가 나옵니다.
		 * 금액이 부족합니다. /금액이 부족한 경우
		 * 잔돈 xxx가 나옵니다.
		 * */

	}

}

