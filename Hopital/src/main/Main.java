package main;

import sn.isi.entities.Medecin;
import sn.isi.traitement.IMedecin;
import sn.isi.traitement.MedecinImpl;

public class Main {
	public static void main(String[] args) {
		IMedecin im = new MedecinImpl();
		Medecin m = im.saisie();
		im.affichage (m);
	}

}
