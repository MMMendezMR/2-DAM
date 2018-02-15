
package com.mmmendez.proyectodeejemplo_resoluciondedudas.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Clouds {

    @SerializedName("all")
    @Expose
    private Long all;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Clouds() {
    }

    /**
     * 
     * @param all
     */
    public Clouds(Long all) {
        super();
        this.all = all;
    }

    public Long getAll() {
        return all;
    }

    public void setAll(Long all) {
        this.all = all;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clouds)) return false;

        Clouds clouds = (Clouds) o;

        return getAll() != null ? getAll().equals(clouds.getAll()) : clouds.getAll() == null;
    }

    @Override
    public int hashCode() {
        return getAll() != null ? getAll().hashCode() : 0;
    }
}
