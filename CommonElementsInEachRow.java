//Given an M x N matrix of integers, find all the common elements
//        that are present in all rows of the given matrix in O(M * N) time.
//if multiple common elements are present in each row, you need to print them in ascending order.

import java.util.*;
public class CommonElementsInEachRow {
    public static void printElementInAllRows(int mat[][]){
        int rows = mat.length;
        int cols = mat[0].length;
        //creating a set to store elements in the first row
        Set<Integer> commonElements=new HashSet<>();
        for(int i=0;i<cols;i++){
            commonElements.add(mat[0][i]);
        }
        //creating another set for the rest of the rows
        Set<Integer> currentRowElements=new HashSet<>();
        for(int i=1;i<rows;i++){
            for(int j=0;j<cols;j++){
                currentRowElements.add(mat[i][j]);
            }
            //retaining elements common in both side
            commonElements.retainAll(currentRowElements);
        }

        Integer[] commonElementArray=commonElements.toArray(new Integer[0]);
        Arrays.sort(commonElementArray);
        for(int i=0;i<commonElementArray.length;i++){
            System.out.print(commonElementArray[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        printElementInAllRows(matrix);
    }
}