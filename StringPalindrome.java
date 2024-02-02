package javaProgramsPkg;

public class StringPalindrome {

	public static void main(String[] args) {
		String str =  "madaM";

		String rev = "";
//		System.out.println(str.charAt(0));
//		System.out.println(str.length());
		
		for(int i =str.length()-1; i>=0;i--) {
			rev  = rev + str.charAt(i);  
//			System.out.println(str.charAt(i));

		}
		
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}

	}

}
