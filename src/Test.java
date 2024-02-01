import Entite.Etudiant;
import Service.EtudiantService;

import java.sql.*;

public class Test {
    static String url = "jdbc:mysql://localhost:3306/esprit";
    static String user = "root";
    static String pwd = "";
    static Connection con;

    static Statement ste;

    public static void main(String[] args) {

        try {
            con = DriverManager.getConnection(url, user, pwd);
            System.out.println("connexion établie");
        } catch (SQLException e) {
            System.out.println(e);
        }
       // String req = "INSERT INTO `personne` (`id`, `nom`, `prenom`, `age`) VALUES (NULL, 'test', 'test', '20');";
        Etudiant e1 =new Etudiant(1,"Melek","homrani",22,"MELEKESPRIT01","melek@aa.com","12345678",1);
        try {

            EtudiantService a=EtudiantService.getInstance();
            a.add(e1);
        } catch (SQLException e) {
            System.out.println(e);
        }
        try {

            ResultSet res = ste.executeQuery("select  * from personne");
            while (res.next()) {
                int id = res.getInt(1);
                String nom = res.getString(2);
                String prenom = res.getString("prenom");
                int age = res.getInt("age");
                System.out.println("id :" + id + "nom :" + nom + "prenom :" + prenom + " age :" + age);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
