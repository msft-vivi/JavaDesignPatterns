package AbstractFactory.after;

import AbstractFactory.after.Oracle.OracleCommand;
import AbstractFactory.after.Oracle.OracleConnection;
import AbstractFactory.after.Oracle.OracleDataReader;

public class OracleDBFactory extends IDBFactory{
    @Override
    protected IDBConnection createDBConnection() {
        return new OracleConnection();
    }

    @Override
    protected IDBCommand createDBCommand() {
        return new OracleCommand();
    }

    @Override
    protected IDataReader createDBDataReader() {
        return new OracleDataReader();
    }
}
