package sn.isi.entities;

public class Consultant extends Personne{

    private int nbheure;
    private double TauxHoraire;

    public Consultant() {
    }

    public Consultant(int idPers, String nomPers, String prenomPers, int nbheure, double tauxHoraire) {
        super(idPers, nomPers, prenomPers);
        this.nbheure = nbheure;
        TauxHoraire = tauxHoraire;
    }

    public int getNbheure() {
        return nbheure;
    }

    public void setNbheure(int nbheure) {
        this.nbheure = nbheure;
    }

    public double getTauxHoraire() {
        return TauxHoraire;
    }

    public void setTauxHoraire(double tauxHoraire) {
        TauxHoraire = tauxHoraire;
    }
}
