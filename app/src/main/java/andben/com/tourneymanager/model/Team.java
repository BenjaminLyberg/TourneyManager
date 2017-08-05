package andben.com.tourneymanager.model;

/**
 * Created by Benjamin on 05.08.2017.
 */

public class Team {
    private String name;
    private String image;

    public Team(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
