public class LenghtDemo {
    public static void main(String[] args) {
        //tworzenie obiektu klasy Rectanglr i przypisywanie jego adresu do zmiennej box.

        Rectangle box = new Rectangle();


        //informowanie o tym co sie dzieje
        System.out.println("Przekazywanie wartosci 10.0 do metody setLenght");

        //Wywoływanie metody setLenght obiektu box.
        box.setLenght(10.0);
        System.out.println("Przekazywanie wartosci 20.0 do metody setWidth");

        //Wywolywanie metody setWidth obiektu i przekazywanie 20.0 jako argumentu
        box.setWidth(20.0);

        //Wyświetlanie długosci i szerokosci obiektu
        System.out.println("Długosc prostokąta wynosi " + box.getLenght() + ".");
        System.out.println("Szerokość prostokąta wynosi " + box.getWidth() + ".");

        // Wyświetanie powierzchni
        System.out.println("Powierzchnia prostokąta wynosi " + box.getArea() + ".");


        //informowanie o zakońsczeniu pracy
        System.out.println("Gotowe");


    }
}
