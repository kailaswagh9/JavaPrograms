package javaProgramsPkg;
import java.util.*;
public class Pangram
{ // if the string contains all a-z letters ignoring case then thats a pangram string
//C:\Users\User.ITFY21EUDWIN307.000\Documents\Test\session\programs
	public static void main(String[] args)	{
		String str = "Abcdefghijklmnopqrstuvwxyz";
		if(pangramstr(str)){
		System.out.println("pangrams string");
		}else{
		System.out.println("Not pangrams string");
		}	}

	public static boolean pangramstr(String str)
	{
		HashSet<Character> set = new HashSet<>();
		char[] ch = str.toCharArray();
		for(char c:ch)
		{
		set.add(c);	
		}	
	
		if(set.size() == 26)
		{
		return true;
		}

		return false;
	}
}