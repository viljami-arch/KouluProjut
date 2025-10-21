import java.util.Random;
import java.util.Scanner;

public class Peli      {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Tervetuloa noppapeliin!");
        int saldo = 5;

        while (saldo > 0) {
            System.out.println("\nPelaajan saldo on " + saldo + "€");
            System.out.println("Yksi peli maksaa 1€.");
            System.out.print("Paina ENTER pelataksesi...");
            in.nextLine(); 

            saldo -= 1; // Vähennetään pelin hinta

            int randomNumber = r.nextInt(10) + 1; // Arpoo luvun 1–10
            System.out.println("Arvottu numero: " + randomNumber);

            if (randomNumber == 7) {
                System.out.println("Voitit 3€! Onneksi olkoon!");
                saldo += 3;
            } else {
                System.out.println("Hävisit pelin.");
            }
        }

        System.out.println("\nRahat loppuivat. Peli päättyy.");
        in.close();
    }
}