package at.redlinghaus;

public class Match {
    private int goal1;
    private int goal2;
    private Team team1;
    private Team team2;
    private Team winner;
    private Team looser;
    private Tournament activeTournament;

    Match(Team team1, Team team2){
        this.team1 = team1;
        this.team2 = team2;
        this.activeTournament = team1.getActualTournament();
    }

    public int getGoal1() {
        return goal1;
    }

    public void setGoal1(int goal1) {
        this.goal1 = goal1;
    }

    public int getGoal2() {
        return goal2;
    }

    public void setGoal2(int goal2) {
        this.goal2 = goal2;
    }

    public Team play() {
        this.goal1 = (int) Math.floor(Math.random() * 10);
        this.goal2 = (int) Math.floor(Math.random() * 10);
        boolean isOver = false;
        while(!isOver) {
            if (goal1 > goal2) {
                winner = team1;
                looser = team2;
                isOver = true;
            } else if (goal2 > goal1){
                winner = team2;
                looser = team1;
                isOver = true;
            } else {
                this.goal1 += (int) Math.floor(Math.random() * 4);
                this.goal2 += (int) Math.floor(Math.random() * 4);
            }
        }
        looser.setGoalDiv(Math.max(goal1, goal2) - Math.min(goal1, goal2));
        looser.setStatus(false);
        looser.getActualTournament().getTeams().remove(looser);
//        System.out.printf("Gewonnen hat %s, verloren hat %s%n", winner, looser);
        return winner;
    }

    public Team getLooser() {
        return looser;
    }

    public void setLooser(Team looser) {
        this.looser = looser;
    }

    @Override
    public String toString() {
        return team1 + " " + goal1 + " : " + goal2 + " " + team2;
    }
}
