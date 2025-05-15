package javaProgramsPkg;



public class MaxOccurrencesFromArray {

	public static void main(String[] args) {
		// Java program to find and print the number with max occurrences - {2, 3, 410, 2, 5, 2, 7, 2, 8, 9, 2, 7, 2, 2}
		
		
		int[] nums = {2, 3, 410, 2, 5,5,5,5,5,55,5,5,5,55,5,5,55,5,5, 2, 7, 2, 8, 9, 2, 7, 2, 2};
		
		int max = 0, element = 0;
		
		
		for(int i=0;i<nums.length;i++) {
			
			int count=0;
			
			for(int j=0;j<nums.length;j++) {
				
				if(nums[i]==nums[j]) {
					count++;
				}
			}
			if(count>max) {
				max = count;
				element = nums[i];
			}
			
		}
		System.out.println("Element is -> "+ element+" Max count is-> " + max );
		
		
		

	}

}
