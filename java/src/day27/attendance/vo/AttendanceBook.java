package day27.attendance.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.Data;

//출석이 여러개 모여 있는 클래스
@Data
public class AttendanceBook implements Serializable{
	private static final long serialVersionUID = 2595927543542941134L;
	
	private List<Attendance> list = new ArrayList<>();	//출석정보: 출석했을때 생성
	private List<Student> stdList = new ArrayList<>();	//학생정보

	public boolean insertStudent(Student std) {
		//이미 등록된 학번이면 등록 실패: 학생 클래스가 학번을 통해서 같은지 확인할 수 있어야함
		if(stdList.contains(std)) {
			return false; 
		}
		//새학생을 추가
		stdList.add(std); 
		//학번순으로 정렬
		Collections.sort(stdList,(o1,o2)->{
			return o1.getNum().compareTo(o2.getNum()); //compareTo: 문자열 정렬
		});
		System.out.println(stdList); //확인용
		return true;
	}

	public boolean insertAttendance(Attendance attendance) {
		//이미 등록된 출석기록이면 등록 실패
		if(list.contains(attendance)) {
			return false;
		}
		list.add(attendance);
		//날짜순, 학번순으로 정렬
		Collections.sort(list,(o1,o2)->{
			//날짜가 같으면 학번순으로 정렬
			if(!o1.getDate().equals(o2.getDate())){
				return o1.getStudent().getNum().compareTo(o2.getStudent().getNum());
			}
			//날짜가 다르면 날짜순으로 정렬
			return o1.getDate().compareTo(o2.getDate());
		});
		return true;
	}

	public void printAttendance() {
		//출석 기록이 없으면
		if(list.size() == 0) {
			System.out.println("등록된 출석체크가 없습니다.");
			return;
		}
		//첫 출석 체크 정보의 날짜를 문자열로 가져옴 /정렬이 되어있기 떄문에 가능
		String dateStr = ""; 
		for(Attendance tmp : list) {
			if(!dateStr.equals(tmp.getDateStr())) {
				System.out.println(tmp.getDateStr());
				dateStr = tmp.getDateStr(); 
			}
			System.out.println(tmp);
		}
	}
	
	//외부에서 사용할필요가 없어서 getter/setter 생성X	
}
