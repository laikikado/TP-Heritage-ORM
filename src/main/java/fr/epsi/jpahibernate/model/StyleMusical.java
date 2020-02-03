package fr.epsi.jpahibernate.model;

public class StyleMusical extends CD {
    
    @OneToMany(mappedBy="stylemusical")
     private Collection<CD> cds ;

    public <any> getCds() {
        return cds;
    }

    public void setCds(<any> cds) {
        this.cds = cds;
    }
    
}
