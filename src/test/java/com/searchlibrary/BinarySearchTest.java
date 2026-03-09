package com.searchlibrary;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @Test
    void testElementFound() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(2, BinarySearch.search(arr, 3));
    }

    @Test
    void testElementNotFound() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(-1, BinarySearch.search(arr, 6));
    }

    @Test
    void testFirstElement() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(0, BinarySearch.search(arr, 1));
    }

    @Test
    void testLastElement() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(4, BinarySearch.search(arr, 5));
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        assertEquals(-1, BinarySearch.search(arr, 1));
    }

    @Test
    void testSingleElementFound() {
        int[] arr = {5};
        assertEquals(0, BinarySearch.search(arr, 5));
    }

    @Test
    void testSingleElementNotFound() {
        int[] arr = {5};
        assertEquals(-1, BinarySearch.search(arr, 1));
    }

    @Test
    void testTargetLessThanMid() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(0, BinarySearch.search(arr, 1)); // mid=2 (5), 1<5, go left
    }

    @Test
    void testTargetGreaterThanMid() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(4, BinarySearch.search(arr, 9)); // mid=2 (5), 9>5, go right
    }
}