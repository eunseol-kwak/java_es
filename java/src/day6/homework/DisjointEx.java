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
		
		//반복횟수: i는 1부터(약수) num1까지(9~12는 어짜피 약수가 될수없음) 1씩 증가 
		//규칙성: i가 num1의 약수이고 
		//i가 num2의 약수이면 i를 gcd에 저장(덮어쓰기를 통해 최대공약수출력) 
		//num1을 i로 나누었을 때 나머지가 0과 같고 num2를 i로 나누었을 때 나머지가 0과같다면 
		//i를 gcd에 저장 
		 
		int num1, num2, i = 1, gcd = 1;// (최대공약수는 최소1)
		Scanner sc = new Scanner(System.in);
		// 두 정수를 입력
		System.out.println("input 2 numbers: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		
		// 최대공약수를 구하기위한 반복문
		// 최대공약수는 작은수까지만 비교하면됨
		// 반복문 : i가 num1까지
		while (i <= num1) {
			// num1을 i로 나누었을 때 나머지가 0과 같고 num2를 i로 나누었을 때 나머지가 0과 같다면
			// i가 num1의 약수이다. && i가 num2의 약수이다.
			if (num1 % i == 0 && num2 % i == 0) {
				// i를 gcd에 저장
				gcd = i;
			}
			// i를 1증가
			++i;
		}
		//반복문 종료 후: gcd가 1이면 Disjoint를 출력하고 
		if(gcd == 1) {
			System.out.println("Disjoint!");
		}else {
			System.out.println("Not disjoint!");
		}
		sc.close();
		
		
		/*
		for(i=1 ; i <= num1 ; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;	
			}
		}
		*/	
			
		/*
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
		*/
	}
}
