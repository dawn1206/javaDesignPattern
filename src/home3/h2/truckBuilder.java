package home3.h2;

public class truckBuilder implements carBuilder{
    Car car = new Car();
    @Override
    public void build1() {
        this.car.setComponent1("tr 1");
    }

    @Override
    public void build2() {
        this.car.setComponent2("tr 2");
    }

    @Override
    public void build3() {
        this.car.setComponent3("tr 3");
    }

    @Override
    public void build4() {
        this.car.setComponent4("tr 4");
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}
