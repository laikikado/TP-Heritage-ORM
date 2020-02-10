package fr.epsi.jpahibernate.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@DiscriminatorValue("CD")
public class CD extends Article implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Artiste artiste;
    
    @ManyToOne
    private StyleMusical stylemusical;

    public Artiste getArtiste() {
        return artiste;
    }

    public void setArtiste(Artiste artiste) {
        this.artiste = artiste;
    }

    public StyleMusical getStylemusical() {
        return stylemusical;
    }

    public void setStylemusical(StyleMusical stylemusical) {
        this.stylemusical = stylemusical;
    } 
    
}
