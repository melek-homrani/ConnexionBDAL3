package Entite;

import java.util.Date;

public class Utilisateur extends Personne {

    private String nomUtilisateur;
    private String email;
    private String motDePasse;

    public Utilisateur() {
    }

    public Utilisateur(int idUtilisateur) {
        super(idUtilisateur);
    }


    public Utilisateur(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    public Utilisateur(int idUtilisateur, String nom, String prenom, int age) {
        super(idUtilisateur, nom, prenom, age);
    }

    public Utilisateur(String nomUtilisateur, String email, String motDePasse) {
        this.nomUtilisateur = nomUtilisateur;
        this.email = email;
        this.motDePasse = motDePasse;
    }

    public Utilisateur(String nom, String prenom, int age, String nomUtilisateur, String email, String motDePasse) {
        super(nom, prenom, age);
        this.nomUtilisateur = nomUtilisateur;
        this.email = email;
        this.motDePasse = motDePasse;
    }

    public Utilisateur(int idUtilisateur, String nom, String prenom, int age, String nomUtilisateur, String email, String motDePasse) {
        super(idUtilisateur, nom, prenom, age);
        this.nomUtilisateur = nomUtilisateur;
        this.email = email;
        this.motDePasse = motDePasse;
    }

    public String getnomUtilisateur() {
        return nomUtilisateur;
    }

    public void setnomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getmotDePasse() {
        return motDePasse;
    }

    public void setmotDePasee(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    @Override
    public String toString() {
        return "Utilisateur{" + "idUtilisateur=" + this.getId() + ", nom=" + this.getNom() + ", prenom=" + this.getPrenom() + ",nomUtilisateur=" + nomUtilisateur + ",email=" + email + "motDePasse=" + motDePasse + '}';
    }
}