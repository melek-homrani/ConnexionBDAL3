package Test;

import Entite.Personne;
import Service.ServicePersonne;

import java.sql.SQLException;
import java.util.List;

public class Test {
    public static void main(String[] args) {


        ServicePersonne ser=ServicePersonne.getInstance();

        Personne p1=new Personne("bbb","oons",12);

        try {
            ser.ajouter(p1);
        }catch (SQLException e)
        {
            System.out.println(e);
        }

        List<Personne> l=null;
       try {
           l = ser.readAll();
       }catch (SQLException e)
       {
           System.out.println(e);
       }
       l.forEach(e-> System.out.println(e));
    }
}
