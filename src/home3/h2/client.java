package home3.h2;

public class client {
    public static void main(String[] args) {
        carBuilder carBuilder = new motorCarBuilder();
        carBuilder carBuilder1 = new truckBuilder();

        director director = new director();

        director.ConstructCar(carBuilder);
        director.ConstructCar(carBuilder1);
    }
}
