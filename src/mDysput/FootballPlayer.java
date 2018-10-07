package mDysput;

public class FootballPlayer extends Player {
    private PositionFootball positionFootball;

    public FootballPlayer(String name, String surname, PositionFootball positionFootball) {
        super(name, surname);
        this.positionFootball = positionFootball;
    }
}
