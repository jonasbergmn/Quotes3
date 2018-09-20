package data;

import database.Database;

import java.util.List;

public class Runde {

    private Frage frage;
    private Antwort a2;
    private Antwort a3;
    private Antwort a4;

    public void getFrage(Frage f){
        this.frage = f;
        Database d = new Database();
        List<Antwort> antwortListe = d.getListAllAntworten();


        for(int i = 0; i<antwortListe.size(); i++){
            if(antwortListe.get(i).getAntwort().equals(frage.getAntwort())){
                i++;
                }
            else {
                a2 = antwortListe.get(i);
                break;
            }
            }
        }
    }

