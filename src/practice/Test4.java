package practice;

public class Test4 {

	public static void main(String[] args) {
		
		int arr[] = {2,3,65,77,99,99,87,87};
		int highest = Integer.MIN_VALUE;
		int secHighest  = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>highest) {
				secHighest = highest;
				highest = arr[i];
			}
			
			if(arr[i]<highest && arr[i]>secHighest) {
				secHighest = arr[i];
			}
			
		}
		
		System.out.println("second high " + secHighest);
		System.out.println(" highest " + highest);
		
		
	}
}
