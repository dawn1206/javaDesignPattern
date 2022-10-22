package H4;

public class IMAPFactory implements ConnectionFactory{
    @Override
    public Connection createConnection() {
        return new IMAP();
    }
}
