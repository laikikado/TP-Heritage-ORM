package fr.epsi.jpahibernate.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.OneToMany;

public class Livre extends Article {
    
    @OneToMany(mappedBy="livre")
    private List<Auteur> auteurs = new ArrayList<>();

    public List<Auteur> getAuteurs() {
        return auteurs;
    }

    public void setAuteurs(List<Auteur> auteurs) {
        this.auteurs = auteurs;
    }
   
}
