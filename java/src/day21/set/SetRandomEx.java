package day21.set;

import java.util.ArrayList;
import java.util.HashSet;

public class SetRandomEx {

	public static void main(String[] args) {
		/* 배열을 이용해서 1~9사이의 랜덤한 수 3개를 저장(중복되지 않은) */
		int arr[] = new int[3];
		int count = 0;
		int min = 1, max = 9;
		
		while(count < 3) {
			int r = random(min,max);
			int i; //i를 밖에 선언해야함, 안에 선언하면 끝나고나왔는지 중간에 나왔는지 알 수 없음
			for(i = 0; i < count; i++) {
				if(arr[i] == r) {
					break;
				}
			}
			//중복된 값이 없으면
			if(i == count) {
				arr[count++] = r;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + (i == arr.length-1?"":", "));
		}
		System.out.println("]");
		
		
		/* List를 이용해서 1~9사이의 랜덤한 수 3개를 저장(중복되지 않은) */
		ArrayList<Integer> list = new ArrayList<>();
		while(list.size() < 3) {
			int r = random(min,max);
			if(!list.contains(r)) {
				list.add(r);
			}
		}
		System.out.println(list);
		
		
		/* Set을 이용해서 1~9사이의 랜덤한 수 3개를 저장(중복되지 않은) */
		HashSet<Integer> set = new HashSet<>();
		while(set.size() < 3) {
			int r = random(min,max);
			set.add(r); //추가만 하면됨, 조건문으로 따질 필요가 없음
		}
		System.out.println(set);
	}
	
	
	public static int random(int min, int max) {
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random() * (max - min + 1) + min);
	}
}
