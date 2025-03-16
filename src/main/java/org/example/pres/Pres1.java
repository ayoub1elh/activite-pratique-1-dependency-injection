package org.example.pres;
import org.example.dao.DaoImpl;
import org.example.metier.MetierImpl;

public class Pres1{
    public static void main(String[] args){
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);
        System.out.println("RES = " + metier.calcul());
    }
}
