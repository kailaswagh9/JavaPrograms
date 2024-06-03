package javaProgramsPkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
//	1.     Group the Anagrams strings (same number of characters and the same set of characters): 
//	{ "yo", "act", "flop", "cat", "tac", "oy", "olfp", "foo" };
//	[[act, cat, tac], [yo, oy], [flop, olfp], [foo]]

	public static void main(String[] args) {
		String[] input = { "yo", "act", "flop", "cat", "tac", "oy", "olfp", "foo" };
		List<List<String>> result = groupAnagrams(input);
		System.out.println(result);
		
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		if (strs == null || strs.length == 0)
			return new ArrayList<>();

		Map<String, List<String>> map = new HashMap<>();
		for (String str : strs) {
			char[] charArray = str.toCharArray();
			Arrays.sort(charArray);
			String sortedStr = new String(charArray);
			if (!map.containsKey(sortedStr)) {
				map.put(sortedStr, new ArrayList<>());
			}
			map.get(sortedStr).add(str);
		}

		return new ArrayList<>(map.values());
	}
}
