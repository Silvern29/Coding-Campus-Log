package at.redlinghaus;

public class Main {
    public static int avg(int[][] arr, int n, int m) {
        int tmp = 0;
        for (int i = n-1; i < n+2; i++) {
            for (int j = m-1; j < m+2; j++) {
                tmp += arr[i][j];
            }
        }
        return tmp/9;
    }

    public static int[][] boxBlur(int[][] image) {
        int[][] result = new int[image.length-1][image[0].length-1];
        for(int i = 0; i < image.length-1; i++) {
            for(int j = 0; j < image[0].length-1; j++) {
                result[i][j] = avg(image, i+1, j+1);
            }
        }
        return result;

    }

    public static void main(String[] args) {
        boxBlur([[7, 4, 0, 1], [5, 6, 2, 2], [6, 10, 7, 8], [1, 4, 2, 0]]);

    }
}
