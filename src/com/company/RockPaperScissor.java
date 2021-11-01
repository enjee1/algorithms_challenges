package com.company;

public class RockPaperScissor {

    public enum RPSMove {
        ROCK ("ROCK"),
        PAPER ("PAPER"),
        SCISSORS ("SCISSORS");

        private final String name;

        RPSMove(String name) {
            this.name = name;
        }

        private String getName() { return name; }

    }

    /* This class fulfills the requirements for the challenge in the link below
        https://edabit.com/challenge/3S8XppR6Yf5mXPxij
     */

    public String playRPS(String p1Choice, String p2Choice) {

        String move1 = p1Choice.trim().toUpperCase();
        String move2 = p2Choice.trim().toUpperCase();
        String result = "";

        return result;
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

