//Most Frequent Element
//Given an array of integers, find the most frequent element in the array.
//        If multiple elements appear a maximum number of times, print any
//        one of them. Return -1 in case there are no elements.
//        Sample input 1:
//        5
//        7 8 9 4 9
//
//        Sample output 1:
//        9

import java.util.*;

public class MostFrequentElement {

    public static int mostFrequentElement(int[] arr) {
        if(arr.length==0)
            return -1;
        else {
            // Write code here
            Map<Integer, Integer> hm = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                if (hm.containsKey(arr[i])) {
                    hm.put(arr[i], hm.get(arr[i]) + 1);
                } else
                    hm.put(arr[i], 1);

            }
            Set<Integer> values = new HashSet<>(hm.values());

            int highestValue = HighestElement(values);
            int key = findKeyByValue(hm, highestValue);
            return key;
        }
    }
    public static int HighestElement(Set<Integer> set){
        int max =Integer.MIN_VALUE;
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            int current=it.next();
            if(current>max)
                max=current;
        }
        return max;
    }
    public static int findKeyByValue(Map<Integer, Integer> map, int value) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == value) {
                return entry.getKey();
            }
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(mostFrequentElement(arr));
    }
}