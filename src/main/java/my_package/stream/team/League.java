package my_package.stream.team;

import java.util.ArrayList;
import java.util.List;

public class League {
    private String leagueName;
    private List<Team> teams = new ArrayList<>();

    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    public void registerTeam(Team team){
        teams.add(team);
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }
}
