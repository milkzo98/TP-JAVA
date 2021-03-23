package sn.isi.service;

import sn.isi.entities.User;

import java.util.Scanner;

public class UserImpl implements IUser {

Scanner scan = new Scanner(System.in);
    @Override
    public User  saisie() {
        User u = new User();
        System.out.println("Entrer l'ID du User");
        u.setId(Integer.parseInt(scan.nextLine()));
        System.out.println("Entrer le nom du User");
        u.setNom(scan.nextLine());
        System.out.println("Entrer le prenom du User");
        u.setPrenom(scan.nextLine());
        System.out.println("Entrer l'email du User");
        u.setEmail(scan.nextLine());
        System.out.println("Entrer le password du User");
        u.setPassword(scan.nextLine());
        System.out.println("Entrer l'etat du User");
        u.setEtat(Integer.parseInt(scan.nextLine()));
        return u;
    }

    @Override
    public void affichage(User user) {

        System.out.println("ID :" + user.getId());
        System.out.println("Nom :" + user.getNom());
        System.out.println("Prenom :" + user.getPrenom());
        System.out.println("Email :" + user.getEmail());
        System.out.println("Password :" + user.getPassword());
        System.out.println("Etat :" + user.getEtat());

    }
}
