package day4.ifEx;

public class EvenNumberEx {

	public static void main(String[] args) {
		//if else문을 이용한 홀짝 판별 예제
		//num가 짝수이면 짝수라고 출력하고 아니면 홀수라고 출력해라.
		//num가 2로 나누었을 때 나머지가 0과  같다
		int num = 4;
		if(num % 2 == 0) {
			System.out.println(num + " is an even number.");
		}
		else {
			System.out.println(num + " is an odd number.");
		}
	}

}
