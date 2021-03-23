package sn.isi.entities;

public class Service {

    private int idS;
    private String nomS;

    public Service() {
    }

    public Service(int idS, String nomS) {
        this.idS = idS;
        this.nomS = nomS;
    }

    public int getIdS() {
        return idS;
    }

    public void setIdS(int idS) {
        this.idS = idS;
    }

    public String getNomS() {
        return nomS;
    }

    public void setNomS(String nomS) {
        this.nomS = nomS;
    }
}
