package isi.service;

import isi.entites.Professeur;

import java.util.Map;

public interface IProfesseur {
    public Professeur creation();
    public Map<Integer,Professeur>list();
    public void affichage(Map<Integer,Professeur>lProfesseurs);
}
