package ng.riby.androidtest.db_files;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import ng.riby.androidtest.db_files.dao.LocationDao;
import ng.riby.androidtest.db_files.model.LocationModel;
import ng.riby.androidtest.util.Constant;

@Database(entities = {LocationModel.class}, version = 1)

public abstract class LocationDatabase extends RoomDatabase {
    public abstract LocationDao getLocationDao();

    public static LocationDatabase locationDB;

    public static LocationDatabase getInstance(Context context) {
        if (null == locationDB) {
            locationDB = buildDatabaseInstance(context);
        }

        return locationDB;
    }

    private static LocationDatabase buildDatabaseInstance(Context context) {
        return Room.databaseBuilder(context, LocationDatabase.class, Constant.DB_NAME).allowMainThreadQueries().build();
    }

    public void cleanUp(){
        locationDB = null;
    }
}
