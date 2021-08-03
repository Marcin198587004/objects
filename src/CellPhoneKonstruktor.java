public class CellPhoneKonstruktor {
    // pola

    private String manufact; //producent
    private String model; // model
    private double retailPrice; //Cena detaliczna

    /**
     * Konstruktor
     *
     * @param man   Producent telefonu
     * @param mod   Numer modelu telefonu
     * @param price Cena detaliczna telefonu
     */
    public CellPhoneKonstruktor(String man, String mod, double price) {
        manufact = man;
        model = mod;
        retailPrice = price;
    }

    /**
     * Metoda setManufact pozwala zmienic nazwe producenta
     *
     * @param man nazwa producenta telefonu
     */
    public void setManufact(String man) {
        manufact = man;
    }

    /**
     * Metoda setModel pozwala zmienić numer telefonu
     *
     * @param mod Numer modelu telefonu
     */
    public void setModel(String mod) {
        model = mod;
    }

    public void setRetailPrice(double price) {
        retailPrice = price;

    }

    /**
     * Metoada getManufact
     *
     * @return Nazwa producenta tekefonu
     */

    public String getManufact() {
        return manufact;
    }

    /**
     * Metoda getModel
     *
     * @return Numer modelu telefonu
     */
    public String getModel() {
        return model;
    }

    /**
     * Metoda getRetailPrice
     *
     * @return Cena detaliczna telefonu
     */
    public double getRetailPrice() {
        return retailPrice;
    }
}

