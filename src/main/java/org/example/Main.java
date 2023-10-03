package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static int playerScore=0;
    static int computerScore=0;
    static int drawScore=0;
    static Player player;
    static Computer computer;

    public static void main(String[] args) {
        System.out.println("Hello, this is a super game ROCK, PAPER, SCISSORS?");
        System.out.println("Let's gp!");
        player = new Player();
        computer = new Computer();

        startGame();

    }

    public static void startGame(){
        MoveTypes playerMove = player.makeMove();
        MoveTypes computerMove = computer.makeMove();
        checkMovesIsEqual(playerMove, computerMove);
    }

    public static void checkMovesIsEqual(MoveTypes playerMove, MoveTypes computerMove){
        if (playerMove == computerMove){
            drawScore++;
            System.out.println("It is a draw,Try again!");

        }else if(playerMove==MoveTypes.ROCK && computerMove == MoveTypes.SCISSORS){
            sayYouWinner(computerMove);
        } else if (playerMove == MoveTypes.ROCK && computerMove == MoveTypes.PAPER) {
            sayYouLose(computerMove);
        } else if (playerMove == MoveTypes.PAPER && computerMove == MoveTypes.ROCK) {
            sayYouWinner(computerMove);
        }
        else if (playerMove == MoveTypes.PAPER && computerMove == MoveTypes.SCISSORS) {
            sayYouLose(computerMove);
        }
        else if (playerMove == MoveTypes.SCISSORS && computerMove == MoveTypes.ROCK) {
            sayYouLose(computerMove);
        }else if (playerMove == MoveTypes.SCISSORS && computerMove == MoveTypes.PAPER) {
            sayYouWinner(computerMove);
        }
        startAgain();
    }

    public static void sayYouWinner(MoveTypes computerMove){
        System.out.println("Congratulation!!! You are winner!");
        System.out.println("Computer move is    "+ computerMove);
        player.increaseScore();
        computer.dicreaseScore();
    }

    public static void sayYouLose(MoveTypes computerMove){
        System.out.println("Sorry!!! You lose!");
        System.out.println("Computer move is    "+ computerMove);
        player.dicreaseScore();
        computer.increaseScore();
    }

    public static void GameResult(){
        System.out.println("It was great game.");
        System.out.println("Your score is   "+ player.getScore());
        System.out.println("Computer score is   "+ computer.getScore());
        System.out.println("Draw score is   "+ drawScore);
    }

    public static void startAgain(){
        if (player.playAgain()){
            startGame();
        }else{
            GameResult();
        }
    }
}