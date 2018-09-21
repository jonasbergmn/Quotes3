package data;

import java.util.Random;

public class ArrayMischen {

    public int[] getZahlen() {
        return zahlen;
    }

    public void setZahlen(int[] zahlen) {
        this.zahlen = zahlen;
    }

    int[] zahlen = {0,1,2,3};

    public int[] mischen(){

        int tmp;
        int rand;
        Random r = new Random();
        for (int i = 0; i < zahlen.length; i++) {
            rand = r.nextInt(zahlen.length);
            tmp = zahlen[i];
            zahlen[i] = zahlen[rand];
            zahlen[rand] = tmp;
        }
        return zahlen;
    }
}
