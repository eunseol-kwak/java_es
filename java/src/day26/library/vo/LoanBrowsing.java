package day26.library.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import lombok.Data;

//대출 열람(도서대출 기록)
@Data
public class LoanBrowsing implements Serializable{ //파일에 저장할것이라 Serializable 추가 

	private static final long serialVersionUID = -2212924603633591017L;
	
	private Book book;			    //대출도서
	private Date loanDate;		 	//대출일자
	private Date returnDate;		//반납일자
	private Date estimatedDate;	    //반납예정일
	
	public LoanBrowsing(Book book, Date date, int loanPeriod) {
		this.book = book;
		this.loanDate = date;
		//대출 기한을 이용하여 반납 예정일을 추가
		calculateReturnDate(loanPeriod);
	}
	
	private void calculateReturnDate(int loanPeriod) {
		if(loanDate == null) { //대출일이 없으면 계산을 못함
			return;
		}
		Long loanDateMs = loanDate.getTime(); //대출일을 밀리초로 환산
		Long periodMs = loanPeriod * 24 * 60 * 60 * 1000L;;//1일:24H,1시간:60m,1분:60s,1초:1000ms
		/* new Date() : 현재 시간을 Date 객체로 생성
		 * new Date(Long a) : 1970년 1월1일0시를 기준으로 a밀리초만큼 흐른 날짜
		 * */
		estimatedDate = new Date(loanDateMs + periodMs);
	}

	public String getLoanDateStr() { //getter : getLoanDate() 원래Date리턴타입 있음 => 날짜를 문자열로 만듬
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
		return format.format(loanDate); 
	}
	public String getReturnDateStr() { 
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
		return format.format(returnDate); 
	}
	public String getEstimatedDateStr() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
		return format.format(estimatedDate); 
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoanBrowsing other = (LoanBrowsing) obj;
		return Objects.equals(book, other.book);
	}

	@Override
	public int hashCode() {
		return Objects.hash(book);
	}
}
