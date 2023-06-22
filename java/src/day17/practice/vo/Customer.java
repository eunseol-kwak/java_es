package day17.practice.vo;

import lombok.Data;

@Data
public class Customer {
	
	//CID00001
	private String customerId; //고객이 추가되면 자동으로 발급
	private String name;
	private String phoneNumber;
	
	//고객 ID 발급을 위한 클래스 변수
	//등록된 고객수
	private static int count; //static을 안붙이면 각 객체마다 계속 초기화됨
	//고객 아이디 앞부분
	private final static String CID = "CID";
	//고객 아이디 뒷부분 숫자의 최대 길이
	private final static int MAX_SIZE = 5;
	
	//생성자
	public Customer(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		generateCustomerId(); //customerId 발급이 완료
	}
	//복사 생성자
	public Customer(Customer customer) {
		this.name = customer.name;
		this.phoneNumber = customer.phoneNumber;
		this.customerId = customer.customerId;
	}

	private void generateCustomerId() {
		//1 => 00001
		//1 => "1"
		String num = ""+ ++count; //문자열 + 정수 => 문자열
		//"1".length == 1(5개중에 1개를 뺀 4개를 0으로 채우면됨)
		int length = num.length();
		for(int i = 0; i < MAX_SIZE - length; i++) {
			//A = A+B; A+=B; /0과 num의 순서가 바뀌기 때문에 +=쓸수없음
			num = "0" + num;
		}
		customerId = CID+num;
	}
	
	public void print() {
		System.out.println("고객번호 : " + customerId);
		System.out.println("고객이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
	}
	
}
