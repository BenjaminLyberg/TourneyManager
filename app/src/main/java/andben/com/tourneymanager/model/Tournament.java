package andben.com.tourneymanager.model;

/**
 * Created by Benjamin on 05.08.2017.
 */

public class Tournament {
    private int playerNumber;

    public Tournament(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }
}
