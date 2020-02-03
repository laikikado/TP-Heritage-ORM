package fr.epsi.jpahibernate.model;

public class DVD extends Article {
    
    @ManyToOne
    private Categorie categorie;
    
    @ManyToOne
    private Realisateur realisateur ;
    
    @OneToMany(mappedBy="dvd")
    private List<Acteur> acteurs = new ArrayList<>();

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Realisateur getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(Realisateur realisateur) {
        this.realisateur = realisateur;
    }

    public <any> getActeurs() {
        return acteurs;
    }

    public void setActeurs(<any> acteurs) {
        this.acteurs = acteurs;
    }
    
}
