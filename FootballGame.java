import java.util.Scanner;

public class FootballGame implements ScoreActions {

    static int teamAScore = 0;
    static int teamBScore = 0;

    Scanner input = new Scanner(System.in);

    static void addGoal(Team team) {
        if (team == Team.TEAM_A) {
            teamAScore++;
        } else {
            teamBScore++;
        }
    }

    static void addGoal(Team team, int goals) {
        if (team == Team.TEAM_A) {
            teamAScore += goals;
        } else {
            teamBScore += goals;
        }
    }

    public void showScore() {
        System.out.println("\n----- FINAL SCORE -----");
        System.out.println("Team A: " + teamAScore);
        System.out.println("Team B: " + teamBScore);
    }

    public void showWinner() {
        if (teamAScore > teamBScore) {
            System.out.println("Team A wins!");
        } else if (teamBScore > teamAScore) {
            System.out.println("Team B wins!");
        } else {
            System.out.println("The match is a draw!");
        }
    }

    public void enterScores() {
        System.out.print("Enter score for Team A: ");
        teamAScore = input.nextInt();

        System.out.print("Enter score for Team B: ");
        teamBScore = input.nextInt();
    }

    public static void main(String[] args) {

        FootballGame game = new FootballGame();

        System.out.println("Welcome to Football Score Tracker!");

        game.enterScores();

        game.showScore();
        game.showWinner();
    }
}