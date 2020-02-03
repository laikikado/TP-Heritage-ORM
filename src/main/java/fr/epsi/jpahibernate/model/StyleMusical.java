package fr.epsi.jpahibernate.model;

import java.util.Collection;
import javax.persistence.OneToMany;

public class StyleMusical extends CD {
    
    @OneToMany(mappedBy="stylemusical")
     private Collection<CD> cds ;

    public Collection<CD> getCds() {
        return cds;
    }

    public void setCds(Collection<CD> cds) {
        this.cds = cds;
    }
    
}
