package com.simo.etudiant.entite;

/**
 * Created by Simohamed on 2018-05-03.
 */
public class Nouvelle {

    //coomentaire
    protected String place;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Nouvelle{" +
                "place='" + place + '\'' +
                '}';
    }

    public Nouvelle(String place) {
        this.place = place;
    }
}
