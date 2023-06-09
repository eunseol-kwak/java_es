package day8.homework;

import java.util.Scanner;

public class MethodArithmeticEx {

	public static void main(String[] args) {
		/* 두 정수와 산술 연산자를 입력받아 산술 연산 결과를 출력하는 코드를 작성하세요.
		 * 단, 메서드 이용
		 * 연산자를 잘못 입력한 경우는 없다고 가정.
		 * 0으로 나누는 일은 없다고 가정.
		 * */
		
		int num1, num2;
		String op;
		Scanner sc = new Scanner(System.in);
		System.out.println("input 2 nums: ");
		num1 = sc.nextInt();
		op = sc.next();charAt(0);
		num2 = sc.nextInt();
		
		System.out.println("" + num1 + '+' + num2 + "=" + sum);
		System.out.println("" + num1 + '-' + num2 + "=" + sub);
		System.out.println("" + num1 + '*' + num2 + "=" + mul);
		System.out.println("" + num1 + '/' + num2 + "=" + (double)div);
		System.out.println("" + num1 + '%' + num2 + "=" + mod);
		
		sc.close();
	}

	
	/** 두 정수와 산술 연산자를 입력받아 산술 연산 결과를 출력
	 * 매개변수: 두정수 => int num1, int num2
	 * 리턴타입: 산술연산결과 => int num1 + Str op + int num2
	 * 메서드명: op
	 */
	
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int sub(int num1, int num2) {
		return num1 - num2;		
	}
	
	public static int mul(int num1, int num2) {
		return num1 * num2;		
	}
	
	public static double div(int num1, int num2) {
		return num1 / (double)num2;		
	}
	
	public static int mod(int num1, int num2) {
		return num1 % num2;		
	}
}

