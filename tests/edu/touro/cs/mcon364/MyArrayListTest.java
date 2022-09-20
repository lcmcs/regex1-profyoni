package edu.touro.cs.mcon364;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    private MyArrayList mal = new MyArrayList();
    @Test
    void size() {
        assertEquals(0, mal.size());
    }

    @Test
    void size1() {
        mal.add("A");
        assertEquals(1, mal.size());
    }


    @Test
    void size11() {

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
        mal.add(3 + "");
    }

    @Test
    void remove() {
    }

    @Test
    void getExceptionTest() {
        try {
            mal.get(0);
        }
        catch(IndexOutOfBoundsException e)
        {
            return;
        }
        fail("did not throw exception");
    }


}