package AbstractFactory.after;

import AbstractFactory.after.SqlServer.SqlConnection;
import AbstractFactory.after.Oracle.OracleConnection;
import AbstractFactory.after.Oracle.OracleCommand;
import AbstractFactory.after.SqlServer.SqlCommand;
import AbstractFactory.after.Oracle.OracleDataReader;
import AbstractFactory.after.SqlServer.SqlDataReader;

public class SqlDBFactory extends IDBFactory {

    @Override
    protected IDBConnection createDBConnection() {
        return new SqlConnection();
    }

    @Override
    protected IDBCommand createDBCommand() {
        return new SqlCommand();
    }

    @Override
    protected IDataReader createDBDataReader() {
        return new SqlDataReader();
    }
}
