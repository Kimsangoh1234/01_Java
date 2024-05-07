package ncs.test10;

public class BookUpdate {
//필드
	private Book 책정보;
	public Book get책정보() {
		return 책정보;
	}
	public void set책정보(Book 책정보) {
		this.책정보 = 책정보;
	}
	//메서드
	public BookUpdate() {
		// TODO Auto-generated constructor stub
	}
	public BookUpdate(Book 책정보) {
		super();
		this.책정보 = 책정보;
	}
	
	public void 책가격변경() {
		double 할인가 = 책정보.get책가격()*(1-책정보.get할인율()/100);
		책정보.set책가격(할인가);
	}
	//Setter
	//Getter
	//생성자기본
	//생성자필수
}
