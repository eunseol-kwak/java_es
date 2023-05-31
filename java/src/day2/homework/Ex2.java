package day2.homework;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		//Ex2) 두 정수를 입력받아 두 정수의 산술연산 결과를 출력하는 코드를 작성하세요. 단, 2번째 숫자는 0이 아님. 
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt(); 
		System.out.println(num1);
		
		int num1 = 1, num2 = 2;
		int sum = num1 + num2;			
		int sub = num1 - num2;
		int mul = num1 * num2;
		double div = (double)num1 / num2; //1/2의 결과가 0이어서, 1.0/2로 바꾸어 0.5가 나오게 함			int mod = num1 % num2;
			
		System.out.println("" + num1 + '+' + num2 + "=" + sum);			
		System.out.println("" + num1 + '-' + num2 + "=" + sub);
		System.out.println("" + num1 + '*' + num2 + "=" + mul);
		System.out.println("" + num1 + '/' + num2 + "=" + div);			
		System.out.println("" + num1 + '%' + num2 + "=" + mod);
	}

}
