//Write a method that has an ArrayList of Strings and a String as parameters. It should remove 
//all copies of that String from the list, then return the number of copies removed.


public static int removeCopies(ArrayList<String> stringList, String stringToRemove) {
    int count = 0;
    for (int i = 0; i < stringList.size(); i++) {
        if (stringList.get(i).equals(stringToRemove)) {
            stringList.remove(i);
            count++;
            i--; // To compensate for the removed element
        }
    }
    return count;
}
