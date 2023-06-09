package day8.practice;

import java.util.Scanner;

public class MethodMultipleEx {

	public static void main(String[] args) {
		//System.out.println(MethodEvenNumberEx.isMultiple(4,2));
		
		/* 정수 num를 입력받아 2,3,6의 배수인지 아닌지 판별하는 코드를 작성하세요.
		 * 단, 메서드를 이용할 것.
		 * */
	
	int num;	
	Scanner sc = new Scanner(System.in);
	System.out.println("Input number: ");
	num = sc.nextInt();
	
	if(isMultiple(num,6)) {
		System.out.println(num + " is a multiple of 6.");
		}else if(isMultiple(num,2)) {
			System.out.println(num + " is a multiple of 2.");
		}else if(isMultiple(num,3)) {
			System.out.println(num + " is a multiple of 3.");
		}else {
		System.out.println("Not multiples of 2,3,6");
		}
		
		sc.close();
	}	
		
	

	/** 정수 num를 입력받아 2,3,6의 배수인지 아닌지 판별
	 * 매개변수: 판별할 정수 => int num1, int num2
	 * 리턴타입: 배수인지(참) 아닌지(거짓) => boolean
	 * 메서드명: isMultiple
	 */
	public static boolean isMultiple(int num1, int num2) {
		return num1 % num2 == 0;
	}
	
	
}	