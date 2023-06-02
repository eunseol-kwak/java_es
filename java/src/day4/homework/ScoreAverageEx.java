package day4.homework;

import java.util.Scanner;

public class ScoreAverageEx {

	public static void main(String[] args) {
		/*국어, 영어, 수학 성적을 입력받아 평균을 출력하는 코드를 작성하세요.
		 *성적은 정수
		 * */
		
		int korScore;
		int engScore;
		int mathScore;
		int average;
		Scanner sc = new Scanner(System.in);
		System.out.println("input score: ");
		korScore = sc.nextInt();
		engScore = sc.nextInt();
		mathScore = sc.nextInt();
		average = sc.nextInt();
		
		
		average = ((korScore + engScore + mathScore)/3);
		System.out.println(average + " is an average score");

	}

}
