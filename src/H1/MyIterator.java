package H1;

import java.util.List;

class MyIterator implements AbstractIterator {
    private Aggregate aggregate;
    private int currentPage;  //当前页号
    private int num;  //每页个数

    private List<String> names;

    public MyIterator(List<String> names) {
        this.names = names;
    }

    //分页输出的方法  a表示每页的数量  ，b表示页号
    @Override
    public void paging(int a, int b) {
        num = a;
        currentPage = b;
        if (names.size() % a == 0 && b >= (names.size() / a + 1)) {
            System.out.println("您查看的页内容为空!");
        } else if (names.size() % a != 0 && b >= (names.size() / a + 2)) {
            System.out.println("您查看的页内容为空!");
        } else {
            try {
                for (int i = ((b - 1) * a); i < (((b - 1) * a) + a); i++) {
                    System.out.println(names.get(i));
                }
            } catch (Exception e) {
                System.out.println("我是有底线的——————————————————————");
            }
        }
    }

    @Override
    public void nextPage() {
        try {
            for (int i = num * currentPage; i < num * currentPage + num; i++) {
                System.out.println(names.get(i));
            }
            currentPage += 1;
        } catch (Exception e) {
            System.out.println("当以已是最后一页！");
        }

    }

    @Override
    public void previousPage() {
        if (currentPage == 1) {
            System.out.println("当前已是第一页！");
        } else {
            for (int i = num * currentPage - (2 * num); i < num * currentPage - num; i++) {
                System.out.println(names.get(i));
            }
            currentPage -= 1;
        }
    }
}