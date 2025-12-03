package App;
 import Data.*;
import java.util.ArrayList;

public class kalukaappi {
    public static void main(String[] args) throws Exception {
        
        ruuvari r1 = new ruuvari();
        r1.sethinta(12);
        r1.setmateriaali("teräs");
        r1.settyyppi("ristipää");

        ruuvari r2 = new ruuvari(); 
        r2.sethinta(8);
        r2.setmateriaali("teräs");
        r2.settyyppi("taltta");

        lasta p1 = new lasta();
        p1.sethinta(5);
        p1.setmateriaali("muovi");  
        p1.setleveys(20);

        lasta p2 = new lasta();
        p2.sethinta(7);
        p2.setmateriaali("puu");
        p2.setleveys(25);

       ArrayList<tyokalu> lista=new ArrayList<>();
        lista.add(r1);
        lista.add(r2);
        lista.add(p1);
        lista.add(p2);
// Tämä toimii koska ruuvari ja lasta ovat aliluokkia työkalu luokasta.
// koska ruuvari ja lasta perii työkalu luokan, ne voidaan lisätä työkalu listaan.
//sen takia voidaan laittaa työkalu arraylistiin
        for (tyokalu t : lista) {
            System.out.println(t);
        }
    }
   
}
