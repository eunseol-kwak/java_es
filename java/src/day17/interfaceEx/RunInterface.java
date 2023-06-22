package day17.interfaceEx;

public interface RunInterface{
		/*public static final */int NUM = 10;  //클래스 상수 => 클래스를 이용하여 호출(객체 생성없이 호출 가능)
		/*public abstract 자동으로 추가*/ void run();
		// 에러 void stop();
		default void stop() {
			System.out.println("Program stop!");
		}
	}

