package com.miguelcr.a07_restaurantlistfragment;

/**
 * Created by miguelcampos on 13/2/18.
 */

public class Cats {
    private String raceName;
    private String urlPhoto;
    private int rate;

    public Cats(String raceName, String urlPhoto, int rate) {
        this.raceName = raceName;
        this.urlPhoto = urlPhoto;
        this.rate = rate;
    }

    public String getName() {
        return raceName;
    }

    public void setName(String name) {
        this.raceName = name;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
