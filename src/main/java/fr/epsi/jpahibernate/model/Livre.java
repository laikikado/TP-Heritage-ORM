package fr.epsi.jpahibernate.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("Livre")
public class Livre extends Article implements Serializable {

    @ManyToMany
    private List<Auteur> auteurs;

    public List<Auteur> getAuteurs() {
        return auteurs;
    }

    public void setAuteurs(List<Auteur> auteurs) {
        this.auteurs = auteurs;
    }
}
