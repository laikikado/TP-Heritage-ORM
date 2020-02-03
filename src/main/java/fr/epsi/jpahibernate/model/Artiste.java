package fr.epsi.jpahibernate.model;

public class Artiste extends CD {
        
    @OneToMany(mappedBy="artiste")
     private Collection<CD> cds ;

    public <any> getCds() {
        return cds;
    }

    public void setCds(<any> cds) {
        this.cds = cds;
    }
    
}
