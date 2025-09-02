package br.edu.ibmec.oop.lessons.ex07.formattedmath;

import java.util.Scanner;

public class FromattedMah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter x:");
		x = sc.nextInt();
		
		System.out.printf("The number is: %d\n", x);
		System.out.printf("Square root is x = %f\n", Math.sqrt(x));
		System.out.printf("Square root is x = %.1f\n", Math.sqrt(x));
		System.out.printf("Square root is x = %.2f\n", Math.sqrt(x));
		System.out.printf("Square root is x = %.3f\n", Math.sqrt(x));
		
		sc.close();
	}

}
