import java.sql.SQLOutput;
import java.util.Scanner; //na potrzeby klas Scanner
import java.util.Random;    // na potrzeby klas Random
import java.io.*;   // na potrzeby klas z plikowymi operacjami wejscia wyjscia


/**
 * Ten program zapisuje liczby losowe z pliku
 */
public class ObjectDemo {
    public static void main (String[]args) throws IOException
    {
        int maxNumbers; // Maksymalna liczba wartosci losowych
        int number; // przechowywanie liczby losowej

        // Tworzenie obiektu typu Scanner do pobierania danych z klawiatury
        Scanner keyboard = new Scanner(System.in);

        // Tworzenie obiektu typu Random do generowania liczb losowych
        Random rand = new Random();
        //Tworzenie obiektu typu PrintWriter sluzącego do otwierania pliku
        PrintWriter outputFile = new PrintWriter("numbers.txt");

        //Pobieranie liczby zapisywanych liczb losowych
        System.out.println("Ile  liczb losowych program ma zapisać? ");
        maxNumbers = keyboard.nextInt();
        // Zapisywanie liczb losowych w pliku
        for (int count = 0; count < maxNumbers; count++) {
            //Generowanie losowej liczby całkowitej
            number = rand.nextInt();
            //zapisywanie losowej liczby całkowitej w pliku
            outputFile.println(number);
        }
        //Zapisywanie pliku
        outputFile.close();
        System.out.println("GOTOWE.");

        }



    }


