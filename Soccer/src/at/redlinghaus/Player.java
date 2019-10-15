package at.redlinghaus;

public class Player {
    private String firstName;
    private String lastName;
    private int playerNumber;
    private boolean isReady;
    private Team actualTeam;

    Player(String firstName, String lastName, Team team) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.actualTeam = team;
        this.isReady = true;
        actualTeam.getTeamPlayers().add(this);
        this.playerNumber = actualTeam.getNextPlayerNumber();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }

    public Team getActualTeam() {
        return actualTeam;
    }

    public void setActualTeam(Team actualTeam) {
        this.actualTeam = actualTeam;
    }
}
