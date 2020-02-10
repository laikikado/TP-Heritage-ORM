package fr.epsi.jpahibernate;

import fr.epsi.jpahibernate.dao.ActeurDao;
import fr.epsi.jpahibernate.model.Acteur;
import fr.epsi.jpahibernate.model.DVD;

import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("orm-jdbc-quete");
        DVD dvd = new DVD();
        dvd.setLibelle("Libelle");
        List<DVD> dvdList = new ArrayList<>();
        dvdList.add(dvd);
        Acteur acteur = new Acteur();
        acteur.setNom("Nom");
        acteur.setPrenom("Prenom");
        acteur.setDvds(dvdList);
        ActeurDao acteurDao = new ActeurDao();
        acteurDao.addActeur(acteur);
    }
}
