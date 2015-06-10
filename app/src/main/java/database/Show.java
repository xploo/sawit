package database;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by D on 20.05.2015.
 */
@DatabaseTable(tableName ="Show")
public class Show {

    public static final String SHOW_ID = "show_id";
    public static final String S_NAME = "s_name";
    public static final String GENRE = "genre";
    public static final String SEASONS = "seasons";


    @DatabaseField(canBeNull = false, useGetSet = true, id = true, columnName = SHOW_ID)
    private int show_id;

    @DatabaseField(canBeNull = false, useGetSet = true, columnName = S_NAME)
    private String s_name;

    @DatabaseField(canBeNull = false, useGetSet = true, columnName = GENRE)
    private String genre;

    @DatabaseField(canBeNull = false, useGetSet = true, columnName = SEASONS)
    private String seasons;


    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public int getShow_id() {
        return show_id;
    }

    public void setShow_id(int show_id) {
        this.show_id = show_id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSeasons() {
        return seasons;
    }

    public void setSeasons(String seasons) {
        this.seasons = seasons;
    }



}
