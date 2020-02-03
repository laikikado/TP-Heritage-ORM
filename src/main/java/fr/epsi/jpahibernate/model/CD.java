package fr.epsi.jpahibernate.model;

public class CD extends Article {
    
    @ManyToOne
    private Artiste artiste;
    
    @ManyToOne
    private Groupe groupe;
    
    @ManyToOne
    private StyleMusical stylemusical;

    public Artiste getArtiste() {
        return artiste;
    }

    public void setArtiste(Artiste artiste) {
        this.artiste = artiste;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public StyleMusical getStylemusical() {
        return stylemusical;
    }

    public void setStylemusical(StyleMusical stylemusical) {
        this.stylemusical = stylemusical;
    } 
    
}
