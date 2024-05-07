package 자바_예제문제실습;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PersonMain {
	public void fileSave(String 사람이름) {
		File file = new File(사람이름);
		
		try {
			FileWriter fw = new FileWriter(file);
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			Person 사람 = new Person("김영희",10);
			bw.write(사람.toString());
			System.out.println("파일이 정상적으로 저장되었습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		PersonMain 사람파일만들기 = new PersonMain();
		사람파일만들기.fileSave("김영희씨인적사항.txt");
	}
}
