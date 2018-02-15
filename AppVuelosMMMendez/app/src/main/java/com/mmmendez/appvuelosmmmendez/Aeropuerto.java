package com.mmmendez.appvuelosmmmendez;



/**
 * Created by mmmendez on 15/02/2018.
 */

public class Aeropuerto {
    private String nombre;
    private int rate;
    private Long precio;
    private String fech_salida;
    private String salida;
    private String destino;
    private String companyia;
    private String url;

    public Aeropuerto(String nombre, int rate, Long precio, String fech_salida, String salida, String destino, String companyia, String url) {
        this.nombre = nombre;
        this.rate = rate;
        this.precio = precio;
        this.fech_salida = fech_salida;
        this.salida = salida;
        this.destino = destino;
        this.companyia = companyia;
        this.url = url;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public String getFech_salida() {
        return fech_salida;
    }

    public void setFech_salida(String fech_salida) {
        this.fech_salida = fech_salida;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getCompanyia() {
        return companyia;
    }

    public void setCompanyia(String companyia) {
        this.companyia = companyia;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
