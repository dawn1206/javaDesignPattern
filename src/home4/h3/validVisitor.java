package home4.h3;

public class validVisitor implements visitor{
    @Override
    public void visit(atrribute a) {
        System.out.println("attr valid:" + String.valueOf(a.valid));
    }

    @Override
    public void visit(clazz c) {
        System.out.println("clazz valid:" + String.valueOf(c.valid));

    }

    @Override
    public void visit(method m) {
        System.out.println("method valid:" + String.valueOf(m.valid));
    }
}
