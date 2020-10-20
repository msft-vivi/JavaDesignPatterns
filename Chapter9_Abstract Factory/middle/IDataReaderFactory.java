package AbstractFactory.middle;

import AbstractFactory.middle.Oracle.OracleDataReader;
import AbstractFactory.middle.SqlServer.SqlDataReader;

public class IDataReaderFactory {
    public IDataReader createDBDataReader(String type){
        if(type.equals("sql server")){
            return new SqlDataReader();
        }
        else if(type.equals("oracle")){
            return new OracleDataReader();
        }
        //else ...

        return null; //举例，没有做具体逻辑处理
    }
}
