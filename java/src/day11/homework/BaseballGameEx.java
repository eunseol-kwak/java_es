package day11.homework;

import java.util.Scanner;

public class BaseballGameEx {

	public static void main(String[] args) {
		/* 숫자 야구 게임을 구현하세요.
		 * 1~9사이의 중복되지 않은 세 수를 맞추는 게임
		 * 규칙:
		 * B: 같은 숫자가 있지만 위치가 다름
		 * S: 같은 숫자가 있고 위치가 같음
		 * 30: 일치하는 숫자가 하나도 없음
		 * 예: 랜덤숫자: 1 9 5
		 * 사용자: 1 2 3
		 * 1S
		 * 사용자: 4 5 6
		 * 1B
		 * 사용자: 1 2 9
		 * 1S1B
		 * 사용자: 2 3 4
		 * 30
		 * 사용자: 1 9 5
		 * 3S
		 * Good!
		 * */
		int min = 1, max = 9;
		int [] arr = new int[3];
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("input 3 nums: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		
		//방법1 : 9번지까지 있는 배열을 이용
		//장점 : 작업이 단순 / 단점: 저장 공간이 필요
		boolean checkArr[] = new boolean[10];
		
		for(int i = 0; i < 3; ) {
			int random = (int)(Math.random() * (max - min + 1) + min);
			//checkArr 배열에 random번지에 있는 값이 false이면
			if(!checkArr[random]) {
				//random을 배열에 저장 
			    arr[i] = random;
				//i를 증가
			    i++;
			    //checkArr배열에 random번지에 있는 값을 true로 변경
			    checkArr[random] = true;
			}
			if()
		}
		for(int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}
	}
}
