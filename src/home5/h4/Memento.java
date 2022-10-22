package home5.h4;

//备忘录类
public class Memento {
    private String state;

    public Memento(UnRedoOriginator unRedoOriginator) {
        this.state=unRedoOriginator.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

