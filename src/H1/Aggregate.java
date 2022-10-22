package H1;

import java.util.ArrayList;

public class Aggregate implements AbstractAggregate{
    private ArrayList<String> names;

    public Aggregate() {
        names = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            names.add(i, "用户" + (i + 1));
        }
    }

    @Override
    public AbstractIterator createIterator() {
        return new MyIterator(names);
    }

}
