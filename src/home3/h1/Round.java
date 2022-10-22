package home3.h1;

public class Round extends Shape {
    @Override public void draw() {
        System.out.println("绘制圆形");
    }
    @Override public void erase() {
        System.out.println("擦除圆形");
    }
}