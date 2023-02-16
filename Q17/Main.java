//Write a void method that removes all elements in even indices from an ArrayList.

package Try1; //change to your package

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList < Integer > list = new ArrayList < Integer > ();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    System.out.println("Original list: " + list);
    removeEvenIndices(list);
    System.out.println("List after removing even indices: " + list);
  }

  public static < T > void removeEvenIndices(ArrayList < T > list) {
    for (int i = list.size() - 1; i >= 0; i--) {
      if (i % 2 == 0) {
        list.remove(i);
      }
    }
  }

}
