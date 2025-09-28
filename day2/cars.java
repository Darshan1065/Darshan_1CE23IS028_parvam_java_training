public class cars {
    String manufacturer;
    String model;
    int year;

    public cars(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Manufacturer: " + manufacturer + ", Model: " + model + ", Year: " + year;
    }
}