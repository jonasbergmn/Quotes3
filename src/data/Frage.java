package data;

import database.Database;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Frage {
    @Id @GeneratedValue
    private long id;

    private Antwort a1;
    private Antwort a2;
    private Antwort a3;
    private Antwort a4;

    private String antwort;
    private String frage;


    public Frage(Antwort a1, Antwort a2, Antwort a3, Antwort a4, String frage, String antwort){
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.frage = frage;
        this.antwort = antwort;
    }

    public Frage(Antwort a1, String frage){
        this.antwort = a1.getAntwort();
        this.frage = frage;
    }


    public Antwort getA1() {
        return a1;
    }

    public void setA1(Antwort a1) {
        this.a1 = a1;
    }

    public Antwort getA2() {
        return a2;
    }

    public void setA2(Antwort a2) {
        this.a2 = a2;
    }

    public Antwort getA3() {
        return a3;
    }

    public void setA3(Antwort a3) {
        this.a3 = a3;
    }

    public Antwort getA4() {
        return a4;
    }

    public void setA4(Antwort a4) {
        this.a4 = a4;
    }

    public String getAntwort() {
        return antwort;
    }

    public void setAntwort(String antwort) {
        this.antwort = antwort;
    }

    public String getFrage() {
        return frage;
    }

    public void setFrage(String frage) {
        this.frage = frage;
    }


    public Frage(String frage, String antwort){
        this.antwort = antwort;
        this.frage = frage;
    }

}
