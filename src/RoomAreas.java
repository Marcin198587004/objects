import javax.swing.*;

//Ten program tworzy trzy instancje klasy Rectanle
public class RoomAreas {
    public static void main(String[] args) {
        double number; //przechowywanie liczby
        double totalArea; //Powierzchnia całkowita
        String input; //Przechowywanie danych wejściowych od użytkownika
        Rectangle kitchen = new Rectangle();
        Rectangle bedroom = new Rectangle();
        Rectangle den = new Rectangle();

        // pobieranie i zapisywanie wymiarów kuchni

        input = JOptionPane.showInputDialog("Podaj długość kuchni: ");
        number = Double.parseDouble(input);
        kitchen.setLenght(number);

        input = JOptionPane.showInputDialog("Podaj szerokość kuchni: ");
        number = Double.parseDouble(input);
        kitchen.setWidth(number);

        //Pobieranie i zapisywanie wymiarów sypialni

        input = JOptionPane.showInputDialog("Podaj długosc sypialni:");
        number = Double.parseDouble(input);
        bedroom.setLenght(number);

        input = JOptionPane.showInputDialog("Podaj szerokość sypialni: ");
        number = Double.parseDouble(input);
        bedroom.setWidth(number);

        //Pobieranie i zapisywanie wymiarów salonu

        input = JOptionPane.showInputDialog("Podaj długość salonu: ");
        number = Double.parseDouble(input);
        den.setLenght(number);

        input = JOptionPane.showInputDialog("Podaj szeerokość salonu: ");
        number = Double.parseDouble(input);
        den.setWidth(number);

        //Obliczanie łącznej powierzchni pomieszczeń
        totalArea = kitchen.getArea() + bedroom.getArea() + den.getArea();

        //Wyświetlanie łacznej powierzchni pomieszczeń
        JOptionPane.showMessageDialog(null, "Łączna powierzchnia " +
                "pomieszczeń wynosi:" + totalArea + ".");

        System.exit(0);


    }

}
