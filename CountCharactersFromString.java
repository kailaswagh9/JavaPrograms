package javaProgramsPkg;

import java.util.HashMap;
import java.util.Map;

public class CountCharactersFromString {

	public static void main(String[] args) {

		String str = "My name is Kailas Ramdas Wagh";
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

}
