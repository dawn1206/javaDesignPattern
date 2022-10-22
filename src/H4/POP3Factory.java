package H4;

public class POP3Factory implements ConnectionFactory{
    @Override
    public Connection createConnection() {
        return new POP3();
    }
}
