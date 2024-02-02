package javaProgramsPkg;

public class FetchOnlyNumersFromString {

	public static void main(String[] args) {
		String str = "B12ar356ni";
		System.out.println(str);
		String numberOnly = str.replaceAll("[^0-9]", "");
		System.out.println(numberOnly);
		
		String charOnly = str.replaceAll("[^a-zA-Z]","");
		System.out.println(charOnly);
//		
//		String removeDigits = str.replaceAll("\\d", "");
//		System.out.println(removeDigits);
		
		StringBuilder sb = new StringBuilder();
		String result = "" ;
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(!Character.isDigit(ch[i])) {
//				sb.append(ch[i]);
				result = result+ch[i];
			}
			
		}
		System.out.println(result);
//		
	}

}
