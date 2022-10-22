package home4.h3;

public class client {
    public static void main(String[] args) {
        numVisitor numvisitor = new numVisitor();
        rowVisitor rowvisitor = new rowVisitor();
        validVisitor validvisitor = new validVisitor();
        atrribute atrribute1 = new atrribute();
        clazz c1 = new clazz();
        method m1 = new method();

        atrribute1.accept(numvisitor);
        atrribute1.accept(rowvisitor);
        atrribute1.accept(validvisitor);

        c1.accept(numvisitor);
        c1.accept(rowvisitor);
        c1.accept(validvisitor);

        m1.accept(numvisitor);
        m1.accept(rowvisitor);
        m1.accept(validvisitor);
    }




}
