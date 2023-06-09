package day8.homework;

import java.util.Scanner;

public class MethodScoreEx {

	public static void main(String[] args) {
		/* 성적을 입력받아 학점을 출력하는 코드를 작성하세요.
		 * 단, 메서드 이용
		 * */
		int score;
		Scanner sc = new Scanner(System.in);
		System.out.println("input score: ");
		score = sc.nextInt();
		
		sc.close();
	}
	
	
	/** 성적이 주어지면 주어진 성적에 맞는 학점을 알려주는 메서드
	 * 매개변수: 성적 => int score
	 * 리턴타입: 학점 => int 
	 * 메서드명: getScore
	 */
}
