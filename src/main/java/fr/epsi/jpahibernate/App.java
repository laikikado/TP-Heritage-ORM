package fr.epsi.jpahibernate;

import javax.persistence.Persistence;

public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("orm-jdbc-quete");

    }
    
}
