package javaProgramsPkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateCharFromString {

	public static void main(String[] args) {
		String str= "automation Kailas";
		StringBuilder sb = new StringBuilder();
		int length = str.length();
		char[] ch = str.toCharArray();
		Set<Character> dupes = new LinkedHashSet<>();
		for(int i =0 ; i<length; i++) {
			for(int j=i+1;j<length;j++) {
				if(ch[i] == ch[j]) {
					System.out.println("Duplicate characters are : " + ch[j]);
					dupes.add(ch[i]);
					break;
				}
			}
		}
		
		Iterator<Character> it = dupes.iterator();
		while(it.hasNext()) {
			System.out.println("iterator -> + " + it.next());
		}

		for(Character c: dupes) {
			sb.append(c);
		}
		System.out.println(dupes);
		System.out.println(sb);
		String normalString = sb.toString();
		System.out.println(normalString);
	
	

	}

}
