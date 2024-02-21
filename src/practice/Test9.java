package practice;

public class Test9 {
	
	 private static final int a=10;
	 
	 private static void function1() {
		 System.out.println(" I am in function 1");
	 }

	 public static void main(String[] args) {
		
		function1();
		System.out.println(a);
//		fibonacciser();
//		factorial();
		
		
//		swapTwoString();
		
//		stringBufferandBuilder();
		
		
	}
	
	private static void stringBufferandBuilder() {
		
//		StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder();
		sb.append("Kailas");
		sb.append("Wagh");
		System.out.println(sb.charAt(1));
		System.out.println(sb.length());
		System.out.println(sb.substring(5));
		System.out.println(sb);
		
	}

	public static void swapTwoString() {
		String str1 = "Shree";
		String str2 = "Ram";
		str1 = str1 + str2; // ShreeRam
		
		str2 = str1.substring(0, str1.length() - str2.length()); // Shree
		
		str1 = str1.substring(str2.length());
		
		
		System.out.println(str1);
		System.out.println(str2);
		
	}
	
	public static void factorial() {
		
		int num=5;int fact=1;
		for(int i=1;i<=num;i++) {
			fact =fact*i;
		}
		System.out.println(fact);
	}
	
	
	public static void fibonacciser(){
		int a=0;int b=1; int c=0;int num=10; 
		
		System.out.print(a + " " + b);
		
		for(int i=0;i<=num;i++) {
			 c=a+b;
			 System.out.print(" "+c);
			 a=b;
			 b=c;			
		}
		

	}

}
