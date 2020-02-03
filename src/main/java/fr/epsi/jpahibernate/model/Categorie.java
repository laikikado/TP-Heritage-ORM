package fr.epsi.jpahibernate.model;

public class Categorie {
    
    @OneToMany(mappedBy="categorie")
     private Collection<DVD> dvds ;

    public <any> getDvds() {
        return dvds;
    }

    public void setDvds(<any> dvds) {
        this.dvds = dvds;
    }
    
}
