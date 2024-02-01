package Entite;

public class Etudiant extends Utilisateur {
    private int idFormation;

    public Etudiant() {
    }

    public Etudiant(int idFormation) {
        this.idFormation = idFormation;
    }

    public Etudiant(int idFormation, int idUtilisateur) {
        super(idUtilisateur);
        this.idFormation = idFormation;
    }



    public Etudiant(int idUtilisateur, String nom, String prenom, int age, String nomUtilisateur, String email, String motDePasse, int idFormation) {
        super(idUtilisateur, nom, prenom, age, nomUtilisateur, email, motDePasse);
        this.idFormation = idFormation;
    }

    public int getIdFormation() {
        return idFormation;
    }

    public void setIdFormation(int idFormation) {
        this.idFormation = idFormation;
    }
}
