package fr.epsi.jpahibernate.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.OneToMany;

public class Commande {
    
    @OneToMany
    private List<Article> articles = new ArrayList<>();
    
}
