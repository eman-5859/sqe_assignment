package com.searchlibrary;

import java.lang.Math;

/**
 * Implements jump search algorithm.
 * Assumes the array is sorted in ascending order.
 */
public class JumpSearch {

    /**
     * Searches for the target in the sorted array using jump search.
     * @param arr the sorted array to search
     * @param target the target value
     * @return the index of the target if found, otherwise -1
     */
    public static int search(int[] arr, int target) {
        int n = arr.length;
        int blockSize = (int) Math.sqrt(n);
        int step = blockSize;
        int prev = 0;
        // Jump to find the block where target might be
        while (step < n && arr[step - 1] < target) {
            prev = step;
            step += blockSize;
            if (prev >= n) {
                return -1;
            }
        }
        // Linear search in the block
        for (int i = prev; i < Math.min(step, n); i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}