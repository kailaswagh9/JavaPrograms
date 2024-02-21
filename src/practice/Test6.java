package practice;

public class Test6 {

	public static void main(String[] args) {
		String str = "Kaila459W0";
		String numString = str.replaceAll("[^0-9]", "");
		System.out.println(numString);
		
		StringBuilder sb = new StringBuilder();
		
		char[] ch = str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(!Character.isDigit(ch[i])) {
				sb.append(ch[i]);
			}
		}
		System.out.println(sb);
	}

}
