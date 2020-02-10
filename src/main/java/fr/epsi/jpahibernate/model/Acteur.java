package fr.epsi.jpahibernate.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "acteur")
public class Acteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nom")
    private int nom;
    
    @Column(name = "prenom")
    private int prenom;
    
    @ManyToMany
    private List<DVD> dvds;

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

    public List<DVD> getDvds() { return dvds; }

    public void setDvds(List<DVD> dvds) { this.dvds = dvds; }
}
