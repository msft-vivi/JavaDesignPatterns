package AbstractFactory.after;

public class Main {
    public void run(String type) throws Exception {
        IDBFactory idbFactory;
        if(type.equals("sql server")){
            idbFactory = new SqlDBFactory();
        }
        else if(type.equals("oracle")){
            idbFactory = new OracleDBFactory();
        }
        else {
            throw new Exception("错误！未知的操作系统。");
        }

        EmployeeDAO employeeDAO = new EmployeeDAO(idbFactory);
    }
}
