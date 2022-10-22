package home3.h3;

public class client {
    public static void main(String[] args) {
        DBUti dbUti = new MysqlUtil();
        IConnection iConnection = dbUti.getConnection();
        IStatement iStatement = dbUti.useStatement();
        System.out.println(iConnection.connectionName());
        System.out.println(iStatement.statementName());

        DBUti dbUti1 = new OracleUtil();
        IConnection iConnection1 = dbUti1.getConnection();
        IStatement iStatement1 = dbUti1.useStatement();
        System.out.println(iConnection1.connectionName());
        System.out.println(iStatement1.statementName());


    }
}
