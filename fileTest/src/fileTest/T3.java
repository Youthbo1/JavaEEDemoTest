package fileTest;

import java.io.File;
import java.io.IOException;

public class T3 {

	public static void main(String[] args) throws IOException {
		File f=new File("E:\\imooc\\s112");
		System.out.println(f.isDirectory()+"  file  "+f.isFile());
		System.out.println(f.isAbsolute()+" "+f.getPath()+"\t "+f.getName() +"\t"+f.getPath());
		//创建目录
		File f1=new File("E:\\imooc\\set\\hash");
		if(!f1.exists()) {
			f1.mkdirs();
		}

		//创建文件
		if(!f.exists()){
			f.createNewFile();		
		}
		}

}
