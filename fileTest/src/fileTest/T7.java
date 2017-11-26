package fileTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class T7 {
	public static void main(String[] args) throws IOException  {
		FileInputStream fis =new FileInputStream("E:\\imooc\\happy.gif");
		FileOutputStream fos=new FileOutputStream("E:\\imooc\\t.gif");
		
		int n=0;
		byte[] b=new byte[1024];
		while((n=fis.read(b))!=-1) {
			fos.write(b,0,n);
		}
		fis.close();
		fos.close();
	}
}
