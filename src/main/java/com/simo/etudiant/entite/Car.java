package com.simo.etudiant.entite;

/**
 * Created by Simohamed on 2018-05-03.
 */
public class Car{
private String modele;

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public Car(String modele) {
        this.modele = modele;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "modele='" + modele + '\'' +
                '}';
    }
}
