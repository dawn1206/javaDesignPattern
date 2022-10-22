package iter;


import java.util.ArrayList;
import java.util.List;

public class bookShelfIter implements iter{
    bookShelf bookShelf = new bookShelf();
    int pos = 0;
    int pageSzie = 1;
    bookShelfIter(bookShelf bookShelf1)
    {
        this.bookShelf = bookShelf1;
    }

    @Override
    public void setPage(int n) {
        this.pageSzie = n;
    }

    @Override
    public boolean hasNextPage() {
        return (pos < this.bookShelf.bookList.size());
    }

    @Override
    public List<Object> getNextPage() {
        List<Object> ret = new ArrayList<>();
        int min = Math.min(pos+this.pageSzie,this.bookShelf.bookList.size());

        for (int i = pos;i < min;i++)
            ret.add(this.bookShelf.bookList.get(i));
        return ret;
    }
}
