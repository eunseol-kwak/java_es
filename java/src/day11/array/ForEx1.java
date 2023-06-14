package day11.array;

public class ForEx1 {

	public static void main(String[] args) {
		//arr[0] = 4; 
		int arr[] = new int[] {4,5,2,1,9};
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 0; // 실제 배열의 값 바뀜
			int tmp = arr[i];
			System.out.println(tmp);
		}
		arr = new int [] {4,5,2,1,9};
		System.out.println("=============");
		for(int tmp : arr) {
			tmp = 0; //실제로는 배열의 값은 바뀌지 않고, tmp값이 바뀜
			System.out.println(tmp);
		}
		System.out.println("=============");
		for(int tmp : arr) {
			System.out.println(tmp);
		}
	}
}
