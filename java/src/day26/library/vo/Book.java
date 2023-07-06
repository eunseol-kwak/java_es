package day26.library.vo;

import java.io.Serializable;
import java.util.Objects;

import lombok.Data;

@Data
public class Book implements Serializable{

	private static final long serialVersionUID = 3765844790013803988L;
	//도서번호: 도서관에서 지정
	//도서명, 저자, isbn(국제표준도서번호), 도서번호(도서관에서 지정)
	private String number, title, author, isbn;		
	
	private boolean loan; 				//대출여부 관리 true-> 대출 못함
	private boolean returnManager; 		//반납여부 관리 true-> 반납 못함
	
	public String toString() {
		return 	"도서번호 : " + number+ "\n" +
				"도서제목 : " + title + "\n" +
				"도서저자 : " + author + "\n"+
				"ISBN   : " + isbn;
	}
	
	public Book(String number, String title, String author, String isbn) {
		//super(); //부모클래스의 생성자인데 Object 생성자 필요없어서 주석처리
		this.number = number;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	public void loanBook() { //== setter로도 가능 : setLoan(true);
		this.loan = true;
	}
	public void returnBook() { 
		this.loan = false;  //== setLoan(false);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(number, other.number);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(number);
	}
	
}