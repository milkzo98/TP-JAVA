package sn.isi.entities;

public class MedecinGeneraliste extends Medecin {
    public MedecinGeneraliste() {
    }

    public MedecinGeneraliste(Services service) {
        super(service);
    }

    public MedecinGeneraliste(int idPers, String nomPers, String prenomPers, Services service) {
        super(idPers, nomPers, prenomPers, service);
    }
}
