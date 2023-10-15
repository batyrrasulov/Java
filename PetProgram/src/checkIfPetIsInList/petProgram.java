package checkIfPetIsInList;

import java.util.*;

public class petProgram {
	
	public static String petTypePrint;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first letter of your pet: ");
		int i = 0;
		while (i == 0) {
			char userInput = input.next().toLowerCase().charAt(0);
			String[] values = petLetter(userInput, i);
			i = Integer.parseInt(values[1]);
			petTypePrint = values[0];
		}
		System.out.println("Enter the name of your " + petTypePrint + ":");
		String userName = input.next();
		String firstLetter = userName.substring(0, 1).toUpperCase();
		String name = firstLetter.concat(userName.substring(1, userName.length()));
		System.out.println("How old is " + name + "?");
		int age = input.nextInt();
		System.out.println("How much does " + name + " weigh in pounds?");
		double weight = input.nextDouble();
		System.out.printf("You have inputed that you have a " + petTypePrint +" that is " + age + " years old, weighs %.2f pounds, and whose name is " + name + ".%n", weight);
		System.out.println("This program has been terminated.");
	}
	public static String[] petLetter(char userInput, int i) {
		Queue<Character> pet = new LinkedList<>();
		pet.offer('d');
		pet.offer('c');
		pet.offer('f');
		pet.offer('r');
		pet.offer('b');
		String[] values = new String[2];
		if (pet.contains(userInput)) {
			values[1] = "1";
		}
		else {
			System.out.print("This is not a valid answer. Please enter a valid answer: ");
			values[1] = "0";
		}
		values[0] = identifyPet(userInput);
		return values;
	}
	public static String identifyPet(char userInput) {
		String pet;
		if (userInput == 'd') {
			pet = "dog";
			return pet;
		}
		else if (userInput == 'c') {
			pet = "cat";
			return pet;
		}
		else if (userInput == 'f') {
			pet = "fish";
			return pet;
		}
		else if (userInput == 'r') {
			pet = "reptile";
			return pet;
		}
		else {
			pet = "bird";
			return pet;
		}
	}
}
