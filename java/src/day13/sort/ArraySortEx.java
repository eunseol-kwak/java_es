package day13.sort;

import java.util.Arrays;
import java.util.Comparator;

import array.Array;

public class ArraySortEx {

	public static void main(String[] args) {
		//버블 정렬 예제
		int arr[] = {1, 4, 7, 9, 2, 8, 3, 6};
		Array.printArray(arr);
		
		for(int i = 0; i < arr.length-1; i++) { // -1추가이유: 마지막1개를 비교하지 않음/일을줄임
			for(int j = 0; j < arr.length-1-i; j++) { //-i추가이유: 반복횟수를 줄여줌
				if(arr[j] > arr[j+1]) { //부등호 방향을 바꾸면 내림차순,오름차순 설정가능
					int tmp = arr[i];
					arr[i] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			Array.printArray(arr);//int만 가능
		}
		//Integer class는 int + null까지 가능 
		Integer arr2[] = {1, 4, 7, 9, 2, 8, 3, 6};
		//Arrays.sort(arr2); //오름차순
		Arrays.sort(arr2, Comparator.reverseOrder()); //내림차순
		for(Integer tmp : arr2) {
			System.out.print(tmp + " ");
		}
	}
}
