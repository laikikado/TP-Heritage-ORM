package fr.epsi.jpahibernate.model;

public class Groupe extends CD {
    
    @OneToMany(mappedBy="groupe")
     private Collection<CD> cds ;

    public <any> getCds() {
        return cds;
    }

    public void setCds(<any> cds) {
        this.cds = cds;
    }
    
}
