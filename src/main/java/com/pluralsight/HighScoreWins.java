package com.pluralsight;
import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner format1 = new Scanner(System.in);
        System.out.println("Please enter a game score:\n");
        String input = format1.nextLine().trim();
        String[] formatted = input.split("\\|");
        String teamNames = formatted[0];
        String scores = formatted[1];

        String[] splitTeams = teamNames.split("\\:");
        String[] splitScores = scores.split("\\:");

        String team1 = splitTeams[0];
        String team2 = splitTeams[1];

        int score1 = Integer.parseInt(splitScores[0]);
        int score2 = Integer.parseInt(splitScores[1]);

        if (score1 > score2) {
            System.out.printf("Winner: %s ", team1);
        } else if (score2 > score1) {
            System.out.printf("Winner: %s ", team2);
        } else
            System.out.println("Scores are equal");

    }
}
