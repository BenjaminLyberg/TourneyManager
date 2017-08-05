package andben.com.tourneymanager.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by Benjamin on 05.08.2017.
 */

public class User implements Parcelable {
    private String username;
    private Team chosenTeam;

    public User(String username, Team chosenTeam) {
        this.username = username;
        this.chosenTeam = chosenTeam;
    }

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


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.username);
        dest.writeParcelable(this.chosenTeam, flags);
    }

    protected User(Parcel in) {
        this.username = in.readString();
        this.chosenTeam = in.readParcelable(Team.class.getClassLoader());
    }

    public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() {
        @Override
        public User createFromParcel(Parcel source) {
            return new User(source);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
}
