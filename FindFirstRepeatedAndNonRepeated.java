package javaProgramsPkg;

import java.util.HashMap;

public class FindFirstRepeatedAndNonRepeated {

//		Find out first repeated and first non-repeated character from string. Use hashmap.

	public static void main(String[] args) {
		String string = "kssForGks";
		Result result = findFirstRepeatedAndNonRepeated(string);
		System.out.println("First repeated character: " + result.firstRepeated);
		System.out.println("First non-repeated character: " + result.firstNonRepeated);

	}

	static class Result {
		Character firstRepeated;
		Character firstNonRepeated;

		public Result(Character firstRepeated, Character firstNonRepeated) {
			this.firstRepeated = firstRepeated;
			this.firstNonRepeated = firstNonRepeated;
		}
	}

	public static Result findFirstRepeatedAndNonRepeated(String string) {
		HashMap<Character, Integer> charCount = new HashMap<>();

		// First pass: count each character in the string
		for (char c : string.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);

		}

		Character firstRepeated = null;
		Character firstNonRepeated = null;

		// Second pass: find the first repeated and non-repeated characters
		for (char c : string.toCharArray()) {
			if (charCount.get(c) > 1 && firstRepeated == null) {
				firstRepeated = c;
			} else if (charCount.get(c) == 1 && firstNonRepeated == null) {
				firstNonRepeated = c;
			}
			// If both characters are found, no need to continue
			if (firstRepeated != null && firstNonRepeated != null) {
				break;
			}
		}

		return new Result(firstRepeated, firstNonRepeated);
	}

}
