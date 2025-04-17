//Team.java
package bw.sportsleague;

public class Team {
    private String teamName;
    private Player[] players;
    private String stadiumName;

    
    
    public Team(String teamName, Player[] players,String stadiumName) {
        this.teamName = teamName;
        this.players = players;
        this.stadiumName =stadiumName;
        
    }

    // Method to display team and player info
    public void displayTeamInfo() {
        System.out.printf("Team: " + teamName+"StadiumName: "+stadiumName);
        for (Player p : players) {
            p.displayPlayerInfo();
        }
    }

    // Getter and Setter methods
    public String getTeamName() {
        return teamName;
    }
    public String getStadiumName() {
        return stadiumName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public void setStadiumName(String stadiumName) {
        this.stadiumName = stadiumName;
    }
    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }
}