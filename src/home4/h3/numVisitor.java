package home4.h3;

import javax.swing.text.TabSet;

public class numVisitor implements visitor {
    @Override
    public void visit(clazz c) {
        System.out.println("clazz num: " + String.valueOf(c.num));

    }

    @Override
    public void visit(method m) {
        System.out.println("method num: " + String.valueOf(m.num));

    }

    @Override
    public void visit(atrribute a) {
        System.out.println("atrribute num: " + String.valueOf(a.num));
    }
}
