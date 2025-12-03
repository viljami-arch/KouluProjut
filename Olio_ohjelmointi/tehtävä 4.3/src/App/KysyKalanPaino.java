package App;

import java.util.Scanner;

import Data.Kala;

public class KysyKalanPaino {
    private static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Kala k=new Kala();
        double f=0;
        do{
            System.out.println("Kalan paino: ");
            String s=sc.nextLine();
            try {
                f=Float.parseFloat(s);
            }
            catch(NumberFormatException e) {
                continue;
            }
        }
        while(!k.setPaino(f));

        String laji="";

        do{
            System.out.println("Kalan laji: ");
            laji=sc.nextLine();
        }
        while(!k.setLaji(laji));

        System.out.println("Kalan laji: " + k.getLaji() +" Kalan paino: " + k.getPaino());

   }
}
// Tehtävä 2
// Privatessa attribuutti ja metodi ovat yksityisiä. Käyvät vain luokan omille metodeille tai attribuuteille.
//Publicissa puolestaan voidaan käyttää attribuuttia tai metodia suoraan.
