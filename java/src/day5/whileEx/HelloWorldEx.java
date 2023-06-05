package day5.whileEx;

public class HelloWorldEx {

	public static void main(String[] args) {
		//Hello world를 10번 출력하는 코드를 작성하세요.
		/* 반복횟수 : 10번, 1번부터 10번까지 1씩 증가
		 *  => 변수의 초기값 : 1
		 *  => 조건식 : 10까지 =>10보다 작거나 같을 때까지
		 *  => 증가하는 식 : 1씩 증가 
		 * 규칙성  : Hello world를 출력
		 * */
		
		int max = 3;
		int i = 1; //변수의 초기값 : 1
		//i가 10보다 작거나 같을 때까지
		while(i <= max) { //(i <=10)이라고 해도 좋으나, 값이 바뀌면 계속 바꿔줘야하니 max로
			System.out.println("Hello world");
			
			++i; //i는 1씩 증가, i++, i = i+1, i+=1
		}
		System.out.println("===================");
		/*반복횟수 : i는 10부터 1까지 1씩 감소*/
		i = max;
		while(i >=1) {
			System.out.println("Hello world");
			--i;
		}		
		System.out.println("===================");		
		i = max;
		while(i-- >=1) { //==(i-- > 0)
			System.out.println("Hello world");
		}
		
	}
}