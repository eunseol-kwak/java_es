package day23.stream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

public class SerializableEx1 {

	public static void main(String[] args) {
		Student std1 = new Student(1,1,1,"Hong");
		Student std2 = new Student(1,1,2,"Lim");
		
		try(
			FileOutputStream fos = new FileOutputStream("student.txt");
			//모든 보조스트림은 매개변수로 기반스트림이 필요
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
				oos.writeObject(std1);
				oos.writeObject(std2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		List<Student> list = new ArrayList<>();
		//위와 동일 한줄로
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"))){
			while(true) {
				Student tmp = (Student)ois.readObject();//readObject는 리턴타입이 object라 형변환 필요
				list.add(tmp);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {//End Of File 파일의 끝에 도달함
			System.out.println("Finished reading the file!");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
		System.out.println(list);
	}

}

@Data
@AllArgsConstructor
class Student implements Serializable{//version이 같아야 직렬화,역직렬화가 가능
	private static final long serialVersionUID = 6460088211137244719L;
	private int grade, classNum, num;
	private String name;
	//private transient String registerId; //transient: 역직렬화 안함
}