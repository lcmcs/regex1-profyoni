package edu.touro.cs.mcon364;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayList2Test {

    @Test
    void size() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void add() {
        MyArrayList2 mal = new MyArrayList2();
        mal.add("a");

        assertEquals(1, mal.size());

    }
}