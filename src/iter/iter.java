package iter;

import java.util.List;

public interface iter {
    void setPage(int n);
    boolean hasNextPage();
    List<Object> getNextPage();
}
