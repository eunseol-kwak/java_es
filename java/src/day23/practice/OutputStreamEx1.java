package day23.practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OutputStreamEx1 {

	public static void main(String[] args) {
		//바이트로만 저장
		try(FileOutputStream fos = new FileOutputStream("output1.txt")){
			for(int i = 1; i <= 10; i++) {//+48: 아스키코드 49==문자1
				fos.write(i);
			}
			System.out.println("File write success!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//objectstream사용시 유의사항: 순서를 맞춰줘야함 문자열, 숫자 => 문자열, 숫자
		try(//ObjectOutputStream: 객체가 아니어도 내가 원하는 타입으로 저장 가능
			FileOutputStream fos = new FileOutputStream("output2.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeChars("Hello\n");
			for(int i = 1; i <= 10; i++) {
				oos.writeInt(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
