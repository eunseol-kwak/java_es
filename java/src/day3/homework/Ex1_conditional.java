package day3.homework;

import java.util.Scanner;

public class Ex1_conditional {

	public static void main(String[] args) {
		/*성별(M:남성, W:여성)를 입력받아 여성인지 확인하는 코드를 작성하세요.
		 * 조건연산자 이용
		 * input gender: M
		 * Are you a woman? false
		 * input gender: W
		 * Are you a woman? true
		 * */
		
		//문제가 주어졌을때 무엇을 출력해야할지, 하기전에 어떤것이 먼저 필요할까?
		//1. 변수선언, 2. 입력받으려면 스캐너->종료창 
		char gender; //변수 선언
		Scanner sc = new Scanner(System.in); // 입력 받음
		System.out.println("input gender: "); //안내 문구
		gender = sc.next().charAt(0); //nextLine();은 엔터치면 빈문자열이 생길수 있기떄문에 안됨
		boolean result = gender == 'W' ? true : false;
		System.out.println("Are you a woman? " + result);
		sc.close();
	}
}
