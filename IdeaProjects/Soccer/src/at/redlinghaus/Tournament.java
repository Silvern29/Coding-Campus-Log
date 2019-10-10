package at.redlinghaus;

import java.util.*;

public class Tournament {
    private int teamCount = 16;
    private int matchCount = 15;
    private int roundCount = 4;
    private LinkedList<Team> teams;
    Team[] ranking = new Team[16];
    int actualRank = 15;

    public Tournament(){
        this.teams = new LinkedList<>();
    }

    public void playRound() {
        int j = 0;
        int count = teams.size();
        LinkedList<Team> teamsRound = (LinkedList) this.teams.clone();
        List<Match> round = new LinkedList<>();
        Team[] loosersBracket = new Team[teamsRound.size()/2];
        int z = 0;
        while(j < count){
            Match actualMatch = new Match(teamsRound.get(j++), teamsRound.get(j++));
            actualMatch.play();
            round.add(actualMatch);
            loosersBracket[z] = actualMatch.getLooser();
        }
        for (int y = 0; y < loosersBracket.length - 1; y++) {
            for (int x = y + 1; x < loosersBracket.length; x++) {
                if (loosersBracket[y].getGoalDiv() > loosersBracket[x].getGoalDiv()){
                    Team tmp = loosersBracket[y];
                    loosersBracket[y] = loosersBracket[x];
                    loosersBracket[x] = tmp;
                }
            }
        }
        z = 0;
        for (int y = teamsRound.size() / 2; y < teamsRound.size(); y++) {
            ranking[y] = loosersBracket[z];
            z++;
        }
        System.out.println(round.toString());
    }

    public void playTournament(){
        for (int i = 0; i < roundCount; i++){
            this.playRound();
        }
        for(int i = 0; i < ranking.length; i++){
            System.out.println(i+1 + ". Platz - " + ranking[i]);
        }
    }

    public void ranking(Match match){

    }

    public void addteam(String name) {
        new Team(name, this);
    }

    public int getTeamCount() {
        return teamCount;
    }

    public void setTeamCount(int teamCount) {
        this.teamCount = teamCount;
    }

    public int getMatchCount() {
        return matchCount;
    }

    public void setMatchCount(int matchCount) {
        this.matchCount = matchCount;
    }

    public int getRoundCount() {
        return roundCount;
    }

    public void setRoundCount(int roundCount) {
        this.roundCount = roundCount;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(LinkedList<Team> teams) {
        this.teams = teams;
    }
}
