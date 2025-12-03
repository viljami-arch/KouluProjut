package app;

import Data.*;

public class sarmiotesti {
    public static void main(String[] args) throws Exception {
       sarmio sarmio = new sarmio();
       sarmio.setKorkeus(3);
       sarmio.setLeveys(4);
       sarmio.setSyvyys(5);
       System.out.println(sarmio.getTilavuus()); 

    sarmio s=new sarmio();
    s.getPintaAla();
    // Toimii, koska Sarmio perii suorakaide luokan metodin "s.getPintaAla()", jota ei ole varsinaisesti Sarmio luokassa.
    // Eli aliluokka (Sarmio), saa yliluokan (Suorakaide), metodit käyttöön.

    suorakaide sk=new sarmio();
    sk.setLeveys(5);
    sk.setKorkeus(6);
    int pa=sk.getPintaAla();
    // Sarmio luokka voidaan käsitellä Suorakaide luokan tyyppisenä, jolloin käytettävissä ovat Suorakaide luokan metodit.
    // Myös aliluokan (Sarmio) voi sijoittaa yläluokkaan (Suorakaide) eli se voi periä tämän ominaisuudet.


    sarmio s=new suorakaide();
    s.setSyvyys(5);
    // Ei toimi, koska yliluokka (Suorakaide) ei voi käsitellä aliluokan (Sarmio) metodeja tai ominaisuuksia.
    // Eikä sitä voi sijoittaa aliluokkaan.

    }
}