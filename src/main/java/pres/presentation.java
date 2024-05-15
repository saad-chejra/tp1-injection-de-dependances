package pres;

import metier.*;
import dao.*;

public class presentation {

    public static void main(String[] args) {
        daoImplC dao = new daoImplC();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);

        System.out.print("Resultat="+metier.calcule());

    }



}
