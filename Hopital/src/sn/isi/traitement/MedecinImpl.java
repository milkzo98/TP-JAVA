package sn.isi.traitement;


import java.util.Scanner;

import sn.isi.entities.Medecin;
import sn.isi.entities.MedecinChef;
import sn.isi.entities.MedecinGeneraliste;
import sn.isi.entities.MedecinSpecialiste;

public class MedecinImpl implements IMedecin {

		private Scanner scan = new Scanner(System.in);

		@Override
		public Medecin saisie() {
			Medecin m = null;
			String rep = null;
			boolean b = false;
			do {
				System.out.println("Veuiller saisr la specialite du medecin");
				rep = scan.nextLine();
				if (rep.equalsIgnoreCase("c") || rep.equalsIgnoreCase("g") || rep.equalsIgnoreCase("s"))
					b = true;
			}while(b == false);
			
			
			if (rep.equalsIgnoreCase("c")) {
				m = new MedecinChef();
				System.out.println("Veuiller saisir le bureau");
				String bureau = scan.nextLine();
				((MedecinChef)m).setBureau(bureau);
			}
			
			if (rep.equalsIgnoreCase("g"))
			{
				m = new MedecinGeneraliste();
				System.out.println("Veuiller saisir la liste des specialites");
				String listeSpecialistes = scan.nextLine();
				((MedecinGeneraliste)m).setListeSpecialistes(listeSpecialistes);
			}
			
			
			if (rep.equalsIgnoreCase("s"))
			{
				m = new MedecinSpecialiste();
				System.out.println("Veuiller saisir un specialite");
				String specialite = scan.nextLine();
				((MedecinSpecialiste)m).setSpecialite(specialite);
			}
			
			System.out.println("ID ");
			int id = Integer.parseInt(scan.nextLine());
			m.setId(id);
			System.out.println("NOM ");
			String nomP = scan.nextLine();
		    m.setNomP(nomP);
			System.out.println("PRENOM");
			String prenomP = scan.nextLine();
			m.setPrenomP(prenomP);
			
			
			return m;
		}
		

		@Override
		public void affichage(Medecin medecin) {
			System.out.println("ID " + medecin.getId());
			System.out.println("PRENOM " + medecin.getPrenomP());
			System.out.println("NOM " + medecin.getNomP());


			if (medecin instanceof MedecinChef) {
				System.out.println("Bureau"+((MedecinChef)medecin).getBureau() );
			}
			
			
			if (medecin instanceof MedecinGeneraliste) {
				System.out.println("ListeSpecialiste"+((MedecinGeneraliste)medecin).getListeSpecialistes());
			}
			
			
			if (medecin instanceof MedecinSpecialiste) {
				System.out.println("Specialite"+((MedecinSpecialiste)medecin).getSpecialite());
			}
			
			
			
			
		}
	

}
