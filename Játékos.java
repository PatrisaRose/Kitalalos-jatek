package jatekindito;

import java.util.Random;


public class Játékos {
    Random r = new Random();
    private int tipp;
    
    public int GetTipp (){
        return this.tipp;
    }
    
    public void tippel (){
        this.tipp = r.nextInt(9 - 0)+ 0;
        System.out.println("tippelésem: " + this.tipp);
    }
}
