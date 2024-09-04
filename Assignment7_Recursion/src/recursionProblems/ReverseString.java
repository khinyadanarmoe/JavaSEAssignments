package recursionProblems;

public class ReverseString {

	public static void main(String[] args) {

		System.out.println(reverseString("Hello"));

	}

	public static String reverseString(String str) {

		if (str.length() <= 1) {
			return str;
		}else {
			
			int mid = str.length() / 2;
			String first = str.substring(0,mid);
			String last = str.substring(mid);
			
			return reverseString(last) + reverseString(first) ;
		}
		

	}
}
