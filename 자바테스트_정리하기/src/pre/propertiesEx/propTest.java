package pre.propertiesEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.kh.test.main.oop.Main;

public class propTest {
	public static void fileSave(Properties p) {
		//Properties에 XML파일로 내용 저장하기
		
		p.setProperty("1","패밀리맨,4,2000");
		p.setProperty("2", "엘리멘탈,5,2023");
		p.setProperty("3","투모로우,5,2004");
		
		try {
			FileOutputStream fos = new FileOutputStream("movies.xml");
			p.storeToXML(fos, "movies is fun.");
			fos.close();//파일 저장 후 종료
			
			System.out.println("설정이 movies.xml 파일에 저장되었습니다.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//fileOpen xml 파일에 있는 내용 출
	}
	public static void fileOpen(Properties p) {
		try {
			FileInputStream fis = new FileInputStream("movies.xml");
			p.loadFromXML(fis);
			fis.close();
			
			List<Movies>영화들 = new ArrayList<>();
			
			for(String key : p.stringPropertyNames()) {
				String[]values = p.getProperty(key).split(",");
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Properties p = new Properties();
		fileSave(p);
	}
	
}
