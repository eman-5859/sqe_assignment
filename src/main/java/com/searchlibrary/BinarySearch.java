package com.searchlibrary;

/**
 * Implements iterative binary search algorithm.
 * Assumes the array is sorted in ascending order.
 */
public class BinarySearch {

    /**
     * Searches for the target in the sorted array using binary search.
     * @param arr the sorted array to search
     * @param target the target value
     * @return the index of the target if found, otherwise -1
     */
    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}