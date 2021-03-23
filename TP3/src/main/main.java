package main;

import sn.isi.entities.Consultant;
import sn.isi.entities.Employer;
import sn.isi.service.ConsultantImpl;
import sn.isi.service.EmployerImpl;
import sn.isi.service.IConsultant;
import sn.isi.service.IEmployer;


public class main {
    public static void main(String[] args){
        IConsultant ic = new ConsultantImpl();
        Consultant c = ic.saisie();
        ic.affichage (c);

        IEmployer ie = new EmployerImpl();
        Employer e = ie.saisie();
        ie.affichage (e);


    }
}
