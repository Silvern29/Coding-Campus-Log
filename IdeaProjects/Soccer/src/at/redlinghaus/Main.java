package at.redlinghaus;

public class Main {

    public static void main(String[] args) {
        Tournament myCup = new Tournament();
        Team team1 = new Team("Team1", myCup);
        Team team2 = new Team("Team2", myCup);
        Team team3 = new Team("Team3", myCup);
        Team team4 = new Team("Team4", myCup);
        Team team5 = new Team("Team5", myCup);
        Team team6 = new Team("Team6", myCup);
        Team team7 = new Team("Team7", myCup);
        Team team8 = new Team("Team8", myCup);
        Team team9 = new Team("Team9", myCup);
        Team team10 = new Team("Team10", myCup);
        Team team11 = new Team("Team11", myCup);
        Team team12 = new Team("Team12", myCup);
        Team team13 = new Team("Team13", myCup);
        Team team14 = new Team("Team14", myCup);
        Team team15 = new Team("Team15", myCup);
        Team team16 = new Team("Team16", myCup);

        myCup.playTournament();
    }
}
