package Facade.after;

public class CodecFactory {
    public static Codec getCodec(String type){
        if(type == "mp4"){
            return new MPEG4CompressionCodec();
        }
        else{
            return new OggCompressionCodec();
        }
//        else {
//            // ...
//        }
    }
}
