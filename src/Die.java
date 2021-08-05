import java.util.Random;

/**
 * klasa Die symuluje kostkę
 */


public class Die {
    private int sides; // liczba ścianek
    private int value; // uzyskana wartość

    /**
     * Konstruktor wykonje początkowy rzut kostką
     *
     * @param numSides Liczba ścianek kostki
     */
    public Die(int numSides) {
        sides = numSides;
        roll();
    }

    /**
     * Metoda roll symuluje rzut kostką
     */
    public void roll() {
        //Tworzenie obiektu typu Random
        Random rand = new Random();

        //Pobieranie wartości losowej
        value = rand.nextInt(sides) + 1;
    }

    /**
     * Metoda getSides
     *
     * @return Liczba ścianek danej kostki
     */
    public int getSides() {
        return sides;
    }

    /**
     * Metoda getValue
     *
     * @return Uzyskana wartość
     */
    public int getValue() {
        return value;
    }
}
