package com.company;

public class RockPaperScissor {

    /* This class fulfills the requirements for the challenge in the link below
        https://edabit.com/challenge/3S8XppR6Yf5mXPxij
     */

    public String playRPS(String p1Choice, String p2Choice) {
        String gameResult = "";
        String p1WinMessage = "Player 1 wins";
        String p2WinMessage = "Player 2 wins";
        String tieMessage = "The game ends in a tie";

        String move1 = p1Choice.trim().toUpperCase();
        String move2 = p2Choice.trim().toUpperCase();

        if (move1.equals(move2)) {
            gameResult = tieMessage;
        } else if (move1.equals("ROCK")) {
            if (move2.equals("SCISSORS"))
                gameResult = p1WinMessage;
            else if (move2.equals("PAPER"))
                gameResult = p2WinMessage;
        } else if (move1.equals("PAPER")) {
            if (move2.equals("ROCK"))
                gameResult = p1WinMessage;
            else if (move2.equals("SCISSORS"))
                gameResult = p2WinMessage;
        } else {
            if (move2.equals("PAPER"))
                gameResult = p1WinMessage;
            else if (move2.equals("ROCK"))
                gameResult = p2WinMessage;
        }

        return gameResult;
    }


    public static void main(String[] args) {
        RockPaperScissor rps = new RockPaperScissor();
        System.out.println(rps.playRPS("rock", "paper"));
        System.out.println(rps.playRPS("paper", "rock"));
        System.out.println(rps.playRPS("paper", "scissors"));
        System.out.println(rps.playRPS("scissors", "scissors"));
        System.out.println(rps.playRPS("scissors", "paper"));
    }
}