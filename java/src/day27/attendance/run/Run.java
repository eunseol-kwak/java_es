package day27.attendance.run;

import day27.attendance.controller.AttendanceController;

public class Run {

	public static void main(String[] args) {
		AttendanceController ac = new AttendanceController();
		ac.run();

	}
}
/* 학번과 이름을 가진 학생정보를 이용하여 출석부 프로그램을 작성하세요.

	- 학생등록 (학번,이름)
	- 출석
	- 출석부 확인
	- 종료
	
	출석
	날짜: 2023-07-05
	1. 홍길동 : O <-입력
	2. 임꺽정 : O
	
	날짜: 2023-07-06
	1. 홍길동 : O <-입력
	2. 임꺽정 : X
	
	2023-07-05
	1. 홍길동 : O
	2. 임꺽정 : O
	2023-07-06
	1. 홍길동 : O
	2. 임꺽정 : X
 * */
 