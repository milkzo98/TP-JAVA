package sn.isi.service;

import sn.isi.entities.Consultant;
import sn.isi.entities.Employer;

import java.util.Scanner;

public class EmployerImpl implements IEmployer{
    @Override
    public Employer saisie() {
        Scanner scan = new Scanner(System.in);
        Employer e = new Employer();

        System.out.println("Entrer l'ID de l'employer");
        e.setIdPers(Integer.parseInt(scan.nextLine()));
        System.out.println("Entrer le nom de l'employer");
        e.setNomPers(scan.nextLine());
        System.out.println("Entrer le prenom de l'employer");
        e.setPrenomPers(scan.nextLine());
        System.out.println("Entrer l'email de l'employer");
        e.setEmail(scan.nextLine());
        System.out.println("Entrer le password de l'employer");
        e.setPassword(scan.nextLine());
        System.out.println("Entrer l'etat de l'employer");
        e.setEtat(Integer.parseInt(scan.nextLine()));

        return e;

    }

    @Override
    public void affichage(Employer e) {

        System.out.println("ID :" + e.getIdPers());
        System.out.println("Nom :" + e.getNomPers());
        System.out.println("Prenom :" + e.getPrenomPers());
        System.out.println("Email :" + e.getEmail());
        System.out.println("Password :" + e.getPassword());
        System.out.println("Etat :" + e.getEtat());

    }
}
