package day21.practice;

import java.util.ArrayList;
import java.util.Comparator;

public class ListSortEx {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(10);
		list.add(4);
		list.add(8);
		System.out.println(list);
		/* 리스트에 있는 sort는 compare메서드를 가진 객체가 필요함
		 * 왜? 정렬 기준을 compare로 하기 때문. 
		 * compare값이 음수이면 앞으로, 같으면 0, 양수이면 뒤로 
		 * 객체가 compare 메서드를 반드시 갖게하기 위해 comparator 인터페이스를 구현한 
		 * 구현 클래스(compare밖에 없음)의 객체만 올 수 있게 지정*/
		
		//방법1: list.sort(new IntegerCompare());
		
		/*방법2: 
		익명클래스 사용 => 이름이 지정이 안되어 있기 때문에 한번밖에 못씀
		Comparator 인터페이스의 익명 클래스를 만들어서 객체를 생성
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		}); 
		*/
		
		/*방법3: 람다식
		list.sort((Integer o1, Integer o2)->o1-o2); 
		System.out.println(list);
		*/
		list.sort(null); 
	}	
}
class IntegerCompare implements Comparator<Integer>{
	
	@Override //compare의 리턴타입은 int
	public int compare(Integer o1, Integer o2) {
		return o1 - o2; //순서에 따라 내림차순 오름차순을 정해줄 수 있음 o2-o1
	}
}