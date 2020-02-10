package fr.epsi.jpahibernate.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "commande")
public class Commande implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private int quantite;

    @ManyToMany
    private List<Article> articles;

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public int getQuantite() { return quantite; }

    public void setQuantite(int quantite) { this.quantite = quantite; }

    public List<Article> getArticles() { return articles; }

    public void setArticles(List<Article> articles) { this.articles = articles; }
}
