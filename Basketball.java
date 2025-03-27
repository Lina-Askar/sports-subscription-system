package com.mycompany.Project;

public class Basketball extends Matchs {

    private String mostFamousPlayer;
    private int minutesPerGame;

    public Basketball() {

    }

    public Basketball(String mostFamousPlayer,int minutesPerGame, int MatchDuration, String City, String Stadium, Commentator[] Commentator, int ExtraTime, int Halves, int NumberOfPlayer) {
        super(MatchDuration, City, Stadium, Commentator, ExtraTime, Halves, NumberOfPlayer);
        this.mostFamousPlayer = mostFamousPlayer;

        this.minutesPerGame = minutesPerGame;
    }

    public String getMostFamousPlayer() {
        return mostFamousPlayer;
    }

    public void setMostFamousPlayer(String mostFamousPlayer) {
        this.mostFamousPlayer = mostFamousPlayer;
    }

    public int getMinutesPerGame() {
        return minutesPerGame;
    }

    public void setMinutesPerGame(int minutesPerGame) {
        this.minutesPerGame = minutesPerGame;
    }

    @Override
    public String matchType() {
        return String.format("Match Type: %s\n", getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return String.format("Most Famous Player: %s\nMinutes Per Game: %d\n", mostFamousPlayer, minutesPerGame);
    }

    public boolean haveOvertime() {
        if (minutesPerGame > 48) {
            return true;
        } else {
            return false;
        }
    }

}
