package home3.h2;

public class Car {
    public String component1;
    public String component2;
    public String component3;
    public String component4;

    public String getComponent1() {
        return component1;
    }

    public void setComponent1(String component1) {
        this.component1 = component1;
    }

    public String getComponent2() {
        return component2;
    }

    public void setComponent2(String component2) {
        this.component2 = component2;
    }

    public String getComponent3() {
        return component3;
    }

    public void setComponent3(String component3) {
        this.component3 = component3;
    }

    public String getComponent4() {
        return component4;
    }

    public void setComponent4(String component4) {
        this.component4 = component4;
    }

    public void showCar()
    {
        System.out.println(this.component1);
        System.out.println(this.component2);
        System.out.println(this.component3);
        System.out.println(this.component4);
    }
}
