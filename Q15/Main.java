//Write a method that has an ArrayList of Booleans as a parameter that returns the number of true elements.



public static int countTrueElements(ArrayList<Boolean> boolList) {
    int count = 0;
    for (boolean bool : boolList) {
        if (bool) {
            count++;
        }
    }
    return count;
}
