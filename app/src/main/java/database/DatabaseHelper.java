package database;

import java.sql.SQLException;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.nfc.Tag;


import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;




/**
 * Created by D on 20.05.2015.
 */



public class DatabaseHelper extends OrmLiteSqliteOpenHelper {

    private static final String DATABASE_NAME = "database.db";
    private static final int DATABASE_VERSION = 1;

    private Dao<Show, Integer> showDataDao;
    private Dao<Episode, Integer> episodeDataDao;
    private Dao<Season, Integer> seasonDataDao;


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            TableUtils.dropTable(connectionSource, Show.class, true);
            TableUtils.dropTable(connectionSource, Season.class, true);
            TableUtils.dropTable(connectionSource, Episode.class, true);


            TableUtils.createTable(connectionSource, Show.class);
            TableUtils.createTable(connectionSource, Season.class);
            TableUtils.createTable(connectionSource, Episode.class);


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try {
            TableUtils.dropTable(connectionSource, Tag.class, true);
            TableUtils.dropTable(connectionSource, Season.class, true);
            TableUtils.dropTable(connectionSource, Episode.class, true);


            this.onCreate(database, connectionSource);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Dao<Show, Integer> getShowDataDao() throws SQLException {
        if (this.showDataDao == null) {
            showDataDao = getDao(Show.class);
        }

        return this.showDataDao;
    }

    public Dao<Season, Integer> getSeasonDataDao() throws SQLException {
        if (this.seasonDataDao == null) {
            seasonDataDao = getDao(Season.class);
        }

        return this.seasonDataDao;
    }

    public Dao<Episode, Integer> getEpisodeDataDao() throws SQLException {
        if (this.episodeDataDao == null) {
            episodeDataDao = getDao(Episode.class);
        }

        return this.episodeDataDao;
    }



}
