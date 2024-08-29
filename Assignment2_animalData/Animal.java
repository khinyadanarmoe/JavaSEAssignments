package Assignment2_animalData;

public class Animal {

	public static int animalCount = 0;
	public String name;
	public int age;
	public String species;

	public Animal(String name, int age, String species) {
		animalCount++;
		this.name = name;
		this.age = age;
		this.species = species;
	}

	public void display() {
		
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Species: " + species + "\n");

	}

}
