package sn.isi.service;

import sn.isi.entities.Consultant;
import sn.isi.entities.Personne;

import java.util.Scanner;

public class ConsultantImpl implements IConsultant{
    @Override
    public Consultant saisie() {
        Scanner scan = new Scanner(System.in);
        Consultant c = new Consultant();

        System.out.println("Entrer l'ID du consultant");
        c.setIdPers(Integer.parseInt(scan.nextLine()));
        System.out.println("Entrer le nom du consultant");
        c.setNomPers(scan.nextLine());
        System.out.println("Entrer le prenom du consultant");
        c.setPrenomPers(scan.nextLine());
        System.out.println("Entrer le nombre d'heure du consultant");
        c.setNbheure(Integer.parseInt(scan.nextLine()));
        System.out.println("Entrer le taux horaire du consultant");
        c.setTauxHoraire(Double.parseDouble((scan.nextLine())));

        return c;

    }

    @Override
    public void affichage(Consultant c) {

        System.out.println("ID :" + c.getIdPers());
        System.out.println("Nom :" + c.getNomPers());
        System.out.println("Prenom :" + c.getPrenomPers());
        System.out.println("NBheure :" + c.getNbheure());
        System.out.println("Taux Horaire :" + c.getTauxHoraire());
    }
}
