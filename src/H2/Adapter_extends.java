package H2;

public class Adapter_extends extends Adaptee implements Encoder{
    @Override
    public String encodePwd(String password) {
        return this.encodePwd(password);
    }
}
