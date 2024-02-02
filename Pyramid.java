package javaProgramsPkg;

public class Pyramid {

	public static void main(String[] args) {
		
//		1
//		23
//		456
//		78910
		int num=1;
		
		for(int i=0;i<5;i++) {
			
			for(int j=0;j<=i;j++) {
				System.out.print(num+ " ");
				num=num+1;

			}
			System.out.println(" ");
		}

	}

}
