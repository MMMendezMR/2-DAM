
package com.mmmendez.proyectodeejemplo_resoluciondedudas.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Wind {

    @SerializedName("speed")
    @Expose
    private Long speed;
    @SerializedName("deg")
    @Expose
    private Double deg;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Wind() {
    }

    /**
     * 
     * @param speed
     * @param deg
     */
    public Wind(Long speed, Double deg) {
        super();
        this.speed = speed;
        this.deg = deg;
    }

    public Long getSpeed() {
        return speed;
    }

    public void setSpeed(Long speed) {
        this.speed = speed;
    }

    public Double getDeg() {
        return deg;
    }

    public void setDeg(Double deg) {
        this.deg = deg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wind)) return false;

        Wind wind = (Wind) o;

        if (getSpeed() != null ? !getSpeed().equals(wind.getSpeed()) : wind.getSpeed() != null)
            return false;
        return getDeg() != null ? getDeg().equals(wind.getDeg()) : wind.getDeg() == null;
    }

    @Override
    public int hashCode() {
        int result = getSpeed() != null ? getSpeed().hashCode() : 0;
        result = 31 * result + (getDeg() != null ? getDeg().hashCode() : 0);
        return result;
    }
}
