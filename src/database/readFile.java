package database;

import data.Frage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class readFile {

    public List<Frage> readFile() throws IOException {

        List<Frage> ls = new ArrayList<Frage>();

        FileReader fr = new FileReader("/Users/jonasbergmann/Desktop/test.txt");
        BufferedReader br = new BufferedReader(fr);

        String zeile = "";

        while( (zeile = br.readLine()) != null )
        {
            Frage f = new Frage(zeile, "");
            ls.add(f);
            //ls.get(i).setFrage(zeile);
            //ls.get(i).setFrage(br.readLine());
            //ls.get(i).setAntwort(br.readLine());
            //System.out.println(ls.get(i).getFrage());
            //System.out.println(ls.get(i).getAntwort());
            br.readLine();
        }

        br.close();

        FileReader fr2 = new FileReader("/Users/jonasbergmann/Desktop/test.txt");
        BufferedReader br2 = new BufferedReader(fr2);

        String zeile2 = "";

        //br2.readLine();
        int y = 0;

        while(br2.readLine() != null )
        {

            ls.get(y).setAntwort(br2.readLine());
            //ls.get(i).setFrage(br.readLine());
            //ls.get(i).setAntwort(br.readLine());
            //System.out.println(ls.get(i).getFrage());
            //System.out.println(ls.get(i).getAntwort());
            y++;
        }

        //System.out.println(ls.size());


        for(int j = 0; j<ls.size(); j++){
            System.out.println(ls.get(j).getFrage());
            System.out.println(ls.get(j).getAntwort());
        }


        br2.close();
        return ls;
    }

}
