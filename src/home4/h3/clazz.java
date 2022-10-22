package home4.h3;

public class clazz extends element{
    public clazz() {
        this.num = 101;
        this.row = 1001;
        this.valid = true;
    }
    @Override
    public void accept(visitor v) {
        v.visit(this);
    }
}
