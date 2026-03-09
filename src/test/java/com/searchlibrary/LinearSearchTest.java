package com.searchlibrary;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LinearSearchTest {

    @Test
    void testElementFound() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(2, LinearSearch.search(arr, 3));
    }

    @Test
    void testElementNotFound() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(-1, LinearSearch.search(arr, 6));
    }

    @Test
    void testFirstElement() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(0, LinearSearch.search(arr, 1));
    }

    @Test
    void testLastElement() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(4, LinearSearch.search(arr, 5));
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        assertEquals(-1, LinearSearch.search(arr, 1));
    }

    @Test
    void testSingleElementFound() {
        int[] arr = {5};
        assertEquals(0, LinearSearch.search(arr, 5));
    }

    @Test
    void testSingleElementNotFound() {
        int[] arr = {5};
        assertEquals(-1, LinearSearch.search(arr, 1));
    }
}