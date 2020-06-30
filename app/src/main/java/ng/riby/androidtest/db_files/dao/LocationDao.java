package ng.riby.androidtest.db_files.dao;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;

import ng.riby.androidtest.db_files.model.LocationModel;

@Dao
public interface LocationDao {
//    @Query("SELECT * FROM user")
//    List<LocationModel> getAll();
//
//    @Query("SELECT * FROM user WHERE uid IN (:userIds)")
//    List<LocationModel> loadAllByIds(int[] userIds);
//
//    @Query("SELECT * FROM user WHERE longitude LIKE :first AND " +
//            "latitude LIKE :last LIMIT 1")
//    LocationModel findByName(String first, String last);

    @Insert
    void insertAll(LocationModel users);

    @Delete
    void delete(LocationModel user);


}
