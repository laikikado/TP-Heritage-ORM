package fr.epsi.jpahibernate.model;

public class Livre extends Article {
    
    @OneToMany(mappedBy="livre")
    private List<Auteur> auteurs = new ArrayList<>();

    public <any> getAuteurs() {
        return auteurs;
    }

    public void setAuteurs(<any> auteurs) {
        this.auteurs = auteurs;
    }
   
}
