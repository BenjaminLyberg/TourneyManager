package andben.com.tourneymanager.model;

/**
 * Created by Benjamin on 05.08.2017.
 */

public class Team {
    private String name;
    private int imageId;

    public Team(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
