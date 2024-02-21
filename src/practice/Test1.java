package practice;

public class Test1 {
	     // Example -> 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407. 
	    //153: 1^3 + 5^3 + 3^3 = 1 + 125+ 27 = 153
        //125: 1^3 + 2^3 + 5^3 = 1 + 8 + 125 = 134 (Not an Armstrong Number)
 		//1634: 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1643
	public static void main(String[] args) {
		
		int num=1634;
		int digits=0;
		int temp=0;
		int sum=0;
		int last=0;
		
		
		temp=num;
		while(temp>0) {
			temp = temp/10;
			digits++;
		}
		System.out.println(digits);
		
		temp=num;
		
		while(temp>0) {
			last = temp%10;
			sum = (int) (sum+ Math.pow(last, digits));
			temp = temp/10;
		}
		
		System.out.println(sum);
		
		

	}

}
