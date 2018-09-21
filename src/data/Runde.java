package data;

import database.Database;

import java.util.List;

public class Runde {

    private Frage frage;
    private Antwort a2;
    private Antwort a3;
    private Antwort a4;
    private int x;
    private int y;
    private int z;
    private List<Antwort> antwortListe;

    public Runde(){
        Database d = new Database();
        this.antwortListe = d.getListAllAntworten();
    }

    public void getFrage(Frage f) {
        this.frage = f;
    }


    public void setAntworten(){

        this.x = (int) (Math.random() * ((antwortListe.size() - 0) + 0) + 0);

        for(int i = 0; i<antwortListe.size();i++) {
            if (antwortListe.get(x).antwort.equals(frage.getAntwort())) {
                x++;
            } else {
                a2.setAntwort(antwortListe.get(x).getAntwort());
            }
        }
    }


    public int setA2(){
       this.x = (int) (Math.random() * ((antwortListe.size() - 0) + 0) + 0);

        while(antwortListe.get(x).getAntwort().equals(frage.getAntwort())){
            this.x = (int) (Math.random() * ((antwortListe.size() - 0) + 0) + 0);
        }
        return x;
    }

    public int setA3(){
        this.y = (int) (Math.random() * ((antwortListe.size() - 0) + 0) + 0);
        while(x == y || antwortListe.get(y).getAntwort().equals(frage.getAntwort())){
            this.y = (int) (Math.random() * ((antwortListe.size() - 0) + 0) + 0);
        }
        return y;
    }

    public int setA4(){
        this.z = (int) (Math.random() * ((antwortListe.size() - 0) + 0) + 0);
        while(x == z || y==z || antwortListe.get(x).getAntwort().equals(frage.getAntwort())){
            this.z = (int) (Math.random() * ((antwortListe.size() - 0) + 0) + 0);
        }
        return z;
    }

    public String getRichtigeAntwort(){
       String a = frage.getAntwort();
        return a;
    }

    public List<Antwort> getAntwortListe(){
        return antwortListe;
    }


}

