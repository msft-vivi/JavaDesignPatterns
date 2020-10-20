package AbstractFactory.after;

import AbstractFactory.after.IDBCommand;
import AbstractFactory.after.IDBConnection;
import AbstractFactory.after.IDataReader;
import AbstractFactory.after.*;
import AbstractFactory.others.EmployeeDO;

import java.util.ArrayList;
import java.util.List;

/**
 * 下面是最终的设计方案，把同类型的数据库处理操作绑定在同一个工厂对象下面
 */
public class EmployeeDAO {
    IDBFactory idbFactory; //具体类型由上层传入

    public EmployeeDAO(IDBFactory idbFactory) {
        this.idbFactory = idbFactory;

    }

    public List<EmployeeDO> getEmployees(){
        List<EmployeeDO> list = new ArrayList<>();

        //数据库连接操作
        IDBConnection connection = idbFactory.createDBConnection();
        IDBCommand command = idbFactory.createDBCommand();
        IDataReader reader = idbFactory.createDBDataReader();

        // 数据操作
        // ...
        return list;
    }
}
