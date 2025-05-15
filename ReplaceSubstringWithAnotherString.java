package javaProgramsPkg;

public class ReplaceSubstringWithAnotherString {

	public static void main(String[] args) {
		String str = "Learn, Lead and Succeed in DevLabsAlliance";
		String toBeReplaced = "in";
		String toReplacedWith = "with";
		String[] astr = str.split(toBeReplaced);
		StringBuffer strb = new StringBuffer();
		for ( int i = 0; i <= astr.length-1; i++ ) {
			strb = strb.append( astr[i] );
			if (i != astr.length-1) {
				strb = strb.append(toReplacedWith);
			}
		}

		System.out.println(strb);
	}
}