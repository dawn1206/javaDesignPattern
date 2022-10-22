package H5;

public class VUGenerator2 {
    private volatile static VUGenerator2 vuGenerator2 = null;
    private VUGenerator2(){}

    public static VUGenerator2 getInstance() {
        if(vuGenerator2 == null)
        {
            synchronized (VUGenerator2.class){
                if(vuGenerator2 == null)
                    vuGenerator2 = new VUGenerator2();
            }
        }
        return vuGenerator2;
    }
}
