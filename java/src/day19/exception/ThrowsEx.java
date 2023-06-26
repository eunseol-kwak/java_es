package day19.exception;

public class ThrowsEx {

	public static void main(String[] args) {
		int num1 = 1, num2 = 0;
		int res; 
		int arr[] = {1, 3, 5};
		

		try {
			arr = null; //=> 예외발생
			printArray(arr);
			//res = mod1(num1, num2); //예외처리 + 결과0
			res = mod2(num1, num2);   //예외처리만 나옴 / 예외가 발생하면 그 자리에서 바로 catch로 건너뜀
			System.out.println(res);
		} catch (Exception e) {
			//System.out.println("Exception : / by zero");
			System.out.println(e.getMessage());
			e.printStackTrace(); //예외가 발생한 위치를 콘솔에 출력/강제종료 된것이 아님 
		}
		System.out.println("EXIT");
		
	}
	//try-catch를 이용하여 예외를 직접 처리
	public static int mod1(int num1, int num2) {
		try{
			int res = num1 % num2;
			return res;
		}catch(Exception e) {
			System.out.println("Exception : by zero");
			return 0;
		}
	}
	
	//throws를 이용하여 예외 처리를 미룸
	public static int mod2(int num1, int num2) throws Exception { 
		return num1 % num2;
	}
	
	//throw를 이용하여 예외 발생
	public static void printArray(int arr[]) throws Exception {
		if(arr == null) {
			throw new Exception("Array is null."); //RuntimeException이 아니라 반드시 예외처리
		}
		for(int tmp : arr) {
			System.out.println(tmp);
		}
	}

}
