package day24.thread;

public class SynchronizedEx1 {

	public static void main(String[] args) throws InterruptedException {
		//하나의 객체가 두개이상의 쓰레드에 접근하는 경우 동시에 접근해서 문제가 될 수 있음
		//동시에 접근 못하게 막아야 함 synchronized 추가
		//동기화 : 한개가 작업중이면 다른것은 대기
		Passbook pb = new Passbook();
		User user1 = new User("Hong gil dong",pb);
		User user2 = new User("Hong ga",pb);
		user1.start();
		user2.start();
		
	}
}
