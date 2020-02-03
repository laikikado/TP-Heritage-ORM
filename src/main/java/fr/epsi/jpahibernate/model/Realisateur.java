package fr.epsi.jpahibernate.model;

public class Realisateur extends DVD {
        
    @OneToMany(mappedBy="realisateur")
     private Collection<DVD> dvds ;

    public <any> getDvds() {
        return dvds;
    }

    public void setDvds(<any> dvds) {
        this.dvds = dvds;
    }
    
}
