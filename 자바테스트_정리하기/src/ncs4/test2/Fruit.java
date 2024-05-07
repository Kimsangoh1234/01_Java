package ncs4.test2;
//비교
public class Fruit implements Comparable<Fruit>	 {
	//필드
	String name;
	int price;
	int quantitiy;
	//기본생성자
	public Fruit() {
		// TODO Auto-generated constructor stub
	}
	//필수생성자 과일명 과일가격 수량
	public Fruit(String name, int price, int quantitiy) {
		super();
		this.name = name;
		this.price = price;
		this.quantitiy = quantitiy;
	}
	//toString
	@Override
	public String toString() {
		return "name=" + name + 
				", price=" + price + 
				", quantitiy=" + quantitiy  ;
				 
	}
	@Override
	public int compareTo(Fruit 과일비교) {
		return this.name.compareTo(과일비교.name);
	}
}
