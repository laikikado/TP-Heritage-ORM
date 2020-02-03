package fr.epsi.jpahibernate.model;

import java.util.Collection;
import javax.persistence.OneToMany;

public class Realisateur extends DVD {
        
    @OneToMany(mappedBy="realisateur")
     private Collection<DVD> dvds ;

    public Collection<DVD> getDvds() {
        return dvds;
    }

    public void setDvds(Collection<DVD> dvds) {
        this.dvds = dvds;
    }
    
}
