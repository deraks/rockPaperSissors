package org.example;

import java.util.Scanner;

public class Player {
    private  int score;
    private Scanner scaner;
    public Player(){
        this.scaner = new Scanner(System.in);
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
        System.out.println("Hello can you enter Rock, Paper or Scissors, please");

        String playerMove = scaner.nextLine();

        switch (playerMove.toUpperCase()){
            case "ROCK":
                return MoveTypes.ROCK;
            case "PAPER":
                return MoveTypes.PAPER;
            case "SCISSORS":
                return MoveTypes.SCISSORS;
            default:
                System.out.println("You can enter only ROCK or PAPER or SCISSORS. Try to enter again,");
                return makeMove();
        }
    }

    public boolean playAgain(){
        System.out.println("Do you want play again? yes/no");
        char again = scaner.nextLine().toLowerCase().charAt(0);
        if (again=='y'){
            return true;
        }else {
            return false;
        }
    }
}
