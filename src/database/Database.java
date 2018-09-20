package database;

import data.Antwort;
import data.Antwort;
import data.Frage;
import data.Frage;

import javax.persistence.*;
import java.util.List;

public class Database {

    public void addAntwort(String s){
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("$objectdb/db/Quotes2.odb");
        EntityManager em = emf.createEntityManager();
        Antwort a = new Antwort(s);
        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    public void addAntwort(Antwort s){
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("$objectdb/db/Quotes2.odb");
        EntityManager em = emf.createEntityManager();
        Antwort a = s;
        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }



    public void addFrage(Frage frage){
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("$objectdb/db/Quotes2.odb");
        EntityManager em = emf.createEntityManager();
        Frage a = frage;
        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();
        em.close();
        emf.close();

    }



    public int getSizeFrage(){
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("$objectdb/db/Quotes2.odb");
        EntityManager em = emf.createEntityManager();
        Query q1 = em.createQuery("SELECT COUNT(id) FROM Frage q");
        String s  = q1.getSingleResult().toString();
        int i = Integer.parseInt(s);
        //System.out.println("Anzahl Fragen: " + q1.getSingleResult());
        em.close();
        emf.close();
        return i;
    }

    public int getSizeAnswer(){
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("$objectdb/db/Quotes2.odb");
        EntityManager em = emf.createEntityManager();
        Query q1 = em.createQuery("SELECT COUNT(id) FROM Antwort a");
        String s  = q1.getSingleResult().toString();
        int i = Integer.parseInt(s);
        //System.out.println("Anzahl Fragen: " + q1.getSingleResult());
        em.close();
        emf.close();
        return i;
    }

    public List<Frage> getListAllFragen(){
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("$objectdb/db/Quotes2.odb");
        EntityManager em = emf.createEntityManager();
        TypedQuery<Frage> q1 = em.createQuery("Select q FROM Frage q", Frage.class);
        List<Frage> results = q1.getResultList();
        em.close();
        emf.close();
        return results;
    }

    public List<Antwort> getListAllAntworten(){
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("$objectdb/db/Quotes2.odb");
        EntityManager em = emf.createEntityManager();
        TypedQuery<Antwort> q1 = em.createQuery("Select q FROM Antwort q", Antwort.class);
        List<Antwort> results = q1.getResultList();
        em.close();
        emf.close();
        return results;
    }




}
