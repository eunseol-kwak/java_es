package day24.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClienttEx1 {

	public static void main(String[] args) {
		int port = 5001; //서버 포트번호
		Scanner sc = new Scanner(System.in);
		//1. 소켓생성
		
		try(Socket socket = new Socket();) {
			//2. 연결요청
			socket.connect(new InetSocketAddress(port));
			System.out.println("[Connect!]");
			//3. 작업
			//서버에 데이터 전송을 위해 OutputStream 생성
			OutputStream os = socket.getOutputStream();
			String str = sc.nextLine(); 
			byte [] bytes = str.getBytes(); //Hi를 바이트로 변환 : outputstream은 바이트 단위로 전송
			os.write(bytes); //write는 꽉차야 보내지기 때문에
			os.flush();      //밀어줌 
			InputStream is = socket.getInputStream();
			bytes = new byte[1024];
			int readCount = is.read(bytes);
			str = new String(bytes);
			System.out.println("server :" + str);
			
			is.close();
			os.close();
		} catch (IOException e) {
			System.out.println("[Connection refused!]");
			//e.printStackTrace();
		}
	}

}
