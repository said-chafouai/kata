package org.bowling;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Bowling {

    List<Integer> rollThrowedPins = new ArrayList<>(21);

    public void roll(int pins) {
        rollThrowedPins.add(pins);
    }

    public int getScore(){

        int score = 0;
        int rollIndex = 0;

        for(int frame = 0; frame < 10; frame++){
            if(isStrike(rollThrowedPins, rollIndex)) {
                score += rollThrowedPins.get(rollIndex) + rollThrowedPins.get(rollIndex + 1)  + rollThrowedPins.get(rollIndex + 2);
            }
            else if (isSpare(rollThrowedPins, rollIndex)){
                score += (rollThrowedPins.get(rollIndex) + rollThrowedPins.get(rollIndex + 1));
            }
            else {
                score += rollThrowedPins.get(rollIndex);
            }
        }

        return score;
    }

    private boolean isSpare(List<Integer> rollThrowedPins, int rollIndex) {
        return ( rollThrowedPins.get(rollIndex) + rollThrowedPins.get(rollIndex + 1) ) == 10;
    }

    private boolean isStrike(List<Integer> rollThrowedPins, int rollIndex) {
        return rollThrowedPins.get(rollIndex) == 10;
    }


}
