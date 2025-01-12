package org.molkky;

public class Molkky {

    private String gameState;
    private boolean gameOver = false;
    private boolean winner = false;
    private int missesCounter = 0;
    private int score = 0;


    public void addPinsPoints(int pinValue) {

        if (missesCounter == 3) {
            gameOver = true;
        }

        if(gameOver){
            gameState = "GAME_OVER";
            return;
        }

        if(winner){
            gameState = "YOU_WIN";
            return;
        }

        if(pinValue == 0){
            missesCounter++;
        }else{
            missesCounter = 0;
        }

        if(pinValue < 1 || pinValue > 12){
            return;
        }

        score += pinValue;

        winner = isWinner(score);

        score = checkAndDecreaseScore(score);
    }

    private boolean isWinner(int score) {
        return score == 50;
    }

    public int getScore() {
        return score;
    }

    private int checkAndDecreaseScore(int score){
        if(score > 50){
            return 25;
        }
        return score;
    }

    public String getGameState(){
        return gameState;
    }
}
