//Write a program that asks the user for their name, then says Hello with their name.
//If you get any warnings about wrapping your scanner in a try/catch block, we will cover this later. For purposes of this lab, it is fine.

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
