package Decorator.after;

import Decorator.before.Stream;

/**
 * FileStream、NetworkStream、MemoryStream 是主体类
 */
// 主体类
class FileStream extends Stream {
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
 * 定义StreamDecorator 抽象类，继承自 Stream
 * 内部也可以定义 Decorator 通用的抽象方法
 * 成员变量声明为 protected ，只有自己和子类可见
 */
abstract class StreamDecorator extends Stream{
    protected Stream stream;

    protected StreamDecorator(Stream stream) {
        this.stream = stream;
    }
    // 定义其他通用Decorator 方法
//    public abstract void otherMethod();
}

/**
 * 扩展操作：before 中 CryptoFileStream、CryptoNetworkStream、CryptoMemoryStream 三个类合并为CryptoStream
 * 用组合替代继承
 * 包括 CryptoFileStream、BufferedFileStream、CryptoBufferedFileStream
 */

class CryptoStream extends StreamDecorator{
    public CryptoStream(Stream stream) {
        super(stream);
    }

    @Override
    public int read(int number) {
        // 额外的加密操作
        return stream.read(number);
    }

    @Override
    public void seek(int position) {
        //额外的加密操作...
        stream.seek(position);
    }

    @Override
    public void write(char[] data) {
        //额外的加密操作...
        stream.write(data);
    }

}

/**
 * 扩展操作：before 中 BufferedFileStream、BufferedNetworkStream、BufferedMemoryStream 三个类合并为 BufferedStream
 * 用组合替代继承
 */

class BufferedStream extends StreamDecorator{

    public BufferedStream(Stream stream) {
        super(stream);
    }

    @Override
    public int read(int number) {
        // 额外的加密操作
        return stream.read(number);
    }

    @Override
    public void seek(int position) {
        //额外的加密操作...
        stream.seek(position);
    }

    @Override
    public void write(char[] data) {
        //额外的加密操作...
        stream.write(data);
    }
}

/**
 * 扩展操作：before 中 CryptoBufferedFileStream、CryptoBufferedNetworkStream、CryptoBufferedMemoryStream
 * 三个类合并为 CryptoBufferedStream
 * 用组合替代继承
 */

class CryptoBufferedStream extends StreamDecorator{
    public CryptoBufferedStream(Stream stream) {
        super(stream);
    }

    @Override
    public int read(int number) {
        // 额外的加密操作
        return stream.read(number);
    }

    @Override
    public void seek(int position) {
        //额外的加密操作...
        stream.seek(position);
    }

    @Override
    public void write(char[] data) {
        //额外的加密操作...
        stream.write(data);
    }

}