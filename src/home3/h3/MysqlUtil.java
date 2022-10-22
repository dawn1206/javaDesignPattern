package home3.h3;

public class MysqlUtil implements DBUti{
    @Override
    public IConnection getConnection() {
        return new MysqlConnection();
    }

    @Override
    public IStatement useStatement() {
        return new MysqlStatement();
    }
}
