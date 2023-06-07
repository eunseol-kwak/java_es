package day6.homework;

import java.util.Scanner;

public class DisjointEx {

	public static void main(String[] args) {
		/* 두 정수를 입력받아 두 정수가 서로소 관계인지 판별하는 코드를 작성하세요.
		 * 서로소 : 최대 공약수가 1인 두 수의 관계
		 * input 2 numbers : 3 4
		 * Disjoint!(서로소)
		 * input 2 numbers : 8 4
		 * Not disjoint!(서로소 아님)
		 * */

		
		int num1, num2, i, j, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("input 2 numbers: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		//1만큼 돌려
		for(i = 1 ; i <= num1 ; i++) {
			//num1을 i로 나눠서 나머지가 0이면=> num1약수
			if(num1 % i == 0) {
				for(j = 1 ; j <= num2 ; j++) {
					//num2를 j로 나눠서 나머지가 0이면 => num2의 약수
					if(num2 % j == 0) {
						if(i == j) {				
							count++;
						}
					}
				}
			}
		}
		if(count >= 2) {
			System.out.println("Not disjoint");
		} else {
			System.out.println("Disjoint");
		}
	}
}
