package database;

/**
 * Created by D on 20.05.2015.
 */

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName ="Season")
public class Season {

    public static final String SEASON_ID = "season_id";
    public static final String EPISODES = "episodes";

    @DatabaseField(canBeNull = false, useGetSet = true, id = true, columnName = SEASON_ID)
    private int season_id;

    @DatabaseField(canBeNull = false, useGetSet = true, columnName = EPISODES)
    private String episodes;


    public int getSeason_id() {
        return season_id;
    }

    public void setSeason_id(int season_id) {
        this.season_id = season_id;
    }

    public String getEpisodes() {
        return episodes;
    }

    public void setEpisodes(String episodes) {
        this.episodes = episodes;
    }


}
