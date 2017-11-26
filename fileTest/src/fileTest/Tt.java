package fileTest;

import java.util.HashMap;
import java.util.Map;

public class Tt {

	public static void main(String[] args) {
		char c='W';
		//System.out.println(c-10);
		
		//String s ="a"-10;
		//System.out.println(s-10);
		
		if('a'>(c-10)) {	
			c=(char) (10-c-'a');
			System.out.println(c);			
		}
		
		if('Z'<(c+10)) {	
			c=(char) ((char) 'A'+(10-('Z'-c)-1));
			System.out.println(c);			
		}
		
//		Map<Character, Integer> m=new HashMap<>();
//		for (int i = 0; i <26; i++) {
//			m.put((char) ('A'+i), i+1);
//		}
//		 for (Character key : m.keySet()) {
//		       System.out.println("key= "+ key + " and value= " + m.get(key));
//		      }
		System.out.println('w'==c);
		char x=(char)3;
		System.out.println((int)x);
	}

}
