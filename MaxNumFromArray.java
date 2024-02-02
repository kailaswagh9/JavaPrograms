package javaProgramsPkg;

public class MaxNumFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {21,98,13,99,34};
		
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		System.out.println(max);
		
	
		revNum(7891);
		digits(48514);
		for(int i=0;i<=1000;i++) {
			armSt(i);	
		}
		
	}

	private static void armSt(int num) {
		int temp=0,digits=0,rem=0,result=0;
		temp=num;
		while(temp!=0) {
			temp = temp/10;
			digits++;
		}
		temp=num;
		while(temp!=0) {
			rem = temp%10;
			result = (int)result + (int)Math.pow(rem, digits);
			temp =temp/10;
		}
		
		if(result==num) {
			System.out.println(num + " armstrong number");
		}
//		else
//			System.out.println(num + " Not armstrong number");
		
	}

	private static void digits(int num) {
		int temp=0,digits=0;
		temp=num;
		while(temp!=0) {
			temp = temp/10;
			digits++;
		}
		System.out.println(digits);
	}

	private static void revNum(int num) {
		int temp=0;int rem=0; int res=0;
		temp=num;
		while(temp!=0) {
			rem = temp%10;
			res = res*10 + rem;
			temp = temp/10;
			
		}
		System.out.println(res);
		
	}
	
	

}
