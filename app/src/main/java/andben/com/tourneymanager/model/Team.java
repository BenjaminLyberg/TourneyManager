package andben.com.tourneymanager.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Benjamin on 05.08.2017.
 */

public class Team implements Parcelable {
    private String name;
    private int imageId;
    private int sImageId;

    public Team(String name, int imageId, int sImageId) {
        this.name = name;
        this.imageId = imageId;
        this.sImageId = sImageId;
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

    public int getsImageId() {
        return sImageId;
    }

    public void setsImageId(int sImageId) {
        this.sImageId = sImageId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeInt(this.imageId);
        dest.writeInt(this.sImageId);
    }

    protected Team(Parcel in) {
        this.name = in.readString();
        this.imageId = in.readInt();
        this.sImageId = in.readInt();
    }

    public static final Parcelable.Creator<Team> CREATOR = new Parcelable.Creator<Team>() {
        @Override
        public Team createFromParcel(Parcel source) {
            return new Team(source);
        }

        @Override
        public Team[] newArray(int size) {
            return new Team[size];
        }
    };
}
