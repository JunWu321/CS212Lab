//Write a static method that has an integer as a parameter and returns the sum of the digits 
//in that number. Then write code in a main method to test it.


package SumOfDigits;

public class Main {
	
	public static int sumOfDigits(int number) {
	    int sum = 0;
	    while (number > 0) {
	        int digit = number % 10;
	        sum += digit;
	        number /= 10;
	    }
	    return sum;
	}

	public static void main(String[] args) {
	    int number = 123;
	    int sum = sumOfDigits(number);
	    System.out.println("The sum of digits in " + number + " is: " + sum);
	}

}
