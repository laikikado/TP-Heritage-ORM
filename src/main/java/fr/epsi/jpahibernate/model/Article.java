package fr.epsi.jpahibernate.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "prix")
    private int prix;

    @Column(name = "libelle", unique = true)
    private int libelle;
}
