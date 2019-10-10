package at.redlinghaus;

import java.util.LinkedList;
import java.util.List;

public class Team {
    private String country;
    private int rank;
    private boolean status;
    private int nextPlayerNumber;
    private List<Player>teamPlayers;
    private Tournament actualTournament;

    private int goalDiv;

    public Team(String country, Tournament tournament) {
        this.country = country;
        this.teamPlayers = new LinkedList<>();
        this.status = true;
        this.rank = 0;
        this.actualTournament = tournament;
        actualTournament.getTeams().add(this);
    }

    public int getGoalDiv() {
        return goalDiv;
    }

    public void setGoalDiv(int goalDiv) {
        this.goalDiv = goalDiv;
    }

    public int getNextPlayerNumber() {
        return this.nextPlayerNumber++;
    }

    public void setNextPlayerNumber() {
        this.nextPlayerNumber++;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<Player> getTeamPlayers() {
        return teamPlayers;
    }

    public void setTeamPlayers(List<Player> teamPlayers) {
        this.teamPlayers = teamPlayers;
    }

    public Tournament getActualTournament() {
        return actualTournament;
    }

    public void setActualTournament(Tournament actualTournament) {
        this.actualTournament = actualTournament;
    }

    @Override
    public String toString() {
        return country;
    }
}
