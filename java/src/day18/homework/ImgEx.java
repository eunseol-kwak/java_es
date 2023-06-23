package day18.homework;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ImgEx {

	public static void main(String[] args) {
		/* 파일명을 입력받아 파일이 이미지인지 확인하는 코드를 작성하세요. 
		 * 이미지 확장자 : jpg, bmp, png(더 있지만 간단하게 3개만 체크) 
		 * input : dog.jpg
		 * dog.jpg : Image
		 * 
		 * input : dog.exe
		 * dog.exe : Not image */

		//파일명 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("input: ");
		String str = sc.next();
		String regex = "^[a-zA-Z\\.]jpg|bmp|png$";
		boolean result = Pattern.matches(regex, str);
	
		
		if(result == true) {
			System.out.println(str + " : " + "Image");
		}else { 
			System.out.println(str + " : " + "Not image");
		}
		
		
		sc.close();
	}

}
