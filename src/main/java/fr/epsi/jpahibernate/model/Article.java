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
    private String prix;

    @Column(name = "libelle", unique = true)
    private String libelle;

    @ManyToMany(mappedBy = "articles")
    private List<Commande> commandes;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public List<Commande> getCommandes() { return commandes; }

    public void setCommandes(List<Commande> commandes) { this.commandes = commandes; }
}
