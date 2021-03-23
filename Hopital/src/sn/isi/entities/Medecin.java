package sn.isi.entities;

public class Medecin extends Personne {
	private Services service;

	
	  public Medecin () {  
	    }
	 
	
	 
	public Medecin(int id, String nomP, String prenomP, Services service) {
		super(id, nomP, prenomP);
		this.service = service;
	}



	public Services getService() {
		return service;
	}

	public void setService(Services service) {
		this.service = service;
	}

}
