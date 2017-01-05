package RegVir;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegVir {

	public static void main(String[] args) {
		String str = "Ooo! test tester, Child, Children, Chaild";
		String substr= "[cC]h[a-z]*";
		Pattern p= Pattern.compile(substr);
		Matcher m=p.matcher(str);
		int counter=0;
		while(m.find()) {counter++;}		
		System.out.println(counter);
	}
}
	
