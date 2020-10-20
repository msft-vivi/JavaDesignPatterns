package AbstractFactory.before;

import AbstractFactory.others.EmployeeDO;
import AbstractFactory.others.SqlCommand;
import AbstractFactory.others.SqlConnection;
import AbstractFactory.others.SqlDataReader;

import java.util.ArrayList;
import java.util.List;

/**
 * 以下定义有个问题：
 * 目前连接的是 Sql Server 数据库，如果希望更换数据库，如Oracle,需要修改下面的很多代码
 * 包括 Connection、Command、DataReader等部分
 *
 */

public class EmployeeDAO {
    public List<EmployeeDO> getEmployees(){
        List<EmployeeDO> list = new ArrayList<>();

        //数据库连接操作
        SqlConnection connection = new SqlConnection();
        SqlCommand command = new SqlCommand();
        SqlDataReader reader = new SqlDataReader();

        // 数据操作
        // ...
        return list;
    }
}
