package mDysput;

public abstract class Player {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Player(String name, String surname) {

        this.name = name;
        this.surname = surname;
    }

}
