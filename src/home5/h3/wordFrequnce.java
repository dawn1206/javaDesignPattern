package home5.h3;

public class wordFrequnce implements Observer{
    @Override
    public void getNoticed(String data) {
        System.out.println("word frequnce "+ data);
    }
}
