
package com.mmmendez.proyectodeejemplo_resoluciondedudas.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Coord {

    @SerializedName("lat")
    @Expose
    private Double lat;
    @SerializedName("lon")
    @Expose
    private Double lon;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Coord() {
    }

    /**
     * 
     * @param lon
     * @param lat
     */
    public Coord(Double lat, Double lon) {
        super();
        this.lat = lat;
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coord)) return false;

        Coord coord = (Coord) o;

        if (getLat() != null ? !getLat().equals(coord.getLat()) : coord.getLat() != null)
            return false;
        return getLon() != null ? getLon().equals(coord.getLon()) : coord.getLon() == null;
    }

    @Override
    public int hashCode() {
        int result = getLat() != null ? getLat().hashCode() : 0;
        result = 31 * result + (getLon() != null ? getLon().hashCode() : 0);
        return result;
    }
}
