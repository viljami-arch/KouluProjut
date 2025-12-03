package App;

import Data.Kala;
import java.util.Scanner;

public class KalaTaulu {

    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);

        Kala [] taulu=new Kala[3];

        for (int i=0;i<taulu.length;i++){
        taulu[i]=new Kala();
        lueKalanTiedot(taulu[i], sc, i);
}
        tulostaKalat(taulu);


}
private static void lueKalanTiedot(Kala kala, Scanner in, int id) {
        kala.setId(id);

        System.out.println("Laji: ");
        String laji = in.nextLine();
        kala.setLaji(laji);

        System.out.println("Paino: ");
        String paino = in.nextLine();
        kala.setPaino(paino);
    }

    private static void tulostaKalat(Kala[] taulu) {
        for (int i=0;i<taulu.length;i++){
            System.out.println(taulu[i]);
}
    }
}
