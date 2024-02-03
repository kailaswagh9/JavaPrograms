package javaProgramsPkg;

public class SmallestAndSecondSmallestNumberFromArray {

	public static void main(String[] args) {
		int[] num = { 3,3, 9,9,45, 67, 88,88, 99,99,108};
		int small = Integer.MAX_VALUE;
		int secSmall = Integer.MAX_VALUE;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]<small) {
				secSmall = small;
				small = num[i];
			}
			
			if(num[i]>small && num[i]<secSmall) {
				secSmall = num[i];	
			}
		}
		System.out.println("Smallest- > " +small);
		System.out.println("Second Smallest- > " + secSmall);
		
		
	}

}
