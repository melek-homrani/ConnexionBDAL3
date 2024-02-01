package Service;

import Entite.Etudiant;
import Utils.DataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EtudiantService implements IService<Etudiant>{


    private Statement ste;

    private static EtudiantService ser;

    private EtudiantService() {
        try {
            Connection con1 = DataSource.getInstance().getCon();
            ste = con1.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static EtudiantService getInstance() {
        if (ser == null) ser = new EtudiantService();
        return ser;
    }
    @Override
    public void add(Etudiant etudiant) throws SQLException {
        String req = "INSERT INTO `etudiant` (`id`, `nom`, `prenom`, `age`, `nomUtilisateur`, `email`, `motDePasse`) VALUES (NULL, '" + etudiant.getNom() + "', '" + etudiant.getPrenom() + "', '" + etudiant.getAge() + "', '" + etudiant.getnomUtilisateur() + "', '" + etudiant.getemail() + "', '" + etudiant.getmotDePasse() + "');";
        ste.executeUpdate(req);
    }

    @Override
    public boolean delete(Etudiant etudiant) throws SQLException {
        String req = "DELETE FROM `etudiant` WHERE id='" + etudiant.getId() + "';";
        int rowsDeleted = ste.executeUpdate(req);
        return rowsDeleted > 0;
    }

    @Override
    public boolean update(Etudiant etudiant) throws SQLException {
        String req = "UPDATE `etudiant` SET `nom`='" + etudiant.getNom() + "', `prenom`='" + etudiant.getPrenom() + "', `age`='" + etudiant.getAge() + "', `nomUtilisateur`='" + etudiant.getnomUtilisateur() + "', `email`='" + etudiant.getemail() + "', `motDePasse`='" + etudiant.getmotDePasse() + "' WHERE id='" + etudiant.getId() + "';";
        int rowsUpdated = ste.executeUpdate(req);
        return rowsUpdated > 0;
    }

    @Override
    public Etudiant findById(Etudiant etudiant) throws SQLException {
        String req = "SELECT * FROM `etudiant` WHERE id='" + etudiant.getId() + "';";
        ResultSet res = ste.executeQuery(req);
        if (res.next()) {
            int id = res.getInt(1);
            String nom = res.getString(2);
            String prenom = res.getString("prenom");
            int age = res.getInt("age");
            String nomUtilisateur = res.getString("nomUtilisateur");
            String email = res.getString("email");
            String motDePasse = res.getString("motDePasse");
            return new Etudiant(id, nom, prenom, age, nomUtilisateur, email, motDePasse, 10);
        }
        return null;
    }

    @Override
    public List<Etudiant> findAll() throws SQLException {
        List<Etudiant> etudiants = new ArrayList<>();
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
            Etudiant etudiant = new Etudiant(id, nom, prenom, age, nomUtilisateur, email, motDePasse, 10);
            etudiants.add(etudiant);
        }
        return etudiants;
    }
}
