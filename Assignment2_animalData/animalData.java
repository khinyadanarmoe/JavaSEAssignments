package Assignment2_animalData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class animalData {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		Animal[] animalArray = new Animal[100];

		String input;

		do {

			Animal animal = dataInput();
			animalArray[Animal.animalCount] = animal;
			
			System.out.print("Do you want to enter another animal? (yes/no): ");
			input = br.readLine();
		} while (input.equalsIgnoreCase("yes"));

		for (int i = 1; i <= Animal.animalCount; i++) {
			System.out.println("Animal "+ i + ":");
			animalArray[i].display();
		}
		
	}
	

	
	public static Animal dataInput() throws IOException {

		System.out.print("Enter animal name: ");
		String name = br.readLine();
		System.out.print("Enter animal age: ");
		int age = Integer.parseInt(br.readLine());
		System.out.print("Enter animal species: ");
		String species = br.readLine();

		Animal animal = new Animal(name, age, species);

		return animal;
	}

}
