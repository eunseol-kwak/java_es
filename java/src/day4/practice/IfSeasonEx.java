package day4.practice;

import java.util.Scanner;

public class IfSeasonEx {

	public static void main(String[] args) {
		/*월을 입력받아 입력받은 월의 계절을 출력하세요.
		 * 3,4,5 : 봄
		 * 6,7,8 : 여름
		 * 9,10,11 : 가을
		 * 12,1,2 : 겨울
		 * 그 외 : 잘못된 월
		 * 월이 3이거나, 월이 4이거나, 월이 5이면 봄이라고 출력하고 (월이 3이상이고 5이하이면)
		 * 월이 6이거나, 월이 7이거나, 월이 8이면 여름이라고 출력하고 (월이 6이상이고 8이하이면)
		 * 월이 9이거나, 월이 10이거나, 월이 11이면 가을이라고 출력하고 (월이 9이상이고 11이하이면)
		 * 월이 12이거나, 월이 1이거나, 월이 2이면 가을이라고 출력하고 (월이 12이거나 월이 1이상이고 2이하이면)
		 * 아니면 잘못된 월이라고 출력
		 * */
		
		int month;
		Scanner sc = new Scanner(System.in);
		System.out.println("input month: ");
		month = sc.nextInt();
		
		//월이 3이거나, 월이 4이거나, 월이 5이면 봄이라고 출력하고 (월이 3이상이고 5이하이면)
		//month가 3과 같거나 month가 4와 같거나 month가 5와 같다
		//month == 3 거나 month == 4 거나 month == 5 // 거나 = or연산자
		if(month == 3 || month == 4 || month == 5) {
			System.out.println("spring");			
		}
		else if(month == 6 || month == 7 || month == 8) {
			System.out.println("summer");
		}
		else if(month == 9 || month == 10 || month == 11) {
			System.out.println("fall");
		}
		else if(month == 12 || month == 1 || month == 2) {
			System.out.println("winter");			
		}
		//아니면 잘못된 월이라고 출력
		else {
			System.out.println("wrong month");
		}
		
		//월이 3이상이고 5이하이면 봄이라고 출력하고
		//이고 &&연산자
		if(month >= 3 && month <=5) {
			System.out.println("spring");	
		}	
		else if(month >= 6 && month <= 8) {
			System.out.println("summer");
		}
		else if(month >= 9 && month <= 11) {
			System.out.println("fall");
		}
		
		//다른 연산자가 섞여 있는경우 괄호를 쳐서 작업하는게 좋음
		//앤드연산자와 오얼연산자가 같이 있는 경우는 동작순서에 의해서 내가 원하지 않는결과가 발생할수 있음
		//그래서 우선 연산할것은 괄호를 꼭 해주기
		//월이 12이거나 월이 1이상이고 2이하이면
		else if(month == 12 ||(month >= 1 && month <= 2)) {
			System.out.println("winter");			
		}
		//아니면 잘못된 월이라고 출력
		else {
			System.out.println("wrong month");
		sc.close();
		}
	}

}

	
