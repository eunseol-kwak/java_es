package day5.homework;

import java.util.Scanner;

public class TeamLeaderEx {

	public static void main(String[] args) {
		/*30명의 학생이 있는 반에서 1번부터 연속된 번호를 가진 3명의 학생이 1조가 되도록 나누었다.
		 * 이 때 가장 큰 번호인 학생이 조장이 된다.
		 * 학생 번호가 주어졌을 때 조장인지 조원인지 판별하는 코드를 작성하세요.
		 * (switch문으로)
		 * input student number:
		 * 1
		 * Student number 1 is a member of the team.
		 * input student number:
		 * 6
		 * Student number 6 is the team leader.
		 * */
		
		int num1, num2, num3;
		int max;
		Scanner sc = new Scanner(System.in);
		System.out.println("input student number: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		(a, a+1, a+2 == 1조?)
		switch(max) {
		case 1: 
			System.out.println("Student number " + num + "is the team leader.");
			break;
		default:
			System.out.println("Student number " + num + "is a member of the team.");
			break;
			
		}
		
		sc.close();

	}

}