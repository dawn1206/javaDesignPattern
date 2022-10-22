package home3.h2;

public class director {

    public void ConstructCar(carBuilder carbuilder)
    {
        carbuilder.build1();
        carbuilder.build2();
        carbuilder.build3();
        carbuilder.build4();
        carbuilder.getCar().showCar();
    }
}
