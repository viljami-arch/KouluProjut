
package app;

import Data.Virtapankki;

public class Kauppa {
    public static void main(String[] args) throws Exception {


        Virtapankki k=new Virtapankki();
        Virtapankki k2=new Virtapankki();
        k.setVaraus(10000);
        k.setMerkki("Telofon");
        k.setPaino(250);
        k.setLeveys(70);
        k.setKorkeus(120);
        k.setPaksuus(12);


        k2.setVaraus(30000);
        k2.setMerkki("Fenix");
        k2.setPaino(520);
        k2.setLeveys(80);
        k2.setKorkeus(140);
        k2.setPaksuus(35);

        System.out.println(k.getVaraus());
        System.out.println(k.getMerkki());
        System.out.println(k.getPaino());
        System.out.println(k.getLeveys());
        System.out.println(k.getKorkeus());
        System.out.println(k.getPaksuus());

        System.out.println(k2.getVaraus());
        System.out.println(k2.getMerkki());
        System.out.println(k2.getPaino());
        System.out.println(k2.getLeveys());
        System.out.println(k2.getKorkeus());
        System.out.println(k2.getPaksuus());


    }

}