package org.example.pres;

import org.example.dao.IDao;
import org.example.metier.IMetier;

import java.io.File;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("config.txt"));

        String daoClassName = scanner.nextLine();
        Class cd = Class.forName(daoClassName);
        IDao d = (IDao) cd.getConstructor().newInstance();

        String metierClassName = scanner.nextLine();
        Class m = Class.forName(metierClassName);
        IMetier metier = (IMetier) m.getConstructor(IDao.class).newInstance(d);


        System.out.println(metier.calcul());

        System.out.println();
    }
}
