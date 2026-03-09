package com.searchlibrary;

/**
 * Implements linear search algorithm.
 */
public class LinearSearch {

    /**
     * Searches for the target in the array using linear search.
     * @param arr the array to search
     * @param target the target value
     * @return the index of the target if found, otherwise -1
     */
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}