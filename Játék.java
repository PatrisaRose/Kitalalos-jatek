package jatekindito;

import java.util.Random;

public class Játék {
    Random r = new Random();
    
    private Játékos j1 = new Játékos();
    private Játékos j2 = new Játékos();
    private Játékos j3 = new Játékos();
    
   public void start(){
       System.out.println("Gondoltam egy számra 0 és 9 között...");
       int kitalalandoSzam = r.nextInt(9 - 0);
       this.j1 = new Játékos();
       this.j2 = new Játékos();
       this.j3 = new Játékos();
       boolean vanNyertes = false;
       while (vanNyertes != true){
            System.out.println("A kitalálandó szám:" + kitalalandoSzam);
            j1.tippel();
            j2.tippel();
            j3.tippel();
            System.out.println("1. Játékos tippje: " + j1.GetTipp());
            System.out.println("2. Játékos tippje: " + j2.GetTipp());
            System.out.println("3. Játékos tippje: " + j3.GetTipp());
            if (kitalalandoSzam == j1.GetTipp() || kitalalandoSzam == j2.GetTipp() || kitalalandoSzam == j3.GetTipp()){
                vanNyertes = true;
                boolean nyertes1 =  kitalalandoSzam == j1.GetTipp();
                boolean nyertes2 =  kitalalandoSzam == j2.GetTipp();
                boolean nyertes3 =  kitalalandoSzam == j3.GetTipp();
                System.out.println("Van nyertes!");
                System.out.println("1. Játékos tippje jó?" + nyertes1);
                System.out.println("2. Játékos tippje jó?" + nyertes2);
                System.out.println("3. Játékos tippje jó?" + nyertes3);
                System.out.println("Játék vége");
            }else{
                System.out.println("A játékosok újra próbálkoznak");
            }
           
       }
       
       
}
    
   
}
