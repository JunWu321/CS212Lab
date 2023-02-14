//Write a method that has a square 2D array as the parameter. The method returns a 1D array containing all the elements from 
//the diagonal from the top left to the bottom right of the 2D array.


public static int[] getDiagonalElements(int[][] arr) {
    int n = arr.length;
    int[] diagonal = new int[n];

    for (int i = 0; i < n; i++) {
        diagonal[i] = arr[i][i];
    }

    return diagonal;
}
