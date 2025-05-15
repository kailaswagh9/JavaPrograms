package javaProgramsPkg;

public class FirstAndLastPositionOfANumber {

	public static void main(String[] args) {
		int[] array = {5,7,7,8,8,10};
		int target =8;
		
		int firstIndex=-1;
		int lastIndex = -1;
		
		for(int i=0;i<array.length;i++) {
			
			if(array[i]==target && firstIndex==-1) {
				firstIndex = i;
			}
			if(array[i]==target && firstIndex!=-1) {
				lastIndex = i;
			}
			
			
			
		}
		System.out.println(firstIndex);
		System.out.println(lastIndex);
	}
	

}
