package H4;

public class HTTPFactory implements ConnectionFactory{
    @Override
    public Connection createConnection() {
        return new HTTP();
    }
}
