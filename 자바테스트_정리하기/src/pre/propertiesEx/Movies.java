package pre.propertiesEx;

import java.util.Comparator;

public class Movies implements Comparator <Movies>{
//필드
	private String name;
	private int 평점;
	private int 관람객;
	
//메서드
	//기본생성자
	public Movies() {
		// TODO Auto-generated constructor stub
	}

	//필수생성자
public Movies(String name, int 평점, int 관람객) {
	super();
	this.name = name;
	this.평점 = 평점;
	this.관람객 = 관람객;
}

//Getter
public String getName() {
	return name;
}

public int get평점() {
	return 평점;
}

public int get관람객() {
	return 관람객;
	
}

//Setter
public void setName(String name) {
	this.name = name;
}

public void set평점(int 평점) {
	this.평점 = 평점;
}

public void set관람객(int 관람객) {
	this.관람객 = 관람객;
}

@Override
public String toString() {
	return "name=" + name + ", 평점=" + 평점 + ", 관람객=" + 관람객;
}
//compare To
public int compareTo(Movies o) {
	return this.name.compareTo(o.name);
}

@Override
public int compare(Movies o1, Movies o2) {
	// TODO Auto-generated method stub
	return 0;
}
}
