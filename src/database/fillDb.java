package database;

import data.Antwort;
import data.Frage;

public class fillDb {

    public void fill() {

        System.out.println("Test");
        Database d = new Database();

        Antwort a1 = new Antwort("Antwort 1");
        Frage f1 = new Frage(a1, "Frage 1");

        Antwort a2 = new Antwort("Antwort 2");
        Frage f2 = new Frage(a2, "Frage 2");

        Antwort a3 = new Antwort("Antwort 3");
        Frage f3 = new Frage(a3, "Frage 3");

        Antwort a4 = new Antwort("Antwort 4");
        Frage f4 = new Frage(a4, "Frage 4");

        Antwort a5 = new Antwort("Antwort 5");
        Frage f5 = new Frage(a5, "Frage 5");

        d.addAntwort(a1);
        d.addAntwort(a2);
        d.addAntwort(a3);
        d.addAntwort(a4);
        d.addAntwort(a5);
        d.addFrage(f1);
        d.addFrage(f2);
        d.addFrage(f3);
        d.addFrage(f4);
        d.addFrage(f5);
    }

}
