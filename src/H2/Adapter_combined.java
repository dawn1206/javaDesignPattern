package H2;

public class Adapter_combined implements Encoder{
    private Adaptee adaptee;

    public Adapter_combined(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String encodePwd(String password) {
        return adaptee.encodeAPI(password);
    }

}
