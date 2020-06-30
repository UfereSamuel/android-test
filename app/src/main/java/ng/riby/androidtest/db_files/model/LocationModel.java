package ng.riby.androidtest.db_files.model;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class LocationModel {
    @PrimaryKey(autoGenerate = true)
    private int loc_id;

    @ColumnInfo(name = "latitude")
    private Double latitude;

    @ColumnInfo(name = "longitude")
    private Double longitude;

    public LocationModel(int loc_id, Double longitude, Double latitude) {
        this.loc_id = loc_id;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getLoc_id() {
        return loc_id;
    }

    public void setLoc_id(int loc_id) {
        this.loc_id = loc_id;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LocationModel)) return false;

        LocationModel model = (LocationModel) o;

        if (loc_id != model.loc_id) return false;

        return longitude != null? longitude.equals(model.longitude) : model.longitude == null;
    }

    @Override
    public int hashCode(){
        int result = loc_id;
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        return result;
    }

    @Override
    public String toString(){
        return "LocationModel{" +
                "loc_id=" + loc_id +
                ", longitude=' " + longitude + '\'' +
                ", latitude=' " + latitude + '\'' +
                '}';

    }


}
