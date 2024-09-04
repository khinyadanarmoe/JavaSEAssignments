package recursionProblems;

public class Str2IntConversion {

	public static void main(String[] args) {

		System.out.println(stringToInt("123"));

	}

	public static int stringToInt(String str) {

		if (str.length() < 1) {
			return 0;
		}
		else {
			int digit = (int) str.charAt(0) - '0';
			digit = digit * (int)Math.pow(10, str.length()-1);
			
			return digit + stringToInt(str.substring(1));
		}
		

		

	}
}
