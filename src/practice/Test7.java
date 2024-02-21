package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test7 {

	public static void main(String[] args) {

		//armStrong();
//		revString();
		
		
		countCharacter();
		
		

	}

	private static void countCharacter() {
		
		String str = "My name is ";
		String[] split = str.split(" ");
		Map<Character,Integer> map = new HashMap<>();
		
		
		
		for(String s: split) {
			
			char[] ch = s.toCharArray();
			
			for (int i = 0; i < ch.length; i++) {
				
				if(map.containsKey(ch[i])) {
					int count = map.get(ch[i]);
					map.put(ch[i], count+1);
				}else {
					map.put(ch[i], 1);
				}
			}
			
			
		}
		System.out.println(map);
		
		
	}

	private static void revString() {
		String str = "My name is kailas wagh";

		String[] split = str.split(" ");
		
		System.out.println(split.length);
		
		
		for(int i=0;i<split.length;i++) {
			
			String splitString = split[i];
			char[] ch =splitString.toCharArray();
			for(int j=ch.length-1;j>=0;j--) {
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
		

	}

	private static void armStrong() {
		int num = 25;
		int digits = 0;
		int result = 0;
		int rem = 0;
		int temp = 0;

		temp = num;
		while (temp != 0) {
			temp = temp / 10;
			digits++;
		}

		temp = num;
		while (temp != 0) {
			rem = temp % 10;
			result = (int) ((result) + Math.pow(rem, digits));
			temp = temp / 10;
		}
		System.out.println(result);
	}

}
