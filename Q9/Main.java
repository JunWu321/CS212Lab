//Given a string of even length, return the first half. 
//So the string "WooHoo" yields "Woo".
 

package StringQuestion;

public class Main {

	public static String firstHalf(String str) {
	    int length = str.length();
	    return str.substring(0, length / 2);
	}
	
	
	public static void main(String[] args) {
	 System.out.println(firstHalf("WooHoo"));

	}

}
