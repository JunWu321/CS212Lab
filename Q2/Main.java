//Write a program that asks the user for their name, then says Hello with their name.

package HelloWorld;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is your name?");
		String a=scanner.next();
		String b=scanner.next();
		System.out.println("Hello " + a +' ' + b);
	}
}
