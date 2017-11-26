package fileTest;

import java.io.File;
import java.io.IOException;
//删除文件夹里 .开头的 文件或文件夹
public class FileTest {

	public static void main(String[] args) {
		File file=new File("e:\\imooc");
		File file1= new File(file,"io\\s.txt");
		System.out.println("isDirectory()"+file1.isDirectory());
		System.out.println("isFile()"+file1.isFile());
		
		File file2=new File("e:\\imooc\\set","HashSet");
		if(!file2.exists()) {
			file2.mkdirs();
		}
		
		if(!file1.exists()) {
			try {
				file1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
