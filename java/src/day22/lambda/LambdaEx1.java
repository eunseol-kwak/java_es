package day22.lambda;

public class LambdaEx1 {

	public static void main(String[] args) {
		//2. 객체 생성
		/*
		InterfaceA a = new InterfaceA() {
			
			@Override
			public int getMax(int num1, int num2) {
				return num1 >= num2 ? num1 : num2;
			}
		};
		System.out.println(a.getMax(10,20));
		*/
		InterfaceA b = (num1, num2)->{
			return num1 >= num2 ? num1 : num2;
		}; //3. 기능 실행
		System.out.println(b.getMax(10,20));
		
		//람다식 간소화
		//1. 매개변수가 1개이면 ()를 생략
		//2. 실행문이 1줄이면{}를 생략
		//3. 실행문이 1줄이면 return을 생략
		InterfaceA c = (num1, num2)-> num1 >= num2 ? num1 : num2;
		System.out.println(c.getMax(10,20));
	}
}

//1. 추상메서드가 1개인 인터페이스(함수형 인터페이스) 생성
interface InterfaceA{
	int getMax(int num1, int num2);
}