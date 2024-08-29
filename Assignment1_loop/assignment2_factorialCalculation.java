package Assignment1_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class assignment2_factorialCalculation {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		
		System.out.print("Enter a number: "); 
		
		int input = Integer.parseInt(br.readLine());
		int result = 1;
		
		for (int i = 1; i <= input; i++ ) {
			result *= i;
		}
		
		System.out.println("The factorial of 5 is: "+result);
		
	}
	
}
