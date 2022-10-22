package home5.h3;

public class sortWord implements Observer{
    @Override
    public void getNoticed(String data) {
        System.out.println("sort word "+data);
    }
}
