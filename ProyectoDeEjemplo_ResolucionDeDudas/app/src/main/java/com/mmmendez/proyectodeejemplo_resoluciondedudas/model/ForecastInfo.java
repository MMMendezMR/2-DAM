
package com.mmmendez.proyectodeejemplo_resoluciondedudas.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ForecastInfo {

    @SerializedName("cod")
    @Expose
    private String cod;
    @SerializedName("message")
    @Expose
    private Double message;
    @SerializedName("cnt")
    @Expose
    private Long cnt;
    @SerializedName("list")
    @Expose
    private java.util.List<WeatherList> list = null;
    @SerializedName("city")
    @Expose
    private City city;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ForecastInfo() {
    }

    /**
     * 
     * @param message
     * @param cnt
     * @param cod
     * @param list
     * @param city
     */
    public ForecastInfo(String cod, Double message, Long cnt, java.util.List<WeatherList> list, City city) {
        super();
        this.cod = cod;
        this.message = message;
        this.cnt = cnt;
        this.list = list;
        this.city = city;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public Double getMessage() {
        return message;
    }

    public void setMessage(Double message) {
        this.message = message;
    }

    public Long getCnt() {
        return cnt;
    }

    public void setCnt(Long cnt) {
        this.cnt = cnt;
    }

    public java.util.List<WeatherList> getList() {
        return list;
    }

    public void setList(java.util.List<WeatherList> list) {
        this.list = list;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForecastInfo)) return false;

        ForecastInfo that = (ForecastInfo) o;

        if (getCod() != null ? !getCod().equals(that.getCod()) : that.getCod() != null)
            return false;
        if (getMessage() != null ? !getMessage().equals(that.getMessage()) : that.getMessage() != null)
            return false;
        if (getCnt() != null ? !getCnt().equals(that.getCnt()) : that.getCnt() != null)
            return false;
        if (getList() != null ? !getList().equals(that.getList()) : that.getList() != null)
            return false;
        return getCity() != null ? getCity().equals(that.getCity()) : that.getCity() == null;
    }

    @Override
    public int hashCode() {
        int result = getCod() != null ? getCod().hashCode() : 0;
        result = 31 * result + (getMessage() != null ? getMessage().hashCode() : 0);
        result = 31 * result + (getCnt() != null ? getCnt().hashCode() : 0);
        result = 31 * result + (getList() != null ? getList().hashCode() : 0);
        result = 31 * result + (getCity() != null ? getCity().hashCode() : 0);
        return result;
    }
}
