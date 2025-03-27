package com.mycompany.Project;

public class Football extends Matchs{

    private String referee;

    private String club;

    private int weight;



    public Football() { }



    public Football(String referee, String club, int weight, int MatchDuration, String City, String Stadium, int ExtraTime,int Halves,int NumberOfPlayer,Commentator [] Commentator) {

          super(MatchDuration, City, Stadium,Commentator,ExtraTime,Halves,NumberOfPlayer);

        this.referee = referee;

        this.club = club;

        this.weight = weight;

    }



    // ----- SETTERS AND GETTERS ----- //

    public String getRef() {

        return referee;    }

    public void setRef(String referee) {

        this.referee = referee;   }

    public String getClub() {

        return club;    }

    public void setClub(String club) {

        this.club = club;   }

    public int getWeight() {

        return weight;  }

    public void setWeight(int weight) {

        this.weight = weight;   }

    // ----- END SET / GET ------ //



    @Override

    public String matchType() {

        return String.format("Match Type: %s\n", getClass().getSimpleName());

    }



    @Override

    public String toString() {

        return String.format("Referee: %s\nClub: %s\nBall weight: %d\n", getRef(), getClub(), getWeight());

    }



    

    public void Card(int PlayerNo,String infraction){

        if ("Dismissal".equals(infraction)){

            System.out.println("Player #"+PlayerNo+" has recieved a red card and will be suspended from the game.");

        } else {

            System.out.println("Player #"+PlayerNo+" has recieved a yellow card.");   }

    }


}