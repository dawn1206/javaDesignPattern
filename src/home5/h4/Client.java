package home5.h4;

//测试类
public class Client {
    public static void main(String[] args) {
        UnRedoOriginator originator=new UnRedoOriginator();
        System.out.println("执行的操作顺序:add sub mul div");
        originator.setAndStoreState("add");
        originator.setAndStoreState("sub");
        originator.setAndStoreState("mul");
        originator.setAndStoreState("div");

        System.out.println("第一次undo操作：");
        originator.undo();
        System.out.println("第二次undo操作：");
        originator.undo();
        System.out.println("第一次redo操作：");
        originator.redo();
        System.out.println("第三次undo操作：");
        originator.undo();
        System.out.println("第四次undo操作：");
        originator.undo();
        System.out.println("第二次redo操作：");
        originator.redo();
    }
}
