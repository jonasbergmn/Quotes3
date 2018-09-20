package sample;

import data.Frage;
import database.Database;
import database.fillDb;
import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public Button button1;


    public void button1Click(){
        Database d = new Database();
        System.out.println(d.getSizeFrage());
        List<Frage> l = d.getListAllFragen();
        System.out.println(l.get(0).getFrage());
        System.out.println(l.get(1).getFrage());



    }



}
