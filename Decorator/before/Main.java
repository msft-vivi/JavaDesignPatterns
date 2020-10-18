package Decorator.before;

public class Main {
    public static void main(String[] args) {
        /**
         * 编译时绑定，不灵活
         */
        CryptoFileStream fs1 = new CryptoFileStream();
        BufferedFileStream fs2 = new BufferedFileStream();
        CryptoBufferedFileStream fs3 = new CryptoBufferedFileStream();
    }
}
