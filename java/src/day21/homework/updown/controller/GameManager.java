package day21.homework.updown.controller;

import java.util.ArrayList;
import java.util.Scanner;

import day21.practice.updown.vo.RecordGame;

public class GameManager implements Program {
	private static final int EXIT = 3;
	private Scanner sc = new Scanner(System.in);
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
		System.out.println("Program Start!!");
		
		int menu;
		do {
			printMenu();
			
			menu = sc.nextInt();
			
			runMenu(menu);
			
		}while(menu != EXIT);
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
		int num = min - 1; 
		int random = (int) (Math.random() * (max - min + 1) + min);
		System.out.println(random);
		int count = 0;
		while (num != random) {
			System.out.println("Input(1~100): ");
			num = sc.nextInt();

			if (num > random) {
				System.out.println("Down!");
			} else if (num < random) {
				System.out.println("Up!");
			} else {
				System.out.println("Good!");
			}
			count++;
		}
		if(list.size() == 5 &&  list.get(list.size()-1).getCount() <= count) {
			return;
		}
		if(list.size() == 5) {
			//마지막 기록을 삭제
			list.remove(list.size()-1);
		}
		System.out.print("Record ID : ");
		String id = sc.next();
		RecordGame rec = new RecordGame(id, count);
		list.add(rec);
		//sort();
		list.sort(null);
	}
	
	private void recordGame() {
		for(RecordGame tmp : list) {
			System.out.println(tmp);
		}
	}
}
