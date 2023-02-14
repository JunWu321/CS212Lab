//Write a method that has a square 2D array as a parameter that returns a 2D array of the same size, but rotated 90 degrees clockwise.


public static int[][] rotateMatrixClockwise(int[][] arr) {
    int n = arr.length;
    int[][] rotated = new int[n][n];

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            rotated[i][j] = arr[n - j - 1][i];
        }
    }

    return rotated;
}
