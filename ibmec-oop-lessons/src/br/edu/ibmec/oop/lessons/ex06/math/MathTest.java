package br.edu.ibmec.oop.lessons.ex06.math;
import java.util.Scanner;

public class MathTest {


		public static void main(String[] args) {
			
			int x, y, z;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter x: ");
			x = sc.nextInt();
			System.out.print("Enter y: ");
			y = sc.nextInt();
			System.out.print("Enter z: ");
			z = sc.nextInt();
			
			System.out.println("Greater between x and y: " + Math.max(x,y));
			System.out.println("Smallest between x and y: " + Math.min(x,y));
			System.out.println("square root of x = " + Math.sqrt(x));
			System.out.println("The absolute value of z = " + Math.abs(z));
			System.out.println("Value of x to the power of y = " + Math.pow(x,y));
			System.out.println("Valor aleatório: " + Math.random());
			
			sc.close();
			
		}
	}

