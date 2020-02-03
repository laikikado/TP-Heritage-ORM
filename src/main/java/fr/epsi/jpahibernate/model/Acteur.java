package fr.epsi.jpahibernate.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Acteur extends DVD {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nom")
    private int nom;
    
    @Column(name = "prenom")
    private int prenom;
}
