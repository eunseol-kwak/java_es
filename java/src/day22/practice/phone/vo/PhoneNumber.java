package day22.practice.phone.vo;

import java.util.Objects;
import java.util.regex.Pattern;
import lombok.Data;

//한사람의 전화번호 정보
@Data
public class PhoneNumber {
	private String name;
	private String number; //010-1234-5678 
	
	public PhoneNumber(String name, String number) {
		this.name = name;
		this.number = "";
		if(checkNumber(number)){
			this.number = number;
		}
		this.number = checkNumber(number)?number:"";
	}
	
	//정규표현식
	//전화번호가 010-xxxx-xxxx 패턴이 맞는지 확인해주는 메서드
	//외부에서도 객체 생성없이 쓸 수 있게 static과 public을 붙여줌
	public static boolean checkNumber(String num) {
		String regex = "^010(-\\d{4}){2}$"; //010-\d{4,4}-\d{4,4}
		return Pattern.matches(regex, num); //문자열이 정규표현식에 맞는지 아닌지 체크
		
	}
	//@Data해서 원래 setter 자동생성하지만, 내용이 달라져야해서 직접 만듬
	public void SetNumber(String number) {
		this.number = checkNumber(number)?number:this.number;
	}

	@Override//equals name만
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneNumber other = (PhoneNumber) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

}	