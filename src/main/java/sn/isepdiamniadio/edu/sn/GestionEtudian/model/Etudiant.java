package sn.isepdiamniadio.edu.sn.GestionEtudian.model;

public class Etudiant {
    private Long id;
    private String nom;
    private String prenom;
    private String adress;

    public Etudiant(Long id, String nom, String prenom, String adress) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adress = adress;
    }

    public Etudiant() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
