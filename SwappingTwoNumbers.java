package javaProgramsPkg;

public class SwappingTwoNumbers {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("before swapping values are .. " + a + "  " + b);
		// Login1 third variable
		/*
		 * int temp =a; a=b; b=temp;
		 */
//		 Login2 + and - operator -without using third variable
		/*
		 * a = a + b; //10+20= 30 b = a - b; //30-20= 10 a = a - b; //30-10= 20
		 */
		// Logic3 * and / here a & b values should not be zero
		/*
		 * a = a * b; // 200 b = a / b; // 10 a = a / b; // 20
		 */
		// login4 single statement
		b = a + b - (a = b);
		System.out.println("After swapping values are .. " + a + "  " + b);

		numberSwap(40, 60);
	}

	public static void numberSwap(int a1, int b1) {
		int a = a1;
		int b = b1;
		System.out.println("before swapping " + a + " " + b);
//		b= a+b -(a=b);   //first logic

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after  swapping " + a + " " + b);

	}

}
