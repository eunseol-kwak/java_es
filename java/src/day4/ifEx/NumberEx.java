package day4.ifEx;

public class NumberEx {

	public static void main(String[] args) {
		/*정수 num가 양수이면 positive number라고 출력하고
		 * num가 음수이면 negative number라고 출력하고
		 * num가 0이면 0으로 출력하는 코드를 작성하세요.
		 * */
		int num = 3;
		//정수 num가 양수이면 positive number라고 출력하고
		if(num > 0) {
			System.out.println(num + " is a positive number");			
		}
		//정수 num가 음수이려면 양수가 아니어야 하기 때문에 양수가 아닌 수 중에서 음수를 판별
		//num가 음수이다
		else if (num < 0) {
			System.out.println(num + " is a negative number" );
		}
		//0은 음수도 아니고 양수도 아닌
		else {
			System.out.println(0);
		}
	}
}
