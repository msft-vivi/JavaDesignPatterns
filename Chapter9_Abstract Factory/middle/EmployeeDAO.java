package AbstractFactory.middle;

import AbstractFactory.middle.SqlServer.SqlConnection;
import AbstractFactory.others.EmployeeDO;

import java.util.ArrayList;
import java.util.List;

/**
 * 以下这种方式是刚学完 Factory Method 很自然想到的方法：
 * 把 Connection、Command、DataReader 分别使用工厂创建
 * 这种方法解决静态绑定的问题，可以方便的把sql server改为Oracle
 * 但是这种方法存在一个很严重的问题：这三个组件需要保持一致性，
 * 即要么都使用Sql server 要么都使用 Oracle，很显然，这种设计不能
 * 爆保证上述一致性。
 */
public class EmployeeDAO {
    private IDBConnectionFactory idbConnectionFactory;
    private IDBCommandFactory idbCommandFactory;
    private IDataReaderFactory iDataReaderFactory;

    public EmployeeDAO(IDBConnectionFactory idbConnectionFactory, IDBCommandFactory idbCommandFactory, IDataReaderFactory iDataReaderFactory) {
        this.idbConnectionFactory = idbConnectionFactory;
        this.idbCommandFactory = idbCommandFactory;
        this.iDataReaderFactory = iDataReaderFactory;
    }

    public List<EmployeeDO> getEmployees(){
        List<EmployeeDO> list = new ArrayList<>();

        //数据库连接操作
        IDBConnection connection = idbConnectionFactory.createDBConnection("sql server");
        IDBCommand command = idbCommandFactory.createDBCommand("sql server");
        IDataReader reader = iDataReaderFactory.createDBDataReader("sql server");

        // 数据操作
        // ...
        return list;
    }
}
