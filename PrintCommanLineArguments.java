package javaProgramsPkg;

public class PrintCommanLineArguments {

	public static void main(String[] args) {
		if(args.length > 0) {
			System.out.println("The command line " + "arguments are : ");
			for(String val:args) {
				System.out.println(val);
			}
		}	
			else 
				System.out.println("No comman line "+"arguments found.");
			

	}

}
