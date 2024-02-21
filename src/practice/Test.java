package practice;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		String userRes=null;
	
		
		while(userRes!="n") {
			System.out.println(" Check prime number -> Enter Y or N ");
			Scanner sc1 = new Scanner(System.in);
			userRes = sc1.nextLine();
			switch (userRes) {
			case "y":
				checkPrimeNumber();
				break;
			case "n":
				System.out.println("Terminated");
				System.exit(0);
			default:  System.out.print("Enter a valid input Y or N"); 
				break;
			}
		}
		

	}

	public static void checkPrimeNumber() {
		System.out.print("Enter any number  -> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("Prime Number");
			} else {
				System.out.println("Not a prime number. ");
			}

		} else {
			System.out.println("Not a prime number. ");
		}

		System.out.println(count);

	}

}
