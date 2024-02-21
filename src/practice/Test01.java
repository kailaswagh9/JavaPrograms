package practice;

import java.util.HashMap;

public class Test01 {

	public static void main(String[] args) {
//		String st= "kailas Ramdas Wagh wagh wagh Kailas Ramdas Ramdas bhagyashree";
//		countTotalWords(st);
		
//		int num=20;
//		for(int i=0;i<=num;i++) {
//		if(isPrimeNum(i)) {
//			System.out.println( i+ " its a prime number");
//		}else {
//			System.out.println(i +" Not a prime number");
//		}}
		
//		int num=200;
//		for(int i=0;i<=num;i++) {
//		if(isPalindrom(i)) {
//			System.out.println(i+ " Panlindrome num");
//		}else {
//			System.out.println(i+" Not panlindrome num");
//		}
//		}
		

		int num=10000;
		for(int i=0;i<=num;i++) {
		if(isArmStrong(i)) {
			System.out.println(i+ " ArmStrong num");
		}else {
//			System.out.println(i+" Not ArmStrong num");
		}
		}
		
	}
	
	public static boolean isArmStrong(int num) {
		int res = 0; int rem;int temp;int digits = 0;
		
		temp = num;
		
		while(temp!=0) {
			temp = temp/10;
			digits++;
		}
		temp=num;
		while(temp!=0) {
			rem = temp%10;
			res =(int)( res + Math.pow(rem, digits));
			temp =temp/10;
		}
		if(num==res) {
			return true;
		}
		
		
		return false;
	}
	
	
	
	public static boolean isPalindrom(int num) {
		int temp=0;int res = 0; int rem= 0;
		
		temp = num;  // num=567
		while(temp!=0) {
			rem = temp%10;
			res= res*10+rem;
			temp = temp/10;
		}
		if(res==num) {
			return true;
		}
		
		
		return false;
	}
	
	
	public static boolean isPrimeNum(int num) {
		int count=0;
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					count++;
				}
			}
			if(count==2) {
				return true;
			}
			
		}else {
			return false;
		}
		
		return false;
	}
	
	
	
	
	public static void countTotalWords(String st) {
		String lSt = st.toLowerCase();
		String[] arr =lSt.split(" ");
		HashMap<String,Integer> hmap = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			if(hmap.containsKey(arr[i])) {
				int count = hmap.get(arr[i]); 
				hmap.put(arr[i], count+1);
			}else {
				hmap.put(arr[i], 1);
			}
			
		}
		System.out.println(hmap);
		
	}

}
