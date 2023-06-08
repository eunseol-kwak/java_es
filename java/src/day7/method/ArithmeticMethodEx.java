package day7.method;

public class ArithmeticMethodEx {

	public static void main(String[] args) {
		
		System.out.println(sum(1,2));
		System.out.println(sub(1,2));
		System.out.println(mul(1,2));
		System.out.println(div(1,2));
		System.out.println(mod(1,2));
		sum2(1,2);
		//== System.out.println(1+2);
		//1+2+3 
		//메소드 만들때 하나의 기능만 들어가도록, 재사용 가능한 메서드가 좋은 메서드
		int num1=1, num2=2, num3=3;
		int res = sum(num1,num2);
		res = sum(res, num3);
		System.out.println(res);
	}
	/**
	 * 주어진 num1, num2의 합을 '출력하는' 메소드 
	 * (더하는 기능 + 출력하는 기능)/좋은메소드x
	 * @param num1 정수1
	 * @param num2 정수2
	 */
	public static void sum2(int num1, int num2) {
		System.out.println(num1 + num2); //return값이 x
	}
	
	/**
	 * 주어진 num1, num2의 합을 '알려주는' 메소드
	 * @param num1 정수1
	 * @param num2 정수2
	 * @return num1과 num2의 합
	 */
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int sub(int num1, int num2) {
		return num1 - num2;		
	}
	
	public static int mul(int num1, int num2) {
		return num1 * num2;		
	}
	
	public static double div(int num1, int num2) {
		return num1 / (double)num2;		
	}
	
	public static int mod(int num1, int num2) {
		return num1 % num2;		
	}
}
