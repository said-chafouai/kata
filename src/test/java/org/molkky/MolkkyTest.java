package org.molkky;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MolkkyTest {

    @Test
    void pinsPoints(){
        Molkky molkky = new Molkky();
        molkky.addPinsPoints(3);

        Assertions.assertEquals(3, molkky.getScore());
    }

    @Test
    void pinsPointsBetween1and12(){
        Molkky molkky = new Molkky();
        molkky.addPinsPoints(13);
        molkky.addPinsPoints(-1);

        Assertions.assertEquals(0, molkky.getScore());
    }

    @Test
    void whenScoreIsStrictlyHigherThan50ItMustBeDecreasedTo25(){
        Molkky molkky = new Molkky();
        molkky.addPinsPoints(12);
        molkky.addPinsPoints(12);
        molkky.addPinsPoints(12);
        molkky.addPinsPoints(12);
        molkky.addPinsPoints(12);

        Assertions.assertEquals(25, molkky.getScore());
    }

    @Test
    void gameOverWhenYouMisseThreeTimesInARow(){
        Molkky molkky = new Molkky();
        molkky.addPinsPoints(12);
        molkky.addPinsPoints(12);
        molkky.addPinsPoints(0);
        molkky.addPinsPoints(0);
        molkky.addPinsPoints(0);
        molkky.addPinsPoints(12);

        Assertions.assertEquals(24, molkky.getScore());
    }

    @Test
    void youWin(){
        Molkky molkky = new Molkky();
        molkky.addPinsPoints(10);
        molkky.addPinsPoints(10);
        molkky.addPinsPoints(10);
        molkky.addPinsPoints(10);
        molkky.addPinsPoints(10);
        molkky.addPinsPoints(10);
        molkky.addPinsPoints(10);

        Assertions.assertEquals(50, molkky.getScore());
    }

}