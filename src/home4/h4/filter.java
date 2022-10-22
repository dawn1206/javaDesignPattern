package home4.h4;

public abstract class filter {

    protected filter next;

    String filerType;

    public filter getNext() {
        return next;
    }

    public void setNext(filter next) {
        this.next = next;
    }

    public abstract void process(Data data);
}
