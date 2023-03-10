package arraylist_ex;
import java.util.ArrayList;

public class CreateArrayListExample {

    public static void main(String[] args) {
        // Creating an ArrayList of String
        ArrayList<String> animals = new ArrayList<>();

        // Adding new elements to the ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        for (int i=0; i<animals.size(); i++) {
        	System.out.println(animals.get(i));
        }

        // Adding an element at a particular index in an ArrayList
        animals.add(2, "Elephant");
        animals.remove(0);

        for (int i=0; i<animals.size(); i++) {
        	System.out.println(animals.get(i));
        }

    }
}
