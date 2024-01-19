package Service;

import Entite.Personne;
import Utils.DataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServicePersonne implements IService<Personne> {

    private Statement ste;

    private static ServicePersonne ser;

    private ServicePersonne() {
        try {
            Connection con1 = DataSource.getInstance().getCon();
            ste = con1.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static ServicePersonne getInstance() {
        if (ser == null) ser = new ServicePersonne();
        return ser;
    }

    @Override
    public void ajouter(Personne personne) throws SQLException {
        String req = "INSERT INTO `personne` (`id`, `nom`, `prenom`, `age`) VALUES (NULL, '" + personne.getNom() + "', '" + personne.getPrenom() + "', '" + personne.getAge() + "');";

        ste.executeUpdate(req);

    }

    @Override
    public boolean supprimer(Personne personne) throws SQLException {
        return false;
    }

    @Override
    public boolean update(Personne personne) throws SQLException {
        return false;
    }

    @Override
    public Personne findById(Personne personne) throws SQLException {
        return null;
    }

    @Override
    public List<Personne> readAll() throws SQLException {
        List<Personne> l1 = new ArrayList<>();
        ResultSet res = ste.executeQuery("select  * from personne");
        while (res.next()) {
            int id = res.getInt(1);
            String nom = res.getString(2);
            String prenom = res.getString("prenom");
            int age = res.getInt("age");
            System.out.println("id :" + id + "nom :" + nom + "prenom :" + prenom + " age :" + age);
            Personne p = new Personne(id, nom, prenom, age);
            l1.add(p);

        }

        return l1;
    }
}
