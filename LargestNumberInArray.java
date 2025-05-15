package javaProgramsPkg;

public class LargestNumberInArray {

	public static void main(String[] args) {
		int[] arr={29,27,15,9,17,4,23,2,-1,2,0};
		
		
		maxAndSecondMax(arr);
		smallAndSecSmall(arr);
		
		

	}

	private static void smallAndSecSmall(int[] arr) {
		int smallNumber = Integer.MAX_VALUE;
		int secSmallNumber = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if( arr[i] < smallNumber) {
				secSmallNumber = smallNumber;
				smallNumber = arr[i];
			}
			if(smallNumber < arr[i] && secSmallNumber > arr[i]) {
				secSmallNumber = arr[i];
			}
		}
		System.out.println(smallNumber + " secMax-> "+ secSmallNumber);
		
	}

	private static void maxAndSecondMax(int[] arr) {
		int maxNumber = Integer.MIN_VALUE;
		int secMaxNumber = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if( arr[i] > maxNumber) {
				secMaxNumber = maxNumber;
				maxNumber = arr[i];
			}
			if(maxNumber > arr[i] && secMaxNumber < arr[i]) {
				secMaxNumber = arr[i];
			}
		}
		System.out.println(maxNumber + " secMax-> "+ secMaxNumber);
		
	}

}
