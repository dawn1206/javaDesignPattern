package home4.h3;

public abstract class element {

    public int num;
    public boolean valid;
    public int row;

    public abstract void accept(visitor v);
}
