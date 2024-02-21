package practice0224;

public class palindromeString {
	
	public static void main(String[] args) {
		
		String str = "madaM";
		String rev ="";
		
		char[] ch = str.toCharArray();
		
		for(char c : ch) {
//			System.out.println(c);
//			rev = c;
			
		}
		
		for(int i=ch.length-1;i>=0;i--) {
			rev = rev+ch[i];
//			System.out.println(ch[i]);
			
		}
		System.out.println(rev);
		
		
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}

}
