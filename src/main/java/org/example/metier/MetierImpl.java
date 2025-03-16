package org.example.metier;
import org.example.dao.IDao;
import org.example.dao.DaoImpl;

public class MetierImpl implements IMetier{
    //couplage faible
    private IDao dao = new DaoImpl( );
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 23;
        return res;
    }
    public void setDao(IDao dao){
        this.dao = dao;
    }
}