package mDysput;

import java.util.ArrayList;

public class Team <T extends Player> implements Comparable<Team<T>> {
    private String name;
    private int playedMatches;
    private int won;
    private int draw;
    private int lose;

    public Team(String name) {
        this.name = name;
        this.playedMatches=0;
        this.won=0;
        this.draw=0;
        this.lose=0;
    }

    public String getName() {
        return name;
    }

    public ArrayList<T> playersAdded= new ArrayList<>();

    public boolean addPlayer(T player){
        if(playersAdded.contains(player)){
            System.out.println(player.getName() +" can't be added");
            return false;
        }
        else {
            playersAdded.add(player);
            return true;
        }
    }

    public void play(Team <T>oponent, int myPoint, int oponentPoints){
        playedMatches++;
        if(myPoint>oponentPoints){
            won++;
        }
        else if(myPoint<oponentPoints){
            lose++;
        }
        else{
            draw++;
        }
        if(oponent != null) {
            oponent.play(null, oponentPoints, myPoint);
        }
    }

    public int points(){
        return (won*3)+draw;
    }


    @Override
    public int compareTo(Team<T> team) {
        if(this.points()>team.points()){
            return -1;
        }
        else if(this.points()<team.points()){
            return 1;
        }
        else
            return 0;
    }
}
