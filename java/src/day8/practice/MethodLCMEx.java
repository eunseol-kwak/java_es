package day8.practice;

import java.util.Scanner;

public class MethodLCMEx {               //Git보고 다시해야함!!!!

	public static void main(String[] args) {
		/* 정수 num1과 num2를 입력받아 두 정수의 최소 공배수를 구하는 코드를 작성하세요.
		 * 단, 메서드를 이용할 것.
		 * A: ga, B: gb
		 * g: 최대공약수
		 * l: A*B/g = 최소공배수
		 * A*B/g == (ga*gb)/g == gab
		 * */
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input 2 numbers: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		int lcm = lcm1(num1,num2);
		System.out.println(num1 + " and " + num2 + " lcm : " + lcm);
		
		lcm = lcm2(num1,num2);
		System.out.println(num1 + " and " + num2 + " lcm : " + lcm);
				
		sc.close();
	}
		/** 두 정수가 주어지면 두 정수의 최소 공배수를 알려주는 메서드 
		 * 매개변수: 판별할 정수 => int num1, int num2
		 * 리턴타입: 최소 공배수 => 정수 => int
		 * 메서드명: lcm
		 */	
	public static int lcm1(int num1, int num2) {
		for(int i = num1; i <= num1 * num2; i += num1) {
			//공배수를 찾음. isMultiple은 배수를 찾는 메서드이고,
			//i가 num1의 배수들이기 때문에 i가 num2의 배수이면 num1과
			//num2의 공배수가 됨
			if(isMultiple(i, num2)) { 
				return i;
			}
		}
		return num1*num2;
	}
	public static int lcm2(int num1, int num2) {
		return num1 * num2 / gcd(num1, num2);
	}
	
	public static boolean isMultiple(int num1, int num2) {
		return num1 % num2 == 0;
    }
	
	public static int gcd(int num1, int num2) {
		for(int i = num1; i>=1; i--) {
			if(isMultiple(num1,i) && isMultiple(num2, i)) {
				return i;
			}
		}
		return 1;
	}	
}