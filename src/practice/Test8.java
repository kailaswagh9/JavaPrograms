package practice;

public class Test8 {

	public static void main(String[] args) {
		
		String st = "Kai87897";
		String onlyNum = st.replaceAll("[^0-9]", "");
		String OnlyChar = st.replaceAll("[^a-z and ^A-Z]", "");
		System.out.println(onlyNum);
		System.out.println(OnlyChar);
//		System.out.println(removeNum(st));
	}
	
	public static String removeNum(String st) {
		String res= "";
		char[] ch = st.toCharArray();
		
		for(char c: ch) {
			if(!Character.isDigit(c))
			{
				res = res+c;
			}
		
	}
		return res;

}
}
