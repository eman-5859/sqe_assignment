package com.searchlibrary;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class JumpSearchTest {

    @Test
    void testElementFound() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(2, JumpSearch.search(arr, 3));
    }

    @Test
    void testElementNotFound() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(-1, JumpSearch.search(arr, 10));
    }

    @Test
    void testFirstElement() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(0, JumpSearch.search(arr, 1));
    }

    @Test
    void testLastElement() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(8, JumpSearch.search(arr, 9));
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        assertEquals(-1, JumpSearch.search(arr, 1));
    }

    @Test
    void testSingleElementFound() {
        int[] arr = {5};
        assertEquals(0, JumpSearch.search(arr, 5));
    }

    @Test
    void testSingleElementNotFound() {
        int[] arr = {5};
        assertEquals(-1, JumpSearch.search(arr, 1));
    }

    @Test
    void testElementInFirstBlock() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(1, JumpSearch.search(arr, 2)); // block size ~3, first block 0-2
    }

    @Test
    void testElementInLaterBlock() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(6, JumpSearch.search(arr, 7)); // later block
    }
}