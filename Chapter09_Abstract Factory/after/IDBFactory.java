package AbstractFactory.after;


abstract class IDBFactory {
    protected abstract IDBConnection createDBConnection();
    protected abstract IDBCommand createDBCommand();
    protected abstract IDataReader createDBDataReader();
}
