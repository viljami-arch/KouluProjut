package App;
import Data.Viila;
public class App {
    public static void main(String[] args) throws Exception {

        Viila [] taulu=new Viila[3];

        taulu[0]=new Viila();
        taulu[1]=new Viila(101, 800, "Bacho");
        taulu[2]=new Viila(); 
        taulu[2].setid(102);
        taulu[2].setkarkeus(200);
        taulu[2].setvalmistaja("Humbuk");

        TulostaViilat(taulu);
    }
    private static void TulostaViilat (Viila[] taulu) {
        for (int i=0;i<taulu.length;i++){
            System.out.println(taulu[i]);
        }

    }
}