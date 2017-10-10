package main.add;

import java.io.BufferedReader;
import java.io.IOException;


public class Dog {
	
	private String name;
	private Breed breed;
	private int age;
	
	public enum Breed{
		Hound, Terrier, Spaniel
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Dog(String name, Breed breed, int age) {
		super();
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public Dog(BufferedReader sc) throws NumberFormatException, IOException {
		System.out.println("Enter name:");
		String name = sc.readLine();
		System.out.println("Choose breed. 1-Hound 2-Terrier 3-Spaniel");

		int b = Integer.parseInt(sc.readLine());
		switch (b) {
		case 1:
			this.breed = Breed.Hound; 
			break;
		case 2:
			this.breed = Breed.Terrier;
			break;
		case 3:
			this.breed = Breed.Spaniel;
			break;
		default:
			System.out.println("Unknown");
			break;
		}
		System.out.println("Enter age:");
		int age = Integer.parseInt(sc.readLine());
		
		this.name = name;
		this.age = age;
	}
	
}
