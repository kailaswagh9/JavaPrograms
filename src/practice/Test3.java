package practice;

public class Test3 {

	public static void main(String[] args) {
		int num[]  = {1,9,5,55,8,-1,3,54,55,55,60};
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		for(int i=0;i<num.length;i++) {
			if(num[i]>highest) {
				secondHighest = highest;
				highest = num[i];
			}
			if(num[i]<highest && num[i]>secondHighest) {
				secondHighest = num[i];
			}
		}
		System.out.println(secondHighest);
		System.out.println(highest);

	}

}
