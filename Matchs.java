package com.mycompany.Project;

public abstract class Matchs {

    private int MatchDuration;
    private String City;
    private String Stadium;
    private int ExtraTime;
    private int Halves;
    private int NumberOfPlayer;
    private Commentator[] Commentator;

   
    public Matchs() {
        this(0, "", "", null, 0, 0, 0);
    }

    public Matchs(int MatchDuration, String City, String Stadium, Commentator[] Commentator, int ExtraTime, int Halves, int NumberOfPlayer) {

        this.MatchDuration = MatchDuration;
        this.City = City;
        this.Stadium = Stadium;
        this.Commentator = Commentator;
        this.ExtraTime = ExtraTime;
        this.Halves = Halves;
        this.NumberOfPlayer = NumberOfPlayer;
    }

    public int getMatchDuration() {
        return MatchDuration;
    }

    public void setMatchDuration(int MatchDuration) {
        this.MatchDuration = MatchDuration;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getStadium() {
        return Stadium;
    }

    public void setStadium(String Stadium) {
        this.Stadium = Stadium;
    }

    public int getExtraTime() {
        return ExtraTime;
    }

    public void setExtraTime(int ExtraTime) {
        this.ExtraTime = ExtraTime;
    }

    public int getHalves() {
        return Halves;
    }

    public void setHalves(int Halves) {
        this.Halves = Halves;
    }

    public int getNumberOfPlayer() {
        return NumberOfPlayer;
    }

    public void setNumberOfPlayer(int NumberOfPlayer) {
        this.NumberOfPlayer = NumberOfPlayer;
    }

    public Commentator[] getCommentator() {
        return Commentator;
    }

    public void setCommentator(Commentator[] Commentator) {
        this.Commentator = Commentator;
    }

    public final void displayPlayers() {
        System.out.println("Commentator List");
        if (Commentator == null) {
            System.out.println("no Commentator added yet");

        } else {
            for (Commentator p : Commentator) {
                System.out.println(p);
                System.out.println("--------------------");
            }
        }

    }

    public abstract String matchType();

    @Override
    public String toString() {
        return String.format("City: %s%nstadium: %s%n MatchDuration: %d%n ExtraTime: %d%nHalves: %d%nNumberOfPlayer: %d%n", getCity(), getStadium(), getMatchDuration(), getExtraTime(), getHalves(), getNumberOfPlayer());

    }
}
