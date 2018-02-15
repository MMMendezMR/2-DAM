
package com.mmmendez.proyectodeejemplo_resoluciondedudas.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WeatherList {

    @SerializedName("dt")
    @Expose
    private Long dt;
    @SerializedName("main")
    @Expose
    private Main main;
    @SerializedName("weather")
    @Expose
    private java.util.List<WeatherInfo> weather = null;
    @SerializedName("clouds")
    @Expose
    private Clouds clouds;
    @SerializedName("wind")
    @Expose
    private Wind wind;
    @SerializedName("sys")
    @Expose
    private Sys sys;
    @SerializedName("dt_txt")
    @Expose
    private String dtTxt;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WeatherList() {
    }

    /**
     * 
     * @param clouds
     * @param dt
     * @param wind
     * @param sys
     * @param dtTxt
     * @param weather
     * @param main
     */
    public WeatherList(Long dt, Main main, java.util.List<WeatherInfo> weather, Clouds clouds, Wind wind, Sys sys, String dtTxt) {
        super();
        this.dt = dt;
        this.main = main;
        this.weather = weather;
        this.clouds = clouds;
        this.wind = wind;
        this.sys = sys;
        this.dtTxt = dtTxt;
    }

    public Long getDt() {
        return dt;
    }

    public void setDt(Long dt) {
        this.dt = dt;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public java.util.List<WeatherInfo> getWeather() {
        return weather;
    }

    public void setWeather(java.util.List<WeatherInfo> weather) {
        this.weather = weather;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public String getDtTxt() {
        return dtTxt;
    }

    public void setDtTxt(String dtTxt) {
        this.dtTxt = dtTxt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WeatherList)) return false;

        WeatherList list = (WeatherList) o;

        if (getDt() != null ? !getDt().equals(list.getDt()) : list.getDt() != null) return false;
        if (getMain() != null ? !getMain().equals(list.getMain()) : list.getMain() != null)
            return false;
        if (getWeather() != null ? !getWeather().equals(list.getWeather()) : list.getWeather() != null)
            return false;
        if (getClouds() != null ? !getClouds().equals(list.getClouds()) : list.getClouds() != null)
            return false;
        if (getWind() != null ? !getWind().equals(list.getWind()) : list.getWind() != null)
            return false;
        if (getSys() != null ? !getSys().equals(list.getSys()) : list.getSys() != null)
            return false;
        return getDtTxt() != null ? getDtTxt().equals(list.getDtTxt()) : list.getDtTxt() == null;
    }

    @Override
    public int hashCode() {
        int result = getDt() != null ? getDt().hashCode() : 0;
        result = 31 * result + (getMain() != null ? getMain().hashCode() : 0);
        result = 31 * result + (getWeather() != null ? getWeather().hashCode() : 0);
        result = 31 * result + (getClouds() != null ? getClouds().hashCode() : 0);
        result = 31 * result + (getWind() != null ? getWind().hashCode() : 0);
        result = 31 * result + (getSys() != null ? getSys().hashCode() : 0);
        result = 31 * result + (getDtTxt() != null ? getDtTxt().hashCode() : 0);
        return result;
    }
}
