public class Rectangle {

    private double lenght;
    private double width;

    /**
     * Metoda setLenght zapisuje wartosc w polu lenght
     *
     * @param len Wartość zapisywana w polu lenght
     */
    public void setLenght(double len) {
        lenght = len;
    }

    /**
     * Metoda setWidth zapisuje wartość w polu width
     *
     * @param w Wartość zapisywana w polu width
     */

    public void setWidth(double w) {
        width = w;
    }

    /**
     * Metoda getLenght zwraca długość obiektu typu Rectangle
     *
     * @return Wartosc z pola Lenght
     */

    public double getLenght() {
        return lenght;
    }

    /**
     * Metoda getWidth zwraca szerokość obiektu typu Rectangle
     *
     * @return Wartość z pola Width
     */
    public double getWidth() {
        return width;
    }

    public double getArea() {
        return lenght * width;
    }
}



