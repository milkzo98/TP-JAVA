package sn.isi.entities;

public class Employer extends Personne{

    private String email;
    private String password;
    private int etat;


    public Employer() {
    }

    public Employer(int idPers, String nomPers, String prenomPers, String email, String password, int etat) {
        super(idPers, nomPers, prenomPers);
        this.email = email;
        this.password = password;
        this.etat = etat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }
}
