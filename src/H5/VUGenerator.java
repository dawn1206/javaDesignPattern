package H5;

public class VUGenerator {
    private static final VUGenerator vug = new VUGenerator();
    private VUGenerator(){}
    public static VUGenerator getInstance()
    {
        return vug;
    }
}
