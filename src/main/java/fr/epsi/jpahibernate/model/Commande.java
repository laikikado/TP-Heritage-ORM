package fr.epsi.jpahibernate.model;

public class Commande {
    
    @OneToMany
    private<Article> articles;
    
}
