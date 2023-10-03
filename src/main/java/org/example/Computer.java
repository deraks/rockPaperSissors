package org.example;


import java.util.Random;

public class Computer {

    private  int score;
    public Computer(){

    }

    public void increaseScore(){
        this.score++;
    }
    public void dicreaseScore(){
        this.score--;
    }

    public int getScore(){
        return this.score;
    }

    public MoveTypes makeMove(){
        MoveTypes [] moveType = MoveTypes.values();
        Random rnd = new Random();
        return moveType[rnd.nextInt(moveType.length)];
    }
}
