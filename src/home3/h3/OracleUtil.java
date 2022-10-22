package home3.h3;

public class OracleUtil implements DBUti{
    @Override
    public IConnection getConnection() {
        return new OracleConnection();
    }

    @Override
    public IStatement useStatement() {
        return new OracleStatement();
    }
}
