package recursionProblems;

public class PowerOfNum {

	public static void main(String[] args) {

		System.out.println(doublepower(2,3));

	}

	public static double doublepower(double base, int exponent) {

		if (exponent == 0) {
			return 1;
		}
		if (exponent == 1) {
			return base;
		} else {

			return base * doublepower(base, exponent -1 ) ;
		}

	}
}
