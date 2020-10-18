package Decorator.middle;

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
 * 扩展操作：before 中 CryptoFileStream、CryptoNetworkStream、CryptoMemoryStream 三个类合并为CryptoStream
 * 用组合替代继承
 * 包括 CryptoFileStream、BufferedFileStream、CryptoBufferedFileStream
 */

class CryptoStream extends Stream{
    Stream stream;
    public CryptoStream(Stream stream){
        this.stream = stream;
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

class BufferedStream extends Stream{
    Stream stream;

    public BufferedStream(Stream stream) {
        this.stream = stream;
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

class CryptoBufferedStream extends Stream{
    Stream stream;

    public CryptoBufferedStream(Stream stream) {
        this.stream = stream;
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