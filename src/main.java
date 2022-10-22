import H3.AbstractTool;
import H3.DTAdapter;
import H3.KNNAdapter;
import H3.NBAdapter;
import iter.book;
import iter.bookShelf;
import iter.iter;

public class main {

    public static void main(String[] args) {
        bookShelf a = new bookShelf();

        a.addBooks(new book("1","1"));
        a.addBooks(new book("2","2"));
        a.addBooks(new book("3","3"));
        iter i = a.getIter();
//        while (i.hasNextPage())
//        {
//            System.out.println(((book) i.getNextPage()).getName());
//        }

        AbstractTool abstractTool1 = new DTAdapter();
        AbstractTool abstractTool2 = new KNNAdapter();
        AbstractTool abstractTool3 = new NBAdapter();
        abstractTool1.doSomething();
        abstractTool2.doSomething();
        abstractTool3.doSomething();
    }
}