package mDysput;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    private String name;
    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
        if (teams.contains(team)) {
            System.out.println(team.getName() + "cant add this team");
            return false;
        } else {
            teams.add(team);
            return true;
        }
    }

    public void showRanking() {
        int i = 1;
        Collections.sort(teams);
        for (T t : teams) {
            System.out.println(i + ". " + t.getName() + ": " + t.points());
            i++;
        }
    }
}
