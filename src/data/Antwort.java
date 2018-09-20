package data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Antwort {


    @Id
    @GeneratedValue
    public long idAnswer;
    public String antwort;

    public Antwort(String antwort){
        this.antwort = antwort;
    }

    public String getAntwort() {
        return antwort;
    }

    public void setAntwort(String antwort) {
        this.antwort = antwort;
    }

}
