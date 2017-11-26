package fileTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class T6 {
	public static void main(String[] args) {
		FileInputStream fis;
		try {
			FileOutputStream fileOutputStream =new FileOutputStream("E:\\imooc\\s111.txt",true);
			fis=new FileInputStream("E:\\imooc\\s111.txt");
			fileOutputStream.write(50);
			fileOutputStream.write('a');
			
			System.out.println(fis.read()+" "+(char)fis.read());
			fileOutputStream.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
