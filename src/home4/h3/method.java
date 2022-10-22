package home4.h3;

public class method extends element{
    public method() {
        this.num = 102;
        this.row = 1002;
        this.valid = true;
    }
    @Override
    public void accept(visitor v) {
        v.visit(this);
    }
}
