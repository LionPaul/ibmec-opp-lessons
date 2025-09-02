package br.edu.ibmec.oop.lessons.ex04.interactivevariabledeclaration;
import java.util.Scanner;

public class InteractiveVariableDeclaration {
	
	public static void main (String[] args) {
		
		/*
		 In some cases, it may need to be added. 
		 It's simply a matter of IDE configuration that standardizes some issues. 
		 If the code is broken, try removing this comment.
		 */
		//Locale.setDefault(Locale.US);
		String name;
		int age;
		double weight;
		char gender;
	
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter name");
		name = sc.nextLine();
		System.out.print("Enter age: ");
		age = sc.nextInt();
		System.out.print("Enter weight: ");
		weight = sc.nextDouble();
		System.out.print("Enter gender: ");
		gender = sc.next().charAt(0);
		
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Weight: " + weight);
		System.out.println("Gender: " + gender);
		sc.close();
	
	}
}
