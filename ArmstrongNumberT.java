package javaProgramsPkg;

public class ArmstrongNumberT {
	//1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634 is an armstrong number
	//153: 1^3 + 5^3 + 3^3 = 1 + 125+ 27 = 153
	public static void main(String[] args) {	
		int number=370,temp=0,digits=0,last=0,sum=0;
	
		temp=number;
		// to check digits in number.
		while(temp>0) {
			temp = temp/10;
			digits++;
		}
		temp=number;
	
		while(temp>0) {
			//determines the last digit from the number  
			last = temp%10;
			//calculates the power of a number up to digit times and add the resultant to the sum variable
			sum+= Math.pow(last, digits);
			//removes the last digit   
			temp = temp/10;
		}
		if(number==sum) 
			System.out.println( number + " Armstrong number");
		else
			System.out.println( number + " Not Armstrong number");
	}

}
