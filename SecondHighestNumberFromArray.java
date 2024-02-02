package javaProgramsPkg;

public class SecondHighestNumberFromArray {

	public static void main(String[] args) {
		
		//unsorted array
		int num[]  = {1,9,5,55,8,-1,3,54,55,55,60};
		int numLenth= num.length;
		
		int highest = Integer.MIN_VALUE;  // constant holding the minimum -MIN_VALUE : -2147483648 
		int secondHighest = Integer.MIN_VALUE;
		
		
		for(int i=0;i<numLenth;i++) {
			if(num[i]>highest) {
				secondHighest = highest;
				highest = num[i];
			}
			if(num[i] <highest && num[i]> secondHighest) {
				secondHighest = num[i];
			}
		}
		System.out.println("Second Highest Value is -> " + secondHighest);
		System.out.println("Highest Value is -> " + highest);

		
	}

}
