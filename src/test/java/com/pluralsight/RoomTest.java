package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void isAvailable() {
        // arrange
        Room myRoom = new Room(1, 50, false, false);

        // act
        boolean result = myRoom.isAvailable();

        // assert
        assertEquals(true, result);
    }
}