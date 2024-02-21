package practice0224;

public class PrimeNumPrograms {

//	Prime number in Java: Prime number is a number that is greater than 1 and divided by 1 or itself only.
//	In other words, prime numbers can't be divided by other numbers than itself or 1.
	
	public static void main(String[] args) {
//		int num = 17;
//		System.out.println(primeNumber(num));
		for(int i=0;i<=100;i++) {
			if(primeNumber(i)) {
				System.out.println("Prime Number ->> " + i);
			}
		}
		

	}
	public static boolean primeNumber(int num) {
//		num=13;
		int count=0;
		
		if(num>1) {
			for(int i =1; i<=num;i++) {
				if(num%i==0) {
					count++;
				}
			}
			if(count==2) {
				return true;
			}else {
				return false;
			}
			
		}
		return false;
		
	}
	
	
	

}
