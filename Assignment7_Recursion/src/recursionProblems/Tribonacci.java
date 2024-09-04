package recursionProblems;

public class Tribonacci {

	public static void main(String[] args) {

		System.out.println(tribonacci(6));

	}

	public static int tribonacci(int n) {

		if (n <= 1) {
			return n;
		}
		
		if (n == 2) {
			return 1;
		}

		return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n-3);

	}
}
