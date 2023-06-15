package day12.practice;

/* 단어장 클래스
 * - 단어들의 모임
 * - Word들의 모임
 * */

public class VocabularyNote {
	//멤버 변수
	//단어들
	private Word wordList[]; //단어들
	private int wordCount;   //저장된 단어의 개수 
	
	//생성자
	public VocabularyNote() {
		wordList = new Word[10];
	}
	public VocabularyNote(Word wordList[]) {
		//기존 단어장의 크기와 10을 비교해서 큰 수로 단어장 크기로 선택
		int size = wordList.length > 10 ? wordList.length : 10;
		
		this.wordList = new Word[size];
		
		for(int i = 0; i < wordList.length; i++) {
			this.wordList[i] = new Word(wordList[i]);  
			//this.wordList[i] = wordList[i]; //얕은복사
		}
		wordCount = wordList.length;
	}
	
	//메서드
	/**단어들을 출력하는 메서드
	 * 매개변수: 없음
	 * 리턴타입: 없음 => void
	 * 메서드명: print
	 * */
	public void print() {
		for(int i = 0; i < wordCount; i++) {
			wordList[i].print();
		}
	}
}