package home3.h1;

public class Square extends Shape {
    @Override public void draw() {
        System.out.println("绘制方形");
    }
    @Override public void erase() {
        System.out.println("擦除方形");
    }
}
