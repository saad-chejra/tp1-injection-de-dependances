package pres;
import metier.*;
import dao.*;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class presentationInstDyna {

    public static void main(String[] args) throws Exception {
        //Instanciation dynamique
        Scanner sc=new Scanner(new File("config.txt"));
        String classdao=sc.nextLine();

        //charger la classe on memoire
        Class cidao=Class.forName(classdao);

        //instancier la classe dynamiquement
        Idao da=(Idao)cidao.getConstructor().newInstance();

        String classmetier=sc.nextLine();
        Class cmetier=Class.forName(classmetier);
        Imetier me=(Imetier)cmetier.getConstructor().newInstance();
        //appeler la methode setDao() d'une maniere dynamique
        Method setDao=cmetier.getDeclaredMethod("setDao", Idao.class);
        //on va executer la methode pour un objet de type Imetier
        setDao.invoke(me,da);

        System.out.println("Resultat=>"+me.calcule());


    }
}
