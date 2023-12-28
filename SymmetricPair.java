//Given an array of pairs of integers, find all the symmetric pairs in it. Two pairs (a, b) and (c, d) are said to
//        be symmetric if b is equivalent to c and a is equivalent to d.
////        For example, (10, 20) and (20, 10) are symmetric. It may be assumed that the first element in each pair is distinct.
//Input Format:
//
//        The first line contains an integer representing the number of pairs.
//
//        The second line contains the elements of each pair. Each pair has two integers’ so, this line contains (number of pairs * 2) elements.
//
//        Output Format:
//
//        The output contains the first occurring pair in each group of symmetric pairs in each line.
import java.util.HashMap;
import java.util.Scanner;
public class SymmetricPair {
    public static  void symmetricpairs(int[][] arr){
        HashMap<String,Integer> pairindex=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            //storing the (i+1)th pair in a new array called pair(arr[i] gives the i'th row)
            int[] pair=arr[i];
            int first=pair[0]; //first element of the pair
            int second =pair[1];//second element of the pair
            //converting the pair to a string for easy comparison
            String pairString=first+" "+second;
            String reverseString=second+" "+first;
            //now checking if reverse string exists in the hashmap(although it be always be false in the first iteration as the hashmap is emmpy in the first iteration)
            if(pairindex.containsKey(reverseString)){
                //if the reverse pair exists, return the pair
                int firstOccuranceIndex=pairindex.get(reverseString);
                int[] firstOccurance=arr[firstOccuranceIndex];
                System.out.println(firstOccurance[0]+" "+firstOccurance[1]);
            }
            //else put the key: pairString and value: the current index in the hashmap(this will always execute in the first iteration
            else
                pairindex.put(pairString, i);

        }
    }
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
//n is the row number of the two dimensional array
int[][] arr=new int[n][2];
//for(int i=0;i<n;i++){
//    for(int j=0;j<2;j++){
//    arr[i][j]=sc.nextInt();
//    }
//}
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < 2 ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
symmetricpairs(arr);
    }
}
