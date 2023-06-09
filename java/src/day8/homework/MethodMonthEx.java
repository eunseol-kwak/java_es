package day8.homework;

import java.util.Scanner;

public class MethodMonthEx {

	public static void main(String[] args) {
		/* 월을 입력받아 월에 맞는 영어를 출력하세요.
		 * 단, 메서드 이용
		 * 예:
		 * input month : 
		 * 3
		 * March		 
		 * */
		
		int month;
		Scanner sc = new Scanner(System.in);
		System.out.println("input month: ");
		month = sc.nextInt();
		
		System.out.println(month + " is " + getEng(month));
		sc.close();
	}
	
	
	/** 월이 주어지면 주어진 월에 맞는 영어를 알려주는 메서드
	 * 매개변수: 월 => int month
	 * 리턴타입: 영어 => String
	 * 메서드명: getEng
	 */
	public static String getEng(int month) {
		if(month == 1) {
			return "Jan.";
		}else if(month == 2) {
			return "Feb.";
		}else if(month == 3) {
			return "Mar.";
		}else if(month == 4) {
			return "Apr.";
		}else if(month == 5) {
			return "May";
		}else if(month == 6) {
			return "June";
		}else if(month == 7) {
			return "July";
		}else if(month == 8) {
			return "Aug.";
		}else if(month == 9) {
			return "Sep.";
		}else if(month == 10) {
			return "Oct.";
		}else if(month == 11) {
			return "Nov.";
		}else if(month == 12) {
			return "Dec.";
		}else {
			return "Wrong Month";
		}
	}
}
