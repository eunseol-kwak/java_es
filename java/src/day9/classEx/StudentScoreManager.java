package day9.classEx;  //배열을 안배워서 아직 미완성

import java.util.Scanner;

public class StudentScoreManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();
		
		//korScore는 인스턴스, 객체
		//Score1 korScore = new Score(1,2,:Korean Language"); 한줄로 쓸수있는것(생성자 오버로딩이용)을 기본생성자를 이용하면 네줄로 늘려써야함 
		Score1 korScore = new Score1(); //1학년 1학기 빈문자열로 초기화
		korScore.title = "Korean Language";
		korScore.grade = 1;
		korScore.semester = 2;
		Score1 engScore = new Score1(1,2,"English"); //1학년 2학기 영어로 초기화
		System.out.println(engScore.title);
	}

}

//[접근제어자] 생략
//성적 클래스
// @Data만 추가해도 getter/setter 자동으로 생성됨
class Score1{
	String title; //과목명
	int grade; //학년
	int semester; //학기
	double total; //총점
	double midExam; // 중간고사
	double finalExam; //기말
	double performance; //수행평가
	//Score1 클래스의 기본생성자
	public Score1() {
		/* title의 기본값은? null
		 * grade의 기본값은? 0
		 * total의 기본값은? 0.0
		 * */
		title = ""; //빈문자열은 null과 다름
		grade = 1;
		semester = 1;
	//title = null; 기본값은 작업 할 필요없음, 이미 초기화됨
	//public 리턴타입 메서드명(매개변수들) {
	//생성자는 리턴타입이 없고 메서드명이 클래스명과 같음
	}
	public Score1(int _grade, int _semester, String _title) {
		grade = _grade;
		semester = _semester;
		title = _title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getMidExam() {
		return midExam;
	}
	public void setMidExam(double midExam) {
		this.midExam = midExam;
	}
	public double getFinalExam() {
		return finalExam;
	}
	public void setFinalExam(double finalExam) {
		this.finalExam = finalExam;
	}
	public double getPerformance() {
		return performance;
	}
	public void setPerformance(double performance) {
		this.performance = performance;
	}
	public Score1(String title, int grade, int semester, double total, double midExam, double finalExam,
			double performance) {
		//super();
		this.title = title;
		this.grade = grade;
		this.semester = semester;
		this.total = total;
		this.midExam = midExam;
		this.finalExam = finalExam;
		this.performance = performance;
	}
	
}

//학생 클래스
class Student1{
	String name; //이름
	String residentNumber; //주민번호
	int grade; //학년
	int classNum; //반
	int number; //번호
	int admissionYear; //입학년도
	Score1 korScore, engScore, mathScore; //국어, 영어, 수학 성적
	
}
