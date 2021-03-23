package main;

import sn.isi.entities.User;
import sn.isi.service.IUser;
import sn.isi.service.UserImpl;

public class main {
    public static void main(String[] args){
        IUser iu = new UserImpl();
        User u = iu.saisie();
        iu.affichage (u);
    }
}
