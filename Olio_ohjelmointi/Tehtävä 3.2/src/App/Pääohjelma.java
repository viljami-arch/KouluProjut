
package App;

import java.util.Scanner;

import Data.Tiskikone;

public class Pääohjelma {
    private static Scanner sc=new Scanner (System.in);
    public static void main(String[] args) {

        Tiskikone t=new Tiskikone();
        Tiskikone t2=new Tiskikone();


        System.out.println("Ensimmäinen pesukone");
        System.out.print("Anna Id: ");
        t.setId(Integer.parseInt(sc.nextLine()));

        System.out.print("Anna Merkki: ");
        t.setMerkki((sc.nextLine()));

        System.out.print("Anna Malli: ");
        t.setMalli((sc.nextLine()));

        System.out.print("Anna Pesuohjelma: ");
        t.setMalli((sc.nextLine()));



        System.out.println("Toinen pesukone");
        System.out.print("Anna Id: ");
        t2.setId(Integer.parseInt(sc.nextLine()));

        System.out.print("Anna Merkki: ");
        t2.setMerkki(sc.nextLine());

        System.out.print("Anna Malli: ");
        t2.setMalli(sc.nextLine());

        System.out.print("Anna Pesuohjelma: ");
        t2.setMalli(sc.nextLine());

        tulosta(t);
        tulosta(t2);



    }
    private static void tulosta(Tiskikone t) {
         System.out.println(t.getId());
        System.out.println(t.getMerkki());
        System.out.println(t.getMalli());
        System.out.println(t.getPesuohjelma());
    }
}