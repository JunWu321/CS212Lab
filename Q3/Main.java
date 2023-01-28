//Write a program that asks the user for three integers, then outputs their sum in a sentence.


package HelloWorld;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter 3 integers:");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		int total=a+b+c;
		System.out.println("Your total is " + total);
	}
}
