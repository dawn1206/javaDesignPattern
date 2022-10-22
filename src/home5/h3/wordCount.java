package home5.h3;

public class wordCount implements Observer{
    @Override
    public void getNoticed(String data) {
        System.out.println("word count " +data);
    }
}
