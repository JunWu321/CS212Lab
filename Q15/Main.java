public static int countTrueElements(ArrayList<Boolean> boolList) {
    int count = 0;
    for (boolean bool : boolList) {
        if (bool) {
            count++;
        }
    }
    return count;
}
