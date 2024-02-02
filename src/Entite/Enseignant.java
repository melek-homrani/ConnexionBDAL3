package Entite;

public class Enseignant extends Utilisateur{
    public Enseignant() {
    }

    public Enseignant(int idUtilisateur) {
        super(idUtilisateur);
    }

    public Enseignant(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    public Enseignant(int idUtilisateur, String nom, String prenom, int age) {
        super(idUtilisateur, nom, prenom, age);
    }

    public Enseignant(String nomUtilisateur, String email, String motDePasse) {
        super(nomUtilisateur, email, motDePasse);
    }

    public Enseignant(String nom, String prenom, int age, String nomUtilisateur, String email, String motDePasse) {
        super(nom, prenom, age, nomUtilisateur, email, motDePasse);
    }

    public Enseignant(int idUtilisateur, String nom, String prenom, int age, String nomUtilisateur, String email, String motDePasse) {
        super(idUtilisateur, nom, prenom, age, nomUtilisateur, email, motDePasse);
    }
}
