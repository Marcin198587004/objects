import java.util.Scanner;

public class CellPhone {


    public static void main(String[] args) {

        String testMan; //przechowywanie nazwy producenta
        String testMod; //Przechowywanie numeru modelu
        double testPrice; //Przechowywanie ceny

        //Tworzenie obiektu Scannet do pobierania danych z klawiatury

        Scanner keyboard = new Scanner(System.in);

        //Pobieranie nazwy producenta
        System.out.println("Podaj nazwe producenta: ");
        testMan = keyboard.nextLine();

        //Pobieranie numeru modelu
        System.out.println("Podaj numer modelu: ");
        testMod = keyboard.nextLine();
        //Pobieranie ceny detalicznej

        System.out.println("Podaj cenę detaliczną: ");
        testPrice = keyboard.nextDouble();

        //Tworzenie instancji klasy CellPhone z użyciem danych przekazanych
        //jako argumenty do konstruktora
        CellPhoneKonstruktor phone = new CellPhoneKonstruktor(testMan, testMod, testPrice);
        //Pobieranie danych o telefonie i ich wyswietlanie

        System.out.println();
        System.out.println("Oto wprowadzone dane: ");
        System.out.println("Producent:" + phone.getManufact());
        System.out.println("Numer modelu: " + phone.getModel());
        System.out.println("Cena detaliczna:" + phone.getRetailPrice());
    }

}
