package day2.homework;

import java.util.Scanner;

public class Ex1 {	
	
	public static void main(String[] args) {
		//Ex1) 콘솔에서 정수 2개와 문자(산술연산자)를 입력받아 출력하는 코드를 작성하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수와 산술연산자를 입력해주세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt(); 
		String str = sc.next();
		System.out.println(num1 + str + num2);

		sc.close();
		
	}

}
