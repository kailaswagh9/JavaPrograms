package javaProgramsPkg;

public class ConsectiveOnes {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 0, 0, 1, 1, 1,1,1,1, 0, 0, 1, 1, 1, 1, 1 };

//		Approach1:
//		int maxCount=0;
//		int count=0;
//		for(int i=0;i<array.length;i++) {
//			
//			if(array[i]==1) {
//				count++;
//			}else {
//				count=0;
//			}
//			maxCount = Math.max(maxCount, count);
//		}
//		System.out.println(maxCount);
		
		
//		Approach2:
		
	
		int count = 0;
		int max = 0;

		for (int i = 0; i < nums.length; i++) {
			while( i < nums.length && nums[i] ==1) {
				count++;
				i++;
			}

			if(max< count) {
				max = count;
			}

			count=0;

		}
		System.out.println(max);
	}

}
