package javaProgramsPkg;

public class PrintNumWithoutUsingLoop {

	public static void main(String[] args) {
		printnum(1);
	}

	private static void printnum(int i) {
		if(i<=50) {
			System.out.println(i);
			i++;
		printnum(i);
		}
	}

}
