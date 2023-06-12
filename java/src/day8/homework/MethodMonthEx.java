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
		//메소드를 어떻게 선언하는지에 따라서 호출방법이 달라질수 있다는 예제
		printMonth(1);
		System.out.println(getMonth(1));
	}
	
	
	/** 월이 주어지면 주어진 월의 영문을 '출력하는' 메서드
	 * 매개변수: 월 => int month
	 * 리턴타입: 없음 => void
	 * 메서드명: printMonth
	 */
	
	public static void printMonth(int month) {
		switch(month) {
		case 1: System.out.println("January");  		break;
		case 2: System.out.println("February"); 	 	break;
		case 3: System.out.println("March"); 			break;
		case 4: System.out.println("April"); 			break;
		case 5: System.out.println("May"); 				break;
		case 6: System.out.println("June"); 			break;
		case 7: System.out.println("July"); 			break;
		case 8: System.out.println("August"); 			break;
		case 9: System.out.println("September"); 		break;
		case 10: System.out.println("October");			break;
		case 11: System.out.println("November");		break;
		case 12: System.out.println("December");		break;
		default: System.out.println("Wrong month!");
		}
	}
		
	/** 월이 주어지면 주어진 월의 영문을 '알려주는' 메서드
	 * 매개변수: 월 => int month
	 * 리턴타입: 월의 영문 => String
	 * 메서드명: getMonth
	 */
	public static String getMonth(int month) {
		// return null;  //return null; 기본값으로 해놓고 시작하는게 좋음. 빨간줄 없어짐
		switch(month) {
		case 1: return "January";  		
		case 2: return "February"; 	 	
		case 3: return "March"; 		
		case 4: return "April"; 		
		case 5: return "May";			
		case 6: return "June"; 			
		case 7: return "July"; 			
		case 8: return "August";		
		case 9: return "September"; 	
		case 10: return "October";		
		case 11: return "November";		
		case 12: return "December";		
		default: return "Wrong month!";
		}
	}
}
	
	/*
	 * System.out.println(month + " is " + getEng(month));
		sc.close();
	 * 
	 * public static String getEng(int month) {
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
	 * */
