package isi.service;

import isi.entites.Matiere;
import isi.entites.Professeur;

import java.util.*;

public class ProfesseurImpl implements IProfesseur {
    Scanner s = new Scanner(System.in);
    String r = null;
    @Override
    public Professeur creation() {

        // ArrayList<Matiere>lm = null;
        Professeur p = new Professeur();
        System.out.println("Entrer l'id du professeur");
        p.setId(Integer.parseInt(s.nextLine()));
        System.out.println("Entrer le nom du professeur");
        p.setNom(s.nextLine());
        System.out.println("Entrer le prenom du professeur");
        p.setPrenom(s.nextLine());
        ArrayList<Matiere>lMatieres = new ArrayList<Matiere>();
        do {
            Matiere m = new Matiere();
            IProfesseur ip = new ProfesseurImpl();
            System.out.println("Entrer l'id de la matiere enseigner par le  professeur");
            m.setIdM(Integer.parseInt(s.nextLine()));
            System.out.println("Entrer l'id de la matiere enseigner par le  professeur");
            m.setNomM(s.nextLine());
            ip.creation().getlMatiere().add(m);
            System.out.println("voulez-vous continuer de saisir une matier? o/n");
            r = s.nextLine();
        }while(r.equalsIgnoreCase("o"));
        p.setlMatiere(lMatieres);
        return p;
    }

    @Override
    public Map<Integer, Professeur> list() {
        int i=0;
        String r = null;
        Map<Integer, Professeur> mp = null;
            i++;
            mp = new Hashtable<Integer, Professeur>();
            mp.put(i,creation());
            System.out.println("voulez-vous continuer a ajoute o/n");
            r = s.nextLine();
        System.out.println("0k");
        return mp;
    }

    @Override
    public void affichage(Map<Integer, Professeur> lProfesseurs) {
       Collection<Professeur> profs =  lProfesseurs.values();

        for (Professeur p: profs){
            System.out.println("Professeur numero ");
            System.out.println("nom "+p.getNom());
            System.out.println("prenom "+p.getPrenom());
            System.out.println("id "+p.getId());
            System.out.println("---------------Matiere------");
            for (Matiere m :p.getlMatiere())
            {
                System.out.println("ID matiere : "+m.getIdM());
                System.out.println("NOM matiere : "+m.getNomM());
            }
    }
}



}



