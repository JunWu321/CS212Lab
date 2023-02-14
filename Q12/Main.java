//Write a method that has a 2D array of Strings as a parameter that returns the length of the longest String in the array.


public static int findLongestStringLength(String[][] arr) {
    int maxStringLength = 0;

    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            int currentStringLength = arr[i][j].length();
            if (currentStringLength > maxStringLength) {
                maxStringLength = currentStringLength;
            }
        }
    }

    return maxStringLength;
}
