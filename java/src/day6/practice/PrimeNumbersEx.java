package day6.practice;

public class PrimeNumbersEx {

	public static void main(String[] args) {
		// 2부터 100사이의 소수를 출력하는 코드를 작성하세요.
		
		int i = 2, j, count = 0;
		/* 외부 반복문(한번돌때) 
		 * 반복횟수: i는 2부터 100까지 1씩 증가 
		 * 규칙성(실행문): i가 소수이면 i를 출력
		 */
		while (i <= 100) {

			// i가 소수이면 i를 출력하는 코드
			/* 내부 반복문(여러번 돔) 반복횟수: j는 1부터 i까지 1씩 증가 
			 * 규칙성: j가 i의 약수이면 약수의 개수를 1증가 
			 * 반복문 종료 후 : 약수의 개수가 2개이면 i를 출력
			 */
			j = 1;
			count = 0;
			while (j <= i) {
				if (i % j == 0) {
					count++;
				}
				j++;
			}
			if (count == 2) {
				System.out.println(i);
			}
			i++;
		}
	}
}
/*
 * int i = 2, j = 0, count = 0; for(i = 2 ; i <= 100 ; i++) { if(j % i != 0) {
 * System.out.println("Prime number(1~100): " + i); }
 * 
 * for(j = 1; j <= i; j++) { if(j % i == 0) { count++; } else if(count == 2) {
 * System.out.println(i); } } } } }
 */