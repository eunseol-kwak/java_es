package day25.student.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import day25.student.vo.Student;


public class StudentController2 { 
	public void run() {
		Scanner sc = new Scanner(System.in);
		int menu;
		List<Student> list = new ArrayList<Student>();
		do {
			printMenu();
			menu = sc.nextInt();
			runMenu(menu, sc, list);
			
		}while(menu != 3);
		sc.close();
	}
	private void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 학생등록");
		System.out.println("2. 학생확인");
		System.out.println("3. 종료");
		System.out.print("메뉴선택: ");
	}
	//값을 바꾸거나(출력하거나): 지역변수 =을 기준으로 왼쪽/ 값을 사용하는건지 확인 : 매개변수
	private void runMenu(int menu, Scanner sc, List<Student> list) {
		//String num, name, major; //넘겨줘봐야 바로 바꾸니까 지역변수
		//Student tmp; /원래 여기서 사용됐는데 메서드로 빠지면서 쓸모없어짐
		switch(menu) {
		case 1: 
			insertStudent(sc,list);
			break;
		case 2: 
			print(list);
			break;
		case 3: 
			break;
		default:
		}
	}
	public void insertStudent(Scanner sc, List<Student> list) {
		String num, name, major;
		Student tmp;
		System.out.println("학번 : ");
		num = sc.next();
		sc.nextLine();
		System.out.println("이름: ");
		name = sc.nextLine();
		System.out.println("전공 : ");
		major = sc.nextLine();
		tmp = new Student(num, name, major);
		list.add(tmp);
	}
	public void print(List<Student> list) {
		for(Student tmp2 : list) {
			System.out.println(tmp2);
		}
	}
}