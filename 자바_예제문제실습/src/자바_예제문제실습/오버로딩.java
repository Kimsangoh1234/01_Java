package 자바_예제문제실습;
/*
빨간선이 뜨는 부분을 해결하기
 * */
public class 오버로딩 {
	public void test() {}
	public void test(String str) {}
	public void test(short a,String s) {}
	
	public void test(int i) {}
	private void test(String b,int a) {}
	
	public void test(char a) {}
	public void test(String c,char ch) {}
	
	public void test(boolean a) {}
	public void test(String a,boolean b) {}
	
	public void test(short s) {}
	public void test(String d,short c) {}
}
