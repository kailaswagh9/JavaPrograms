package javaProgramsPkg;

public class PrimeNumber {

//	Prime number in Java: Prime number is a number that is greater than 1 and divided by 1 or itself only.
//	In other words, prime numbers can't be divided by other numbers than itself or 1.
//	For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
	public static void main(String[] args) {
		int num=13,count=0;
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("Its Prime number");
			}else {
				System.out.println("Not Prime number");
			}
			
		}else {
			System.out.println("Not prime number");
		}
		
		
	}

}
