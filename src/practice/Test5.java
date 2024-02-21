package practice;

public class Test5 {

	public static void main(String[] args) {
		
	
	int arr[] = {2,3,65,77,99,99,87,87};
	int small = Integer.MAX_VALUE;
	int secSmall = Integer.MAX_VALUE;
	
	for(int i=0;i< arr.length;i++) {
		if(arr[i]<small) {
			secSmall = small;
			small = arr[i];
		}
		
		if(arr[i]>small && arr[i]<secSmall) {
			secSmall= arr[i];
		}
	}
	
	
	System.out.println("second small " + secSmall);
	System.out.println(" small " + small);
	}
}
