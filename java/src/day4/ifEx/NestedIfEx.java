package day4.ifEx;

public class NestedIfEx {

	public static void main(String[] args) {
		/* 2,3,6의 배수 판별 예제
		 *  (day4.practice 패키지에 IfMultipleEx2 문제)
		 * */
		
		int num = 5;
		
		// 2의 배수, 2,4,6,8,19,12..
		if(num % 2 == 0) {
			//2의 배수 중 3의 배수 ==> 6의 배수, 6,12,18..
			if(num % 3 == 0) {
				System.out.println("A multiple of 6");
			}
			else {
				System.out.println("A multiple of 2");
			}
			//아닌 수 ==> 2의 배수, 2,4,8,10..
		}
		// 3의 배수
		else if(num % 3 == 0) {
			System.out.println("A multiple of 3");
		}
		// 아닌 수
		else {
			System.out.println("Not multiples of 2,3,6");
		}
	}
}