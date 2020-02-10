package fr.epsi.jpahibernate.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "auteur")
public class Auteur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nom", unique = true)
    private String nom;
    
    @Column(name = "prenom", unique = true)
    private String prenom;
    
    @ManyToMany(mappedBy = "auteurs")
    private List<Livre> livres;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public List<Livre> getLivres() { return livres; }

    public void setLivres(List<Livre> livres) { this.livres = livres; }
}
