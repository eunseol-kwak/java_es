package day18.practice;

import java.util.Scanner;

public class StringCharAtEx {

	public static void main(String[] args) {
		/* 영문 소문자로 된 문자열을 입력 받아 알파벳이 각각 몇개 있는지 확인하는 코드를 작성하세요.
		 * input : hello world 
		 * d: 1/e: 1/h: 1/l: 3/o: 2/r: 1/w: 1*/
		
		Scanner sc = new Scanner(System.in);
		int alphabet[] = new int[26]; //각 알파벳 개수를 저장하는 배열. 0번지: a의 개수, 1번지: b의 개수...
		
		//입력
		System.out.println("Input : ");
		String str = sc.nextLine(); //이전에 엔터이후 공백이 없어서 앞에 sc.nextLine 사용하지 않음
		
		//반복 : 문자열 길이만큼
		for(int i = 0; i < str.length(); i++) {
			//문자열의 한글자씩 가져와서 알파벳을 확인하여 알파벳 개수를 증가
			char ch = str.charAt(i);
			//ch가 알파벳 소문자인 경우 0~25사이의 값이 나옴
			int distance = ch - 'a';
			//영문 소문자가 아닌 경우
			if(distance < 0 || distance > 25) {
				continue;
			}
			//맞는 경우
			alphabet[distance]++;
		}
		//알파벳 개수 추가
		for(int i = 0; i < alphabet.length; i++) {
			if(alphabet[i] == 0) {
				continue; //0일때 건너뜀
			}
			System.out.println((char)('a'+i) + " : " + alphabet[i]);
		}
		sc.close();
	}
}
