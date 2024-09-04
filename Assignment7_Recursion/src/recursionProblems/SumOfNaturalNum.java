package recursionProblems;

public class SumOfNaturalNum {

	public static void main(String[] args) {

		System.out.println(sumOfNaturalNum(6));

	}

	public static int sumOfNaturalNum(int n) {

		if (n == 1) {
			return 1;
		}

		return n + sumOfNaturalNum(n - 1) ;

	}
}
