package br.edu.ibmec.oop.lessons.ex05.casehandling;

import java.util.Scanner;

public class CaseHandling {
	
	public static void main (String[] args) {
		
		String text;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter text: ");
		text = sc.nextLine();
		
		System.out.println("Text size:" + text.length());
		System.out.println("Capital text: " + text.toUpperCase());
		System.out.println("Lowercase text: " + text.toLowerCase());
		System.out.println("First position of the letter l: " + text.indexOf('l'));
		System.out.println("Text is equals to ibmec: " + text.equals("ibmec"));
		
		sc.close();
		
	}

}
