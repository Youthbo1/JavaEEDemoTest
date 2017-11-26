package fileTest;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T2 {
	
	public static boolean isNumeric(String str){ 
		   Pattern pattern = Pattern.compile("[0-9]*"); 
		   Matcher isNum = pattern.matcher(str);
		   if( !isNum.matches() ){
		       return false; 
		   } 
		   return true; 
		}
	public static void main(String[] args) throws MyException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一串字符'a'-'z'");
		String str = sc.nextLine();
		if (str.matches("^[a-z]+$")) {
			System.out.println("您输入的字符串是：" + str);
		
			
		} else if (str.matches("^[A-Z]+$")) {
			System.out.println("您输入的字符串是：" + str);
			
		}else if (isNumeric(str)) {			
			throw new MyException("数字!");
		}else{
			throw new MyException("qita");
		}
	}
	
}


class MyException extends Exception {
	public MyException(String e) {
		super(e);
		System.out.println(e);
	}

	public MyException() {
	}
}
