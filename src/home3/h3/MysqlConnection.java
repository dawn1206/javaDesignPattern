package home3.h3;

public class MysqlConnection implements IConnection{
    @Override
    public String connectionName() {
        return "connection to mysql";
    }
}
