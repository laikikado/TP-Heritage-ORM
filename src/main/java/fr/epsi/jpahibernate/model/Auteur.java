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
    private int nom;
    
    @Column(name = "prenom", unique = true)
    private int prenom;
    
    @ManyToMany(mappedBy = "auteurs")
    private List<Livre> livres;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNom() {
        return nom;
    }

    public void setNom(int nom) {
        this.nom = nom;
    }

    public int getPrenom() {
        return prenom;
    }

    public void setPrenom(int prenom) {
        this.prenom = prenom;
    }

    public List<Livre> getLivres() { return livres; }

    public void setLivres(List<Livre> livres) { this.livres = livres; }
}
