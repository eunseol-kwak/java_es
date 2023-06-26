package day19.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticEx {

	public static void main(String[] args) {
		/* 두 정수와 산술연산자를 입력했을 때 연산 결과를 출력하는 코드를 작성하세요. 
		 * 예외처리도 추가
		 * input = 1 + 2
		 * 1 + 2 = 3
		 * input : 1 ? 2
		 * Not operator!
		 * input : 1 / 0
		 * Not operator! */
		
		//두 정수와 산술연산자 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("input (ex: 1 + 2): ");
		try {
			int num1 = sc.nextInt();
			char op = sc.next().charAt(0);
			int num2 = sc.nextInt();
			
			//연산자에 따른 결과를 출력
			switch(op) {
			case '+':
				System.out.println(""+ num1 + op +  num2 + "=" +(num1+num2));
				break;
			case '-':
				System.out.println(""+ num1 + op +  num2 + "=" +(num1-num2));
				break;
			case '*':
				System.out.println(""+ num1 + op +  num2 + "=" +(num1*num2));
				break;
			case '/':
				System.out.println(""+ num1 + op +  num2 + "=" +((double)num1/num2));
				break;
			case '%':
				System.out.println(""+ num1 + op +  num2 + "=" +(num1%num2));
				break;
			default:
				System.out.println("Not operator!");
			}
		}catch(InputMismatchException e) {
			System.out.println("Wrong Input!");
		}catch(ArithmeticException e) {
			System.out.println("Not operation!");
		}catch(Exception e) { //해당코드가 실행되지 않더라도, 추가해주는게 좋음 
			System.out.println("Exception!");
		}
		System.out.println("EXIT!");
		test1();
		test2();
		sc.close();

	}
	public static void test1(){
		try {
			System.out.println(1/0);
		}catch(Exception e) {
			System.out.println("Exception!!!!!");
			return;
		}finally { //위에서 return으로 종료해도 반드시 들려서 실행
			System.out.println("Method1 Exit!!");
		}
	}
	public static void test2(){
		try {
			System.out.println(1/0);
		}catch(Exception e) {
			System.out.println("Exception!!!!!");
			return; 
		}
		System.out.println("Method2 Exit!!");
	}	
}
