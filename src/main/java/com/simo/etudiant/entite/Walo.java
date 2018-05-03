package com.simo.etudiant.entite;

/**
 * Created by Simohamed on 2018-05-03.
 */
public class Walo {
    private String walo;
    private int flouse;
    private double price;

    public String getWalo() {
        return walo;
    }

    public void setWalo(String walo) {
        this.walo = walo;
    }

    public int getFlouse() {
        return flouse;
    }

    public void setFlouse(int flouse) {
        this.flouse = flouse;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Walo() {
    }

    public Walo(String walo, int flouse, double price) {
        this.walo = walo;
        this.flouse = flouse;
        this.price = price;
    }
}
