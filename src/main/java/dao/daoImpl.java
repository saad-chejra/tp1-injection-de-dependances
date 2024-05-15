package dao;

public class daoImpl implements Idao{

    public double getData() {
        System.out.println("Version base de données :");
        double temp =Math.random()*40;
        return temp;
    }
}
