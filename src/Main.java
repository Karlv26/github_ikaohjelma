
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Mikä sinun nimesi on? ");
        String nimi = lukija.nextLine();

        System.out.print("Kuinka vanha olet? ");
        int ika = lukija.nextInt();

        System.out.println("Hei " + nimi + "!");
        System.out.println("Olet " + ika + " vuotta vanha.");

        if (ika >= 18) {
            System.out.println("Olet täysi-ikäinen.");
        } else {
            System.out.println("Olet alaikäinen.");
        }

        lukija.close();
    }
}
