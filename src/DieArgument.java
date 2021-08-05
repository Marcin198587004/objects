public class DieArgument {
    public static void main(String[] args) {
        final int SIX_SIDES = 6;
        final int TWENTY_SIDES = 20;

        //Tworzenie kostki o sześciu ściankach
        Die sixDie = new Die(SIX_SIDES);

        //Tworzenie kostki o dwudziestu ściankach
        Die twentyDie = new Die(TWENTY_SIDES);

        //Rzut kostką
        rollDie(sixDie);
        rollDie(twentyDie);
    }

    public static void rollDie(Die d) {
        //Wyświetla liczbę ścianek
        System.out.println("Rzut kostką o " + d.getSides() + " ściankach.");

        //Wykonywanie rzutu
        d.roll();
        //Wyświetlanie uzyskanej wartości
        System.out.println("Wyrzucona wartość: " + d.getValue());


    }
}
