package Kino;

import Elokuva.Elokuva;

public class Kino {
    public static void main(String[] args) throws Exception {
        Elokuva e=new Elokuva(); 
        e.setGenre ("Toiminta");
        e.setKesto (120);
        e.setTuottaja ("Cristopher Nolan");



        Elokuva e2=new Elokuva();
        e2.setGenre ("Komedia");
        e2.setKesto (90);
        e2.setTuottaja ("Adam Sandler");

        Elokuva.tulosta(e);
        Elokuva.tulosta(e2);


    }
}
