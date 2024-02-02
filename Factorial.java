package javaProgramsPkg;

public class Factorial {
	//	4! = 4*3*2*1 = 24  
	//	5! = 5*4*3*2*1 = 120  
	public static void main(String[] args) {
		int num=5,factorial = 1;
		for(int i=1;i<=num;i++) {
			factorial = factorial*i;
		}
		System.out.println(factorial);

	}

}
