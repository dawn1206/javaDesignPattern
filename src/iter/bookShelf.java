package iter;


import java.util.ArrayList;
import java.util.List;

public class bookShelf implements Aggregate{
    List<book> bookList = new ArrayList<>();
    public bookShelf()
    {}

    @Override
    public iter getIter() {
        return (iter) new bookShelfIter(this);
    }

    public void addBooks(book b1)
    {
        this.bookList.add(b1);
    }
}
