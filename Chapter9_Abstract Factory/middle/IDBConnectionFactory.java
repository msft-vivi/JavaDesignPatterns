package AbstractFactory.middle;

import AbstractFactory.middle.Oracle.OracleConnection;
import AbstractFactory.middle.SqlServer.SqlConnection;

public class IDBConnectionFactory {
    public IDBConnection createDBConnection(String type){
        if(type.equals("sql server")){
            return new SqlConnection();
        }
        else if(type.equals("oracle")){
            return new OracleConnection();
        }
        //else ...

        return null; //举例，没有做具体逻辑处理
    }
}
