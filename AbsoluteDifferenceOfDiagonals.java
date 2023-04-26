
// Given a matrix Grid[][] of size NxN. Calculate the absolute difference between the sums of its diagonals
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int a[][] = {
                { 1, 2, 5 },
                { 4, 8, 6 },
                { 7, 8, 6 },
        };
        System.out.println(diagonalSumDifference(3, a));

    }

    static int diagonalSumDifference(int N, int[][] Grid) {
        // code here
        int d1 = 0;
        int d2 = 0;
        for (int i = 0; i < N; i++) {
            d1 = d1 + Grid[i][i];
        }
        int j = 0;
        int k = N - 1;
        while (k >= 0 && j < N) {
            d2 = d2 + Grid[j][k];
            j++;
            k--;
        }
        int result = d1 - d2;
        if (result >= 0) {
            return result;
        } else
            result = result * (-1);
        return result;
    }

}