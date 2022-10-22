package home3.h5;

public class clietn {
    public static void main(String[] args) {
        movingStrategy movingStrategy = new crrtmotion();
        movingStrategy movingStrategy1 = new postcopy();
        movingStrategy movingStrategy2 = new preCopy();

        System.out.println(movingStrategy.getName());
        System.out.println(movingStrategy1.getName());
        System.out.println(movingStrategy2.getName());
    }
}
