package fr.epsi.jpahibernate.model;

import java.util.Collection;
import javax.persistence.OneToMany;

public class Groupe extends CD {
    
    @OneToMany(mappedBy="groupe")
     private Collection<CD> cds ;

    public Collection<CD> getCds() {
        return cds;
    }

    public void setCds(Collection<CD> cds) {
        this.cds = cds;
    }
    
}
