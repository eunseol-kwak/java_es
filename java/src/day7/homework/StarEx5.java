package day7.homework;

public class StarEx5 {

	public static void main(String[] args) {
		/*  다음과 같이 출력되도록 코드를 작성하세요.
		 *      *               i=1      공백=3     *=1 i=*
		 *     ***				i=2      공백=2     *=3 i+1		
		 *    *****             i=3      공백=1     *=5 i+2
		 *   *******            i=4      공백=0     *=7 i+3
		 *    *****             i=3      공백=1     *=5
		 * 	   ***              i=2      공백=2     *=3
		 *      *               i=1      공백=3     *=1
		 *                                          *=i+=1
		 */	
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
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; 7-(2*i) >= k; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

