package day7.homework;

public class StarEx5 {

	public static void main(String[] args) {
		/*  다음과 같이 출력되도록 코드를 작성하세요.
		 *      *               i=1      공백=3      *=1
		 *     ***				i=2      공백=2      *=3 		
		 *    *****             i=3      공백=1      *=5 
		 *   *******			i=4      공백=0      *=7
		 *                               공=half-i  *=2*i-1
		 *    *****             i=3      공백=1      *=5 = 2*3-1
		 * 	   ***              i=2      공백=2      *=3 = 2*2-1
		 *      *               i=1      공백=3      *=1 = 2*1-1
		 *                               공백=i-half  *= 2*(num+1-i)-1= 2*(num-i)+1 //num+1==8                                       
		 */	
		
		int num = 7;
		for(int i = 1; i <= num; i++) {
			int half = (num + 1) / 2;
		
			//4줄 => (num+1)/2
			if(i <= half) {
				//half-i개 공백 출력
				for(int j = 1; j <= half-i; j++) {
				System.out.print(' ');
				}
				//2*i-1개 * 출력
				for(int j = 1; j <= 2*i-1; j++) {
					System.out.print('*');
				}
				//엔터
				System.out.println();
			}
			//3줄
			else {
				//i-half개 공백 출력
				for(int j = 1; j <= i-half; j++) {
				System.out.print(' ');
				}
				//2*(num-i)+1개 * 출력
				for(int j = 1; j <= 2*(num-i)+1; j++) {
					System.out.print('*');
				}
				//엔터
				System.out.println();
			}
		}
		/*
		for(int i = 1; i <= 4; i++) {
			
			for(int j = 4; j-i >= 0; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= (i*2)-1; k++) {
				System.out.print("*");
			}	
			System.out.println();
		}
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= i+1; j++) {
				System.out.print(" ");
			}
			for(int k = 1; 7-(2*i) >= k; k++) {
				System.out.print("*");
			}
			System.out.println();
		}		
		*/
		
	}
}

