package Dec15_19;

import java.util.Stack;

public class NextGreatestElement {

    public static void main(String[] args) {
        int arr[] = {5, 4, 8, 6, 11, 9, 3};
        nextGreatestElem(arr);
    }

    //using O(n2)
    private static void nextGreatestElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    System.out.println(arr[j]);
                    break;
                }
            }
        }
    }

    //o(n)
    private static void nextGreatestElem(int[] arr) {
        if (arr == null || arr.length == 0) return;
        if (arr.length == 1) {
            System.out.println(arr[0]);
            return;
        }
        Stack stack = new Stack();
        stack.push(arr[0]);
        for (int i = 1; i < arr.length - 1; i++) {
            int j = (int) stack.peek();
            if (j < arr[i]) {
                while (!stack.isEmpty()) {
                    System.out.println("Greatest element after " + stack.pop() + " is " + arr[i]);
                }
            }
            stack.push(arr[i]);
        }

        while (!stack.empty()) {
            int j = (int) stack.pop();
            System.out.println("Greatest element after " + j + " is " + j);
        }
    }


}
