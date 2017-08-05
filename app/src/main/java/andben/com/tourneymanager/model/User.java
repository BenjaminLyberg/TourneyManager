package andben.com.tourneymanager.model;

/**
 * Created by Benjamin on 05.08.2017.
 */

public class User {
    private String username;
    private Team chosenTeam;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Team getChosenTeam() {
        return chosenTeam;
    }

    public void setChosenTeam(Team chosenTeam) {
        this.chosenTeam = chosenTeam;
    }
}
