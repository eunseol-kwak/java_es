package day7.continueEx;

public class EvenNumberEx {

	public static void main(String[] args) {
		//continue문을 이용한 10이하 짝수 출력 예제
		
		int i;
		for(i = 1 ; i <= 10 ; i++) {
			//i가 홀수이면 출력하는 작업을 건너뜀
			if(i % 2 != 0) {
				continue; // for문에서는 증감식으로 바로이동, 출력코드 도달x=>error, 그래서 항상 조건문과 같이사용
			}
			System.out.println(i);
		}
		
		i = 0;
		while(++i <= 10) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
