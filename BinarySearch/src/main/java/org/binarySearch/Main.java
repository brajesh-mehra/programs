package org.binarySearch;

public class Main {

    // Using loop
    static void binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > array[mid]) {
                start = mid + 1;
            } else if (target < array[mid]) {
                end = mid - 1;
            } else {
                System.out.format("the index of %s is : %s", target, mid);
                return;
            }
        }

        System.out.println("No result found");
    }

    //Using recursion

    static int BS(int[] array, int target, int start, int end) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > array[mid]) {
                return BS(array, target, mid + 1, end);
            } else if (target < array[mid]) {
                return BS(array, target, start, mid - 1);
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Binary Search");

        // find the index of 12
        int[] array = {-1, 5, 6, 7, 12};
        int target = 7;
        binarySearch(array, target);

        System.out.println("\nFind index using recursion of "+ target + " is "+ BS(array, target, 0, array.length-1));
    }
}