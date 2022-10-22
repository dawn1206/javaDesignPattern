package home5.h3;

import java.util.ArrayList;
import java.util.List;

public class textEdittor {
    private List<Observer> observers = new ArrayList<>();
    public textEdittor() {
        observers.add(new sortWord());
        observers.add(new wordCount());
        observers.add(new wordCount());
    }

    public void notify(String data)
    {
        for(Observer observer:this.observers)
        {
            observer.getNoticed(data);
        }
    }
}
