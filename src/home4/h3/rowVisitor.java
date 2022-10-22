package home4.h3;

public class rowVisitor implements visitor{
    @Override
    public void visit(clazz c) {
        System.out.println("clazz row: " + String.valueOf(c.row));

    }

    @Override
    public void visit(method m) {
        System.out.println("method row: " + String.valueOf(m.row));

    }

    @Override
    public void visit(atrribute a) {
        System.out.println("atrribute row: " + String.valueOf(a.row));
    }
}
