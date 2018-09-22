package sample;

import data.Antwort;
import data.ArrayMischen;
import data.Frage;
import data.Runde;
import database.Database;
import database.fillDb;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    public Button button1;
    public Button antwort1;
    public Button antwort2;
    public Button antwort3;
    public Button antwort4;
    public Label fragenLabel;
    public TextField textfield1;
    public TextField textfield2;
    public Button addQuestion;
    private int counter = 0;
    List<Runde> rundenListe;


    public void button1Click(){

        rundenListe = rundenListeErstellen();
        //System.out.println("test" + rundenListe.size());
        setButtonText();
        System.out.println(rundenListe.get(counter).getRichtigeAntwort());
        System.out.println(rundenListe.get(counter).getRichtigeAntwort());
        counter++;

        /*Database d = new Database();
        //System.out.println(d.getSizeFrage());
        List<Frage> l = d.getListAllFragen();
        //System.out.println(l.get(0).getFrage());
        //System.out.println(l.get(1).getFrage());
        Runde r = new Runde();
        r.getFrage(l.get(0));

        System.out.println(r.getRichtigeAntwort());
        System.out.println(r.getAntwortListe().get(r.setA2()).getAntwort());
        System.out.println(r.getAntwortListe().get(r.setA3()).getAntwort());
        System.out.println(r.getAntwortListe().get(r.setA4()).getAntwort());
        String[] s = new String[4];
        //System.out.println(s.length);
        s[0] = r.getRichtigeAntwort();
        s[1] = r.getAntwortListe().get(r.setA2()).getAntwort();
        s[2] = r.getAntwortListe().get(r.setA3()).getAntwort();
        s[3] = r.getAntwortListe().get(r.setA4()).getAntwort();


        ArrayMischen am = new ArrayMischen();
        am.mischen();
        for(int i = 0; i<am.getZahlen().length; i++){
            System.out.println(am.getZahlen()[i]);
        }

        String[] s2 = new String[4];

        s2[0] = s[am.getZahlen()[0]];
        s2[1] = s[am.getZahlen()[1]];
        s2[2] = s[am.getZahlen()[2]];
        s2[3] = s[am.getZahlen()[3]];

        for(int i = 0; i<s2.length; i++){
            System.out.println(s2[i]);
        }

        r.setAlleAntworten(s2);*/


}


    public List<Runde> rundenListeErstellen(){

        int i = 0;
        Database d = new Database();
        List<Frage> lf = d.getListAllFragen();
        List<Runde> lr = new ArrayList<Runde>();

        while(i < lf.size()){
            Runde r = new Runde();
            r.getFrage(lf.get(i));
            String[] s = new String[4];
            //System.out.println(s.length);
            s[0] = r.getRichtigeAntwort();
            s[1] = r.getAntwortListe().get(r.setA2()).getAntwort();
            s[2] = r.getAntwortListe().get(r.setA3()).getAntwort();
            s[3] = r.getAntwortListe().get(r.setA4()).getAntwort();
            ArrayMischen am = new ArrayMischen();
            am.mischen();
            //for(int j = 0; j<am.getZahlen().length; j++){
            //    System.out.println(am.getZahlen()[j]);
            //}
            String[] s2 = new String[4];

            s2[0] = s[am.getZahlen()[0]];
            s2[1] = s[am.getZahlen()[1]];
            s2[2] = s[am.getZahlen()[2]];
            s2[3] = s[am.getZahlen()[3]];
            r.setAlleAntworten(s2);
            lr.add(r);
            i++;
        }

        return lr;

}


    public void antwort1Click(ActionEvent actionEvent) {
        if(antwort1.getText().equals(rundenListe.get(counter-1).getRichtigeAntwort())){
            System.out.println("Richtig");

        } else {
            System.out.println("Falsch");

        }
    }

    public void antwort2Click(ActionEvent actionEvent) {
        if(antwort2.getText().equals(rundenListe.get(counter-1).getRichtigeAntwort())){
            System.out.println("Richtig");

        } else {
            System.out.println("Falsch");

        }
    }

    public void antwort3Click(ActionEvent actionEvent) {
        if(antwort3.getText().equals(rundenListe.get(counter-1).getRichtigeAntwort())){
            System.out.println("Richtig");

        } else {
            System.out.println("Falsch");

        }
    }

    public void antwort4Click(ActionEvent actionEvent) {
        if(antwort4.getText().equals(rundenListe.get(counter-1).getRichtigeAntwort())){
            System.out.println("Richtig");

        } else {
            System.out.println("Falsch");

        }
    }

    public void setButtonText(){

        fragenLabel.setText(rundenListe.get(counter).getFrageString());

        antwort1.setText(rundenListe.get(counter).getAlleAntworten()[0]);
        antwort2.setText(rundenListe.get(counter).getAlleAntworten()[1]);
        antwort3.setText(rundenListe.get(counter).getAlleAntworten()[2]);
        antwort4.setText(rundenListe.get(counter).getAlleAntworten()[3]);
    }


    public void addQuestionClick(){
        Database d = new Database();
        Frage f = new Frage(textfield1.getText(), textfield2.getText());
        d.addFrage(f);
        Antwort a = new Antwort(f.getAntwort());
        d.addAntwort(a);
    }

}
