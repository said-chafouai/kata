package org.bowling;

import org.bowling.Bowling;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


class BowlingTest {

    @Test
    void randomGame(){
        Bowling bowling = createPerfectGame();
        Assertions.assertEquals(300, bowling.getScore());
    }

    @Test
    void perfectGame(){
        Bowling bowling = createPerfectGame();
        Assertions.assertEquals(300, bowling.getScore());
    }

    private Bowling createPerfectGame(){
        Bowling bowling = new Bowling();
        bowling.roll(10);
        bowling.roll(10);
        bowling.roll(10);
        bowling.roll(10);
        bowling.roll(10);
        bowling.roll(10);
        bowling.roll(10);
        bowling.roll(10);
        bowling.roll(10);
        bowling.roll(10);
        bowling.roll(10);
        bowling.roll(10);

        return bowling;

    }

    private Bowling createRandomGame(){
        Bowling bowling = new Bowling();
        bowling.roll(10);
        bowling.roll(10);

        bowling.roll(10);
        bowling.roll(10);

        bowling.roll(10);
        bowling.roll(10);
        bowling.roll(10);
        bowling.roll(10);
        bowling.roll(10);
        bowling.roll(10);
        bowling.roll(10);
        bowling.roll(10);

        return bowling;

    }



}
