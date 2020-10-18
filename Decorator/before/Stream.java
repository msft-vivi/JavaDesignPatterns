package Decorator.before;


/**
 * 定义抽象基类
 */
public abstract class Stream {
    public abstract int read(int number); // 读一些字节，返回下一byte位置，或者-1（如果文件末尾）
    public abstract void seek(int position); // 设置指针到position
    public abstract void write(char []data);
}

/**
 * FileStream、NetworkStream、MemoryStream 是主体类
 */
// 主体类
class FileStream extends Stream{
    @Override
    public int read(int number) {
        return 0;
    }

    @Override
    public void seek(int position) {

    }

    @Override
    public void write(char[] data) {

    }
}
// 主体类
class NetworkStream extends Stream{
    @Override
    public int read(int number) {
        //读网络流
        return 0;
    }

    @Override
    public void seek(int position) {
        //定位网络流
    }

    @Override
    public void write(char[] data) {
        //写网络流
    }
}
// 主体类
class MemoryStream extends Stream{
    @Override
    public int read(int number) {
        //读内存流
        return 0;
    }

    @Override
    public void seek(int position) {
        //定位内存流
    }

    @Override
    public void write(char[] data) {
        //写内存流
    }
}



/**
 * 扩展操作：对主体类 FileStrem 的扩展操作
 * 包括 CryptoFileStream、BufferedFileStream、CryptoBufferedFileStream
 */
class CryptoFileStream extends FileStream{
    // 重新方法
}
class BufferedFileStream extends FileStream{

}
class CryptoBufferedFileStream extends  FileStream{

}

/**
 * 扩展操作：对主体类 NetworkStream 的扩展操作
 * 包括 CryptoNetworkStream、BufferedNetworkStream、CryptoBufferedNetworkStream
 */
class CryptoNetworkStream extends NetworkStream{
    // 重写方法
}
class BufferedNetworkStream extends NetworkStream{

}
class CryptoBufferedNetworkStream extends NetworkStream{

}

/**
 * 扩展操作：对主体类 MemoryStream 的扩展操作
 * 包括 CryptoMemoryStream、BufferedMemoryStream、CryptoBufferedMemoryStream
 */
class CryptoMemoryStream extends MemoryStream{
    //重写方法
}

class BufferedMemoryStream extends MemoryStream{

}

class CryptoBufferedMemoryStream extends MemoryStream{

}