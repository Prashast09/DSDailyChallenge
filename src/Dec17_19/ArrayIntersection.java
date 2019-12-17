package Dec17_19;

import java.util.*;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 6, 3, 2};
        int[] arr2 = {2, 3, 5};
        ArrayList<Integer> arr = arrayIntersection(arr1,arr2);
        for(Integer elem : arr){
            System.out.println(elem);
        }
    }

    public static ArrayList<Integer> arrayIntersection(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> arrayIntersection = new HashMap<>();
        for (int elem : arr1) {
            Integer count = (Integer) arrayIntersection.get(elem);
            if (count == null) {
                arrayIntersection.put(elem, 1);
            }
        }

        for (int elem : arr2) {
            Integer count = (Integer) arrayIntersection.get(elem);
            if (count != null) {
                arrayIntersection.put(elem, count + 1);
            }
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for (Integer elem : arrayIntersection.keySet()) {
            if (arrayIntersection.get(elem) == 2) {
                arr.add(elem);
            }
        }
        return arr;
    }
}
