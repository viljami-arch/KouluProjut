package App;

import Data.Tuomari;

public class Pääohjelma {
    public static void main(String[] args) throws Exception {
        Tuomari t = new Tuomari(5, "Matti Jekkula", "Suomi");

        Tuomari t2 = new Tuomari();
        t2.setid(2);
        t2.setnimi("John Smith");
        t2.setmaa("USA");

        TuomarinTiedot(t);
        TuomarinTiedot(t2);
    }
    private static void TuomarinTiedot(Tuomari t){
        System.out.println(t.getid());
        System.out.println(t.getnimi());
        System.out.println(t.getmaa());

    }
}