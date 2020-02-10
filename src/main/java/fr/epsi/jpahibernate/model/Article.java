package fr.epsi.jpahibernate.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("Article")
@Table(name = "article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "prix")
    private int prix;

    @Column(name = "libelle", unique = true)
    private int libelle;

    @ManyToMany(mappedBy = "articles")
    private List<Commande> commandes;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getLibelle() {
        return libelle;
    }

    public void setLibelle(int libelle) {
        this.libelle = libelle;
    }

    public List<Commande> getCommandes() { return commandes; }

    public void setCommandes(List<Commande> commandes) { this.commandes = commandes; }
}
