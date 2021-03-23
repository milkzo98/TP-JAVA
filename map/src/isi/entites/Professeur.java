package isi.entites;

import java.util.ArrayList;

public class Professeur {
    private int id;
    private String prenom;
    private String nom;

    public ArrayList<Matiere> getlMatiere() {
        return lMatiere;
    }

    public void setlMatiere(ArrayList<Matiere> lMatiere) {
        this.lMatiere = lMatiere;
    }

    private ArrayList<Matiere>lMatiere;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }



}
