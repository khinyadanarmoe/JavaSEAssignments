package recursionProblems;

public class SumOfDigit {

	public static void main(String[] args) {

		System.out.println(sumOfDigit(123));

	}

	public static int sumOfDigit(int n) {

		if (n < 10) {
			return n;
		}else {
			int digit = n / 10;
			int lastDigit = n % 10;
			
			return lastDigit + sumOfDigit(digit) ;
		}
		

	}
}
