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
		Scanner sc = new Scanner(System.in);
		System.out.println("input score: ");
		korScore = sc.nextInt();
		engScore = sc.nextInt();
		mathScore = sc.nextInt();
		double avg = (korScore + engScore + mathScore)/(double)3.0;//(double)로 형변환도 가능. 3.0을 이용도 가능 
			System.out.println("Average is " + avg);

	}

}
       /*Teacher's
        int kor, eng, math;
        double avg;
        Scanner sc = new Scanner(System.in);
       //국어, 영어, 수학순으로 성적을 입력
        System.out.println("input score(kor, eng, math, ex: 100 90 80): " );
        korScore = sc.nextInt();
		engScore = sc.nextInt();
		mathScore = sc.nextInt();
       //평균을 계산
        avg = (kor + eng + math) / 3.0;
       //평균을 출력
        System.out.println("Average is " + avg);
        sc.close();
        * */
