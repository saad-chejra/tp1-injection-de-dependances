package metier;
import dao.*;

public class MetierImpl implements Imetier{

    private Idao dao;

    //Injecter dans la variable un objet de type Idao
    public void setDao(Idao dao){
        this.dao=dao;
    }

    public double calcule(){
        double tmp=this.dao.getData();
        double res=tmp*540/Math.cos(tmp*Math.PI);

        return res;


    }
}
