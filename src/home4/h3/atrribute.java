package home4.h3;

public class atrribute extends element{
    public atrribute() {
        this.num = 100;
        this.row = 1000;
        this.valid = true;
    }

    @Override
    public void accept(visitor v) {
        v.visit(this);
    }
}
