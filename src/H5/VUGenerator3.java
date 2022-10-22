package H5;

public class VUGenerator3 {
    private VUGenerator3() {
    }

    private static class HolderClass{
        private final static VUGenerator3 vuG = new VUGenerator3();
    }
    public static VUGenerator3 getInstance()
    {
        return HolderClass.vuG;
    }
}

