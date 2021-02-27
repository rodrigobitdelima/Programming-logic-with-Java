
public class Main {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		String lowerCase = original.toLowerCase();
		String upperCase = original.toUpperCase();
		String trim = original.trim();
		String subString1 = original.substring(2);
		String subString2 = original.substring(2,9);
		String replace1 = original.replace('a', 'x');
		String replace2 = original.replace("abc", "xy");
		int indexOf = original.indexOf("bc");
		int lastIndexOf = original.lastIndexOf("bc");
		
		System.out.println("Original: -" + original + "-");
		System.out.println("Lower case: -" + lowerCase + "-");
		System.out.println("Upper case: -" + upperCase + "-");
		System.out.println("Trim: -" + trim + "-");
		System.out.println("Substring 1: -" + subString1 + "-");
		System.out.println("SubString 2 : -" + subString2 + "-");
		System.out.println("Replace 1: -" + replace1 + "-");
		System.out.println("Replace 2: -" + replace2 + "-");
		System.out.println("Index Of: -" + indexOf + "-");
		System.out.println("Last Index Of: -" + lastIndexOf + "-");
		
		String s = "potato apple lemon orange";
		String[] vect = s.split(" ");
		String w1 = vect[0];
		String w2 = vect[1];
		String w3 = vect[2];
		
		System.out.println("-" + w1 + "-");
		System.out.println("-" + w2 + "-");
		System.out.println("-" + w3 + "-");
		System.out.println("-" + vect[3] + "-");
	}

}
