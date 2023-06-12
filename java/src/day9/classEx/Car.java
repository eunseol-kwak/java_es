package day9.classEx;

public class Car {
	//① 멤버 변수(필드)
	private String name; 	  	//차명
	private String company; 	//제조사
	private int year;			//연식
	private int speed;			//속력
	private char gear;			//P:주차, R:후진, D:주행, N:중립		
	private boolean power; 		//전원

	//② 생성자
	public Car(String _name, String _company, int _year) { //아직 this를 안배워서 언더바 추가
		name = _name;
		company = _company;
		year = _year;
		gear = 'P';
		//speed는 int 기본 초기화값이 0, boolean은 기본 초기화값이 false라 다시 쓰지 않음
	}
	
	//③ 메서드
	/** 자동차 정보를 '출력'하는 메서드
	 * 매개변수 : 없음 // static이었으면 정보를 넘겨줬워야 하지만,// 자동차 정보 다시 넘겨줄 필요가 없음, 이미 멤버들이 알고 있음 
	 * 리턴타입 : 없음 => void
	 * 메서드명 : printInfo
	 * */
	//public 리턴타입 메서드명() {}
	public void printInfo() {
		System.out.println("VIEW");
		System.out.println("COMPANY : " + company);
		System.out.println("MODEL   : " + name);
		System.out.println("YEAR    : " + year);
		System.out.println("POWER   : " + (power?"On":"Off"));
		System.out.println("GEAR    : " + gear);
		System.out.println("SPEED   : " + speed);
	}
	
	/** 속력이 1증가/ 1감소하는 메서드
	 * 매개변수 : 증가할건지 => boolean positive
	 * 리턴타입 : 없음 => void
	 * 메서드명 : speedChange
	 * */
	public void speedChange(boolean positive) {
		//전원이 꺼져있으면 종료
		if(!power) {
			return;
		}
		//기어가 중립 또는 주차중이면 종료
		if(gear == 'N' || gear == 'P') {
			return;
		}
		//속력이 증가하는 경우이면 
		if(positive) {
			speed += 1;
		//속력이 감소하는 경우이고 속력이 0보다 크면
		}else if(speed > 0){
			speed -= 1;
		}
	}
	/** 자동차 시동을 켜거나 끄는 메서드
	 * 매개변수: 없음
	 * 리턴타입: 없음 => void
	 * 메서드명: turn
	 * */
	public void turn() {
		//시동이 꺼져 있으면 켬
		if(!power) {
			power = true;
		}else if(gear == 'P') {
			power = false;
		}
	}

	public void setGear(char _gear) {
		gear = _gear;
	}
	
}




	