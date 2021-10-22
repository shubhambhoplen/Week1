package Day2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment3 {
	
	public static void main(String[] args) {
		
		
		String s="mkcl<Shubhambhople@gmail.com> cc1:shubhambhoplen@gmail.com";
		
		Pattern pt =Pattern.compile("[a-zA-ZO 9_.+-]+@[a-zA-ZO 9-]+\\.[a-zA-ZO 9 .]+"); 
		
		Matcher match=pt.matcher(s);
		
		while(match.find()) {
			
			System.out.println(match.group());
		}
			
	}

}
