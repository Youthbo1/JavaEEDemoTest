package fileTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class T4 {
	public static void main(String[] args){
		try {
			FileInputStream fileInputStream=new FileInputStream("E:\\imooc\\s111.txt");
			int c=0;
		//	byte[] b=new byte[100];
			int n1;
			while((n1=fileInputStream.read())!=-1) {
				System.out.print((char) n1);
				c++;
				n1=fileInputStream.read();
			}
			System.out.println();
			System.out.println(c);
			//fileInputStream.read();
//			System.out.print(new String (b));
//			System.out.println();
//			int n=fileInputStream.read();
//			while(n!=-1) {
//				System.out.print((char)n);
//				n=fileInputStream.read();
//			}
//			int n=0;
//			while((n=fileInputStream.read())!=-1) {
//				System.out.print((char)n);
//			}
			
			
			
			fileInputStream.close();
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
