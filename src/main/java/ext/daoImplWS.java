package ext;
import dao.*;

public class daoImplWS implements Idao{

    public double getData(){
        System.out.println("Version web service!!");
        double tempe=40.77;
        return tempe;
    }
}
