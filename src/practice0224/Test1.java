package practice0224;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {

//		removeDupCharFromString();
//		factorials();
//		binonaccieSeries();
//		findMaxandSecondMaxFromArray();
//		findSecMinAndMin();
//		stringMapulation();
//		swapNumWithout3rdVariable();
//		swapStringWithout3rdVariable();
//		swapStringWithout3rdVariablePractice();
//		pyramid1();
//		pyramid2();
//		pyramid3();
//		pyramid4();
//		pyramid5();
//		pyramid5again();
//		reverseWordsFromSentence(); 
//		findDuplicateCharFromString(); 
//		revString();
	}

	private static void revString() {
		String str = "Kailas";
		String rev= "";
		System.out.println("first approach----");
		char[] ch = str.toCharArray();
			for (int i = ch.length-1; i >=0; i--) {
			rev= rev+ch[i];
		}
		System.out.println(rev);
		System.out.println("2nd approach----");
		
		String str2 = "Kailas";
		String rev2="";
		for (int i = str2.length()-1; i >=0; i--) {
			rev2 = rev2+ str2.charAt(i);
		}
		System.out.println(rev2);
	}

	private static void findDuplicateCharFromString() {
		String str= "automation Kailas";
		StringBuilder sb = new StringBuilder();
		int length = str.length();
		char[] ch = str.toCharArray();
		Set<Character> dupes = new LinkedHashSet<>();
		for(int i =0 ; i<length; i++) {
			for(int j=i+1;j<length;j++) {
				if(ch[i] == ch[j]) {
					System.out.println("Duplicate characters are : " + ch[j]);
					dupes.add(ch[i]);
					break;
				}
			}
		}
		
		Iterator<Character> it = dupes.iterator();
		while(it.hasNext()) {
			System.out.println("iterator ->  " + it.next());
		}

		for(Character c: dupes) {
			sb.append(c);
		}
		System.out.println(dupes);
		System.out.println(sb);
		String normalString = sb.toString();
		System.out.println(normalString);
		
	}

	private static void reverseWordsFromSentence() {
		String str = "Welcome to Capgemini Store";
		String[] split = str.split(" ");
		System.out.println(split.length);
		String result = "";
		StringBuilder sb =new StringBuilder();
		for (int i = split.length-1; i >=0; i--) {
			
			char[] ch = split[i].toCharArray();
			
			for (int j = ch.length-1; j >=0; j--) {
				
//				sb.append(ch[j]);
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
//		System.out.println(sb);
		
		
		
		System.out.println("\n======================");
		//o/p-> Store Capgemini to welcome
		for(int i=split.length-1;i>=0;i--) {
			result = result +split[i]+" ";	
		}
		System.out.println(result);
	}

	private static void pyramid5again() {
		//	  * 
		//   * * 
		//  * * * 
		// * * * * 
		//* * * * *
		
		int num=5;
		
		for (int i = 0; i < num; i++) {
			for (int j = num-i; j >1; j--) {
				//printing spaces
				System.out.print(" ");
			}
			for (int j = 0; j <=i; j++) {
				//printing stars
				System.out.print("* ");
			}
			//printing next line
			System.out.println("");
		}
		
		
		
	}

	private static void pyramid5() {
	//	  * 
	//   * * 
	//  * * * 
	// * * * * 
	//* * * * *

		int n= 5;
		for (int i = 0; i < n; i++) {
			for (int j = (n-i); j>1; j--) {
				// printing spaces
				System.out.print(" ");
			}
			
			for (int j = 0; j <=i; j++) {
				// printing stars
				System.out.print("* ");
			}
			// ending line after each row
			System.out.println();
		}
		
		
	}

	private static void pyramid4() {
//      * 
//    * * 
//  * * * 
//* * * * 
//* * * * 

		for (int i = 0; i <5; i++) {
			for (int j = 2*(5-i); j >0; j--) {
				System.out.print(" ");		
				
			}
			for (int k = 0; k <=i; k++) {
				System.out.print("* ");
			}
			
			System.out.println(" ");
		}

	}

	private static void pyramid3() {
//		*****
//		***
//		**
//		*

		for (int i = 5; i > 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

	private static void pyramid2() {
//		*
//		**
//		***
//		****
//		*****
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println(" ");
		}

	}

	private static void pyramid1() {
//		1
//		23
//		456
//		78910

		int num = 1;

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(num);
				num = num + 1;
			}
			System.out.println();
		}

	}

	private static void swapStringWithout3rdVariablePractice() {
		String str1 = "Automation";
		String str2 = "Tester";
		System.out.println("before swap:  str1 -> " + str1 + "  str2 ->  " + str2);

		str1 = str1 + str2; // AutomationTester
		str2 = str1.substring(0, str1.length() - str2.length()); // 16-6=10= Automation
		str1 = str1.substring(str2.length());

		System.out.println("after swap:  str1 -> " + str1 + "  str2 ->  " + str2);
	}

	private static void swapStringWithout3rdVariable() {
		String str1 = "Kailas";
		String str2 = "Wagh";

		System.out.println("before swap:  str1 -> " + str1 + "  str2 ->  " + str2);

		str1 = str1 + str2; // KailasWagh //10-4 //6
		str2 = str1.substring(0, str1.length() - str2.length()); // kailas
		str1 = str1.substring(str2.length());

		System.out.println("after swap:  str1 -> " + str1 + "  str2 ->  " + str2);

	}

	private static void swapNumWithout3rdVariable() {
		int a = 10;
		int b = 20;

		System.out.println(a + " " + b);

		a = a + b; // 30
		b = a - b; // 10
		a = a - b; // 20

		System.out.println(a + " " + b);
	}

	private static void stringMapulation() {
		String str = "B12ar356niB";
		System.out.println(str);
		System.out.println("Only number- >" + str.replaceAll("[^0-9]", ""));
		System.out.println("Only chars  ->" + str.replaceAll("[^a-zA-Z]", ""));
		System.out.println("Specifi.  ->" + str.replaceAll("B", "P"));

		StringBuilder sb = new StringBuilder();
		String result = "";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (Character.isDigit(ch[i])) {
//				sb.append(ch[i]);
				result = result + ch[i];
			}

		}
		System.out.println(result);

	}

	private static void findSecMinAndMin() {
		int[] arr = { 1, 1, 3, 3, 9, 9, 45, 67, 88, 88, 99, 99, 108 };
		int min = Integer.MAX_VALUE;
		int secMin = Integer.MAX_VALUE;
		;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				secMin = min;
				min = arr[i];
			}
			if (arr[i] > min && arr[i] < secMin) {
				secMin = arr[i];
			}
		}

		System.out.println("Minimun -> " + min);
		System.out.println("Second Minimun -> " + secMin);

	}

	private static void findMaxandSecondMaxFromArray() {
		int[] arr = { 3, 45, 67, 88, 88, 99, 99, 108 };
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];

			}
			if (secondMax < max && secondMax > arr[i]) {
				secondMax = arr[i];
			}
		}

		System.out.println("maxnumber -> " + max);
		System.out.println("second maxnumber -> " + secondMax);

	}

	private static void binonaccieSeries() {
		// 0 1 1 2 3 5 8 13
		int num = 13;

		int a = 0;
		int b = 1;
		int c;
		System.out.print(" " + a);
		System.out.print(" " + b);
		for (int i = 0; i <= num; i++) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}

	}

	private static void factorials() {
		// 5! = 5*4*3*2*1
		int factorial = 1;
		int num = 5;
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		System.out.println(factorial);

	}

	private static void removeDupCharFromString() {
		String str = "programmiinngg";

		char[] ch = str.toCharArray();

		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		Set<Character> set = new LinkedHashSet();

		for (int i = 0; i < ch.length; i++) {
			set.add(ch[i]);
		}

		for (Character c : set) {
			sb2.append(c);
		}

		System.out.println(sb2); //progamin

		for (int i = 0; i < ch.length; i++) {
			boolean repeated = false;
			for (int j = i + 1; j < ch.length; j++) {

				if (ch[i] == ch[j]) {
					repeated = true;
					break;
				}
			}
			if (!repeated) {
				sb.append(ch[i]);
			}

		}
		System.out.println(sb); //poraming
		
		

	}

}
