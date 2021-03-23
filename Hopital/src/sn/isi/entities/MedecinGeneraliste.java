package sn.isi.entities;

public class MedecinGeneraliste extends Medecin {
private String listeSpecialistes;

	

	public MedecinGeneraliste() {
		
	}

	public MedecinGeneraliste(int id, String nomP, String prenomP, Services service, String listeSpecialistes) {
	super(id, nomP, prenomP, service);
	this.listeSpecialistes = listeSpecialistes;
	}

	public String getListeSpecialistes() {
		return listeSpecialistes;
	}

	public void setListeSpecialistes(String listeSpecialistes) {
		this.listeSpecialistes = listeSpecialistes;
	}

}
