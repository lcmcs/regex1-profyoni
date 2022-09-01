package edu.touro.cs.mcon364;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test // Annotation
    void add2_3() { // AAA
        // Arrange
        Main m = new Main();

        // Act
        int actual = m.add(2,3);

        // Assert
       assertEquals(5, actual);
    }


    @org.junit.jupiter.api.Test
    void uniqueWord() {
        // Arrange

        // Act
        int actual = Main.uniqueWordCount("To be or not to be");

        // Assert
        assertEquals(4, actual);
    }


    @org.junit.jupiter.api.Test
    void uniqueWordEmptyString() {
        // Arrange

        // Act
        int actual = Main.uniqueWordCount("");

        // Assert
        assertEquals(0, actual);
    }

    @org.junit.jupiter.api.Test
    void wordFrequency() {
        // Arrange

        // Act
        Map<String, Integer> map = Main.wordFrequency("The king ate the beef");

        // Assert
        assertEquals(1, map.get("king"));
        assertEquals(2, map.get("the"));
    }
}