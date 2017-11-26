package fileTest;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

public class T1 {
	public static void t(File file) {
		File flist[] = file.listFiles();
		if (flist == null || flist.length == 0) {
			return;
		}
		for (File f : flist) {

			String t = ((String) f.getName()).substring(0, 1);

			if (t.equals(".")) {
				f.delete();
			}else {
				System.out.println(f.getName());
			}
		}

	}

	public static void main(String[] args) {
		File file = new File("E:\\imooc\\io\\");
		try {
			file.createNewFile();
			// System.out.println(file.isAbsolute());
			// System.out.println(file.getPath());
			// System.out.println(file.getAbsolutePath());
			// String t=((String)file.getName()).substring(0, 1);
			// System.out.println((file.getName()));
			// System.out.println(t);
			t(file);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
