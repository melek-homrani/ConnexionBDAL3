package Service;

import Entite.Enseignant;
import Utils.DataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EnseignantService implements IService<Enseignant>{


    private Statement ste;

    private static EnseignantService ser;

    private EnseignantService() {
        try {
            Connection con1 = DataSource.getInstance().getCon();
            ste = con1.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static EnseignantService getInstance() {
        if (ser == null) ser = new EnseignantService();
        return ser;
    }
    @Override
    public void add(Enseignant enseignant) throws SQLException {
        String req = "INSERT INTO `enseignant` (`id`, `nom`, `prenom`, `age`, `nomUtilisateur`, `email`, `motDePasse`,`idFormation`) VALUES (NULL, '" + enseignant.getNom() + "', '" + enseignant.getPrenom() + "', '" + enseignant.getAge() + "', '" + enseignant.getnomUtilisateur() + "', '" + enseignant.getemail() + "', '" + enseignant.getmotDePasse() + "');";
        ste.executeUpdate(req);
    }

    @Override
    public boolean delete(Enseignant enseignant) throws SQLException {
        String req = "DELETE FROM `enseignant` WHERE id='" + enseignant.getId() + "';";
        int rowsDeleted = ste.executeUpdate(req);
        return rowsDeleted > 0;
    }

    @Override
    public boolean update(Enseignant enseignant) throws SQLException {
        String req = "UPDATE `enseignant` SET `nom`='" + enseignant.getNom() + "', `prenom`='" + enseignant.getPrenom() + "', `age`='" + enseignant.getAge() + "', `nomUtilisateur`='" + enseignant.getnomUtilisateur() + "', `email`='" + enseignant.getemail() + "', `motDePasse`='" + enseignant.getmotDePasse() + "' WHERE id='" + enseignant.getId() + "';";
        int rowsUpdated = ste.executeUpdate(req);
        return rowsUpdated > 0;
    }

    @Override
    public Enseignant findById(Enseignant enseignant) throws SQLException {
        String req = "SELECT * FROM `enseignant` WHERE id='" + enseignant.getId() + "';";
        ResultSet res = ste.executeQuery(req);
        if (res.next()) {
            int id = res.getInt(1);
            String nom = res.getString(2);
            String prenom = res.getString("prenom");
            int age = res.getInt("age");
            String nomUtilisateur = res.getString("nomUtilisateur");
            String email = res.getString("email");
            String motDePasse = res.getString("motDePasse");
            return new Enseignant(id, nom, prenom, age, nomUtilisateur, email, motDePasse);
        }
        return null;
    }

    @Override
    public List<Enseignant> findAll() throws SQLException {
        List<Enseignant> enseignants = new ArrayList<>();
        String req = "SELECT * FROM `etudiant`;";
        ResultSet res = ste.executeQuery(req);
        while (res.next()) {
            int id = res.getInt(1);
            String nom = res.getString("nom");
            String prenom = res.getString("prenom");
            int age = res.getInt("age");
            String nomUtilisateur = res.getString("nomUtilisateur");
            String email = res.getString("email");
            String motDePasse = res.getString("motDePasse");
            Enseignant enseignant = new Enseignant(id, nom, prenom, age, nomUtilisateur, email, motDePasse);
            enseignants.add(enseignant);
        }
        return enseignants;
    }
}
