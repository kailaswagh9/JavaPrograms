package javaProgramsPkg;

public class SwappingTwoStrings {

	public static void main(String[] args) {
		String str1 = "Automation ";
		String str2 = "Testing";

		
		System.out.println("Before swappning.");
		System.out.println(str1);
		System.out.println(str2);
		
//		with 3rd variable
		String temp = null;
//		temp = str1;
//		str1 = str2;
//		str2 = temp;

		
		str1 = str1+str2; // AutomationTesting
		str2 = str1.substring(0,str1.length()-str2.length());  //0,17-7 // Automation
		str1 =  str1.substring(str2.length()); //Testing
		
		System.out.println("After swappning.");
		System.out.println(str1);
		System.out.println(str2);
		
	}

}
