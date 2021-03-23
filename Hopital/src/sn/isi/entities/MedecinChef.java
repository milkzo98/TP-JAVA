package sn.isi.entities;

public class MedecinChef extends Medecin  {
	private String bureau;

	
	public MedecinChef(int id, String nomP, String prenomP, Services service, String bureau) {
		super(id, nomP, prenomP, service);
		this.bureau = bureau;
	}

	public MedecinChef() {
		
	}

	public String getBureau() {
		return bureau;
	}

	public void setBureau(String bureau) {
		this.bureau = bureau;
	}

}
