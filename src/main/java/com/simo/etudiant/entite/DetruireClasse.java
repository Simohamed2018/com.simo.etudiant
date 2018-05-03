package com.simo.etudiant.entite;


public class DetruireClasse {
    private String fichier;

    public String getFichier() {
        return fichier;
    }

    public void setFichier(String fichier) {
        this.fichier = fichier;
    }

    public DetruireClasse() {
    }

    public DetruireClasse(String fichier) {

        this.fichier = fichier;
    }
}
