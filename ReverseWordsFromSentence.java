package javaProgramsPkg;

public class ReverseWordsFromSentence {

	public static void main(String[] args) {
		
		String str = "Welcome to Capgemini Store";
		
		String[] arr = str.split(" ");
		
		for(String a:arr) {
			 for(int i=a.length()-1;i>=0;i--)
				{
					System.out.print(a.charAt(i));
				}
			 System.out.print(" ");
		}

	}

}
