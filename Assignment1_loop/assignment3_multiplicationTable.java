package Assignment1_loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class assignment3_multiplicationTable {
	
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		
		System.out.print("Enter a number: "); 
		
		int input = Integer.parseInt(br.readLine());
		
		System.out.println("Multiplication Table for " + input + ":");
		
		for (int i = 1; i <= 10; i++) {
			
			int result = input * i;
			System.out.println(input + "*" + i + "=" + result );
			
		}
			
	}

}
