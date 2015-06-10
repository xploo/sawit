package database;

/**
 * Created by D on 20.05.2015.
 */

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName ="Episode")
public class Episode {

    public static final String EPISODE_ID = "episode_id";
    public static final String E_NAME = "e_name";
    public static final String DESCRIPTION = "description";
    public static final String RATING = "rating";
    public static final String RELEASEDATE = "releasedate";

    @DatabaseField(canBeNull = false, useGetSet = true, id = true, columnName = EPISODE_ID)
    private int episode_id;

    @DatabaseField(canBeNull = false, useGetSet = true, columnName = E_NAME)
    private String e_name;

    @DatabaseField(canBeNull = false, useGetSet = true, columnName = DESCRIPTION)
    private String description;

    @DatabaseField(canBeNull = false, useGetSet = true, columnName = RATING)
    private String rating;

    @DatabaseField(canBeNull = false, useGetSet = true, columnName = RELEASEDATE)
    private String releasedate;

    public int getEpisode_id() {
        return episode_id;
    }

    public void setEpisode_id(int episode_id) {
        this.episode_id = episode_id;
    }

    public String getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(String releasedate) {
        this.releasedate = releasedate;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }



}
