package fileTest;

import java.util.HashMap;
import java.util.Map;

//1，小写：-10    2.大写  输出字母表 位置  3. 数字抛出异常 4. 其他 抛出异常
public class Match {

	static int count;

	public static void main(String[] args) {
		char c = 'c';
		try {
			System.out.println(transform(c));
		} catch (MyException e) {
			e.printStackTrace();
		}

	}

	public static char transform(char c) throws MyException {
		// 小写字母 -10
		if (c >= 'a' && c <= 'z') {
			if ( (char)(c - 10)<'a' ) {
				c = (char) (10 - c - 'a');
				System.out.println(c);
				return c;
			}
			c= (char) ((char) c-10);
			return c;
			
		}

		// 大写 返回int 第几个字母
		if (c >= 'A' && c <= 'Z') {
			Map<Character, Integer> m = new HashMap<>(); // 存 1-26
			for (int i = 0; i < 26; i++) {
				m.put((char) ('A' + i), i + 1);
			}
			for (Character key : m.keySet()) {
				if (c == key) {
					count = m.get(key);
					System.out.println("key= " + key + " and value= " + m.get(key));
				}				 			
			}
			return c;
		}

		if (Character.isDigit(c)) {
			throw new MyException("数字!");
		}

		throw new MyException("其他");
	}
}

class MyException extends Exception {
	public MyException() {}
	public MyException(String e) {
		super(e);
		System.out.println(e);
	}

	
}
