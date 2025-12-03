package app;

import data.Tiskikone;

public class Pääohjelma {
    public static void main(String[] args) throws Exception {

        Tiskikone p=new Tiskikone();

        p.setId(44);
        p.setMerkki("Electrolux");
        p.setMalli("300");
        p.setPesuohjelma("Pikapesu");

        Tiskikone p2=new Tiskikone();

        p2.setId(52);
        p2.setMerkki("Bosch");
        p2.setMalli("Serie 2");
        p2.setPesuohjelma("normaali");
        tulosta(p);
        tulosta(p2);
    }

        private static void tulosta(Tiskikone p){
            System.out.println(p.getId());
            System.out.println(p.getMerkki());
            System.out.println(p.getMalli());
            System.out.println(p.getPesuohjelma());

        }


    }