
package com.mmmendez.proyectodeejemplo_resoluciondedudas.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sys {

    @SerializedName("pod")
    @Expose
    private String pod;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sys() {
    }

    /**
     * 
     * @param pod
     */
    public Sys(String pod) {
        super();
        this.pod = pod;
    }

    public String getPod() {
        return pod;
    }

    public void setPod(String pod) {
        this.pod = pod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sys)) return false;

        Sys sys = (Sys) o;

        return getPod() != null ? getPod().equals(sys.getPod()) : sys.getPod() == null;
    }

    @Override
    public int hashCode() {
        return getPod() != null ? getPod().hashCode() : 0;
    }
}
