package sn.isi.entities;

public class Personne {
	 protected int id;
	 protected String nomP;
	 protected String prenomP;
	 
	    public Personne (){
	    	
	    }
	 
	 
	    public Personne (int id,String nomP,String prenomP) {
	        this.nomP = nomP;
	        this.prenomP = prenomP;
	    }
	 
	 // Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomP() {
		return nomP;
	}
	public void setNomP(String nomP) {
		this.nomP = nomP;
	}
	public String getPrenomP() {
		return prenomP;
	}
	public void setPrenomP(String prenomP) {
		this.prenomP = prenomP;
	}

}
