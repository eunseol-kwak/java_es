package day10.singleton;

public class SingletonEx {

	public static void main(String[] args) {
		//SamsungCompany company = new SamsungCompany();
		SamsungCompany company1 = SamsungCompany.getInstance();
		SamsungCompany company2 = SamsungCompany.getInstance();
		System.out.println(company1); //day10.singleton.SamsungCompany@2ff4acd0
		System.out.println(company2); //day10.singleton.SamsungCompany@2ff4acd0  주소 같음/서로 공유
	}
}

class SamsungCompany{
	
	private static SamsungCompany company = new SamsungCompany(); //코드안에 있어서 호출 가능
	
	private String name;
	private String address;
	
	private SamsungCompany() {
		name = "Samsung";
		address = "Korea";
	}
	public static SamsungCompany getInstance() {
		return company;
	}
}
