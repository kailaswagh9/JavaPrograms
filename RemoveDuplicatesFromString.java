package javaProgramsPkg;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {
	public static void main(String[] args) {
		String str = "programming";
		//Approach 1
		StringBuilder sb1 = new StringBuilder();
		str.chars().distinct().forEach(c ->sb1.append((char)c));
		System.out.println(sb1);
		
		//Approach 2
		char[] arr = str.toCharArray();
		StringBuilder sb2 = new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			boolean repeated = false;
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					repeated = true;
					break;
				}
			}
			if(!repeated) {
				sb2.append(arr[i]);
			}
		}
		System.out.println(sb2);
		
		
		//Approach-3
		StringBuilder sb3 = new StringBuilder();
		Set<Character> set = new LinkedHashSet();
		for(int i= 0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		for(Character c :set) {
			sb3.append(c);
		}
		System.out.println(sb3);
		
	}
	
}	
