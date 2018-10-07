package mDysput;

public class Main {
    public static void main(String[] args) {
        League<Team<FootballPlayer>> spain= new League<>("BBVA");

        FootballPlayer messi= new FootballPlayer("Leo", "Messi", PositionFootball.attacker);
        Team<FootballPlayer> barcelona= new Team<>("FC Barcelona");
        barcelona.addPlayer(messi);

        Team<FootballPlayer> real= new Team<>("Real Madryt");
        Team<FootballPlayer> sevilla= new Team<>("Sevilla");
        spain.addTeam(real);
        spain.addTeam(barcelona);
        spain.addTeam(sevilla);
        barcelona.play(real, 3, 0);


        real.play(sevilla, 1, 1);

        System.out.println(real.points());;
        System.out.println(barcelona.points()); ;
        System.out.println(sevilla.points());

        spain.showRanking();

    }
}
