package edu.touro.cs.mcon364;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    @Test
    void size() {
        MyArrayList mal = new MyArrayList();
        assertEquals(0, mal.size());
    }

    @Test
    void size1() {
        MyArrayList mal = new MyArrayList();
        mal.add("A");
        assertEquals(1, mal.size());
    }


    @Test
    void size11() {
        MyArrayList mal = new MyArrayList();
        for (int i=0;i<11;i++)
            mal.add("" + i);
        assertEquals(11, mal.size());
    }

    @Test
    void isEmpty() {
    }

    @Test
    void contains() {
    }

    @Test
    void add() {
    }

    @Test
    void remove() {
    }
}