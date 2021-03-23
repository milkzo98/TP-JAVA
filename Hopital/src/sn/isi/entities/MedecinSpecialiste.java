package sn.isi.entities;

public class MedecinSpecialiste extends Medecin {
	private String specialite;

	

	public MedecinSpecialiste() {
		
	}
	
	public MedecinSpecialiste(int id, String nomP, String prenomP, Services service, String specialite) {
		super(id, nomP, prenomP, service);
		this.specialite = specialite;
	}


	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	

}
