package sn.isi.entities;

public class Services {
	 protected int id;
	 protected String nom;
	 
	  public Services () {
	   
	    }
	 
	  public Services (int id,String nom) {
	        this.nom = nom;
	   
	    }
	 
	 
	 //Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	    

}
