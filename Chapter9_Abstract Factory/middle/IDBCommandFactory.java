package AbstractFactory.middle;

import AbstractFactory.middle.Oracle.OracleCommand;
import AbstractFactory.middle.Oracle.OracleDataReader;
import AbstractFactory.middle.SqlServer.SqlCommand;

public class IDBCommandFactory {
    public IDBCommand createDBCommand(String type){
        if(type.equals("sql server")){
            return new SqlCommand();
        }
        else if(type.equals("oracle")){
            return new OracleCommand();
        }
        //else ...

        return null; //举例，没有做具体逻辑处理
    }
}
