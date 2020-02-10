package fr.epsi.jpahibernate.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@DiscriminatorValue("DVD")
public class DVD extends Article implements Serializable {
    
    @ManyToOne
    private Categorie categorie;
    
    @ManyToOne
    private Realisateur realisateur;
    
    @ManyToMany(mappedBy = "dvds")
    private List<Acteur> acteurs;

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Realisateur getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(Realisateur realisateur) {
        this.realisateur = realisateur;
    }

    public List<Acteur> getActeurs() {
        return acteurs;
    }

    public void setActeurs(List<Acteur> acteurs) {
        this.acteurs = acteurs;
    }
    
}
