package fr.epsi.jpahibernate.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;

@Entity
@Table(name = "categorie")
public class Categorie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy="categorie")
     private Collection<DVD> dvds ;

    public Collection<DVD> getDvds() {
        return dvds;
    }

    public void setDvds(Collection<DVD> dvds) {
        this.dvds = dvds;
    }
    
}
