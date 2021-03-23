import isi.entites.Professeur;
import isi.service.IProfesseur;
import isi.service.ProfesseurImpl;

import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        IProfesseur ip = new ProfesseurImpl();
        Map<Integer,Professeur> lp = ip.list();
        ip.affichage(lp);
    }
}
