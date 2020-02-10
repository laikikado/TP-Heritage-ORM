package fr.epsi.jpahibernate.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;

@Entity
@Table(name = "groupe")
public class Groupe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany
     private Collection<CD> cds ;

    public Collection<CD> getCds() {
        return cds;
    }

    public void setCds(Collection<CD> cds) {
        this.cds = cds;
    }
    
}
