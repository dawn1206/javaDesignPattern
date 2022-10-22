package home3.h3;

public class OracleConnection implements IConnection{
    @Override
    public String connectionName() {
        return "connection to oracle";
    }
}
