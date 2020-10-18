package Decorator.after;

public class Main {
    public static void main(String[] args) {
        /**
         * 运行时绑定，灵活
         */
        FileStream fs1 = new FileStream();
        CryptoStream fs2 = new CryptoStream(fs1);
        BufferedStream fs3 = new BufferedStream(fs2);
        CryptoBufferedStream fs4 = new CryptoBufferedStream(fs3);
    }
}
