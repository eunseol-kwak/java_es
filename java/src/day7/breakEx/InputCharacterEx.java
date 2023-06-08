package day7.breakEx;

import java.util.Scanner;

public class InputCharacterEx {

	public static void main(String[] args) {
		// q를 입력하면 반복문을 종료하는 예제
		
		char ch;
		Scanner sc = new Scanner(System.in);
		
		//for문 무한루프는 조건식을 생략하면 됨
		for( ; ; ) {
			System.out.println("input char (exit: q) : ");
			ch = sc.next().charAt(0);
			if(ch == 'q') {
				break;
			}
		}
		
		sc.close();

	}

}
