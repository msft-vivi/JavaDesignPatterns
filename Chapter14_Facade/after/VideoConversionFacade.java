package Facade.after;

import java.io.File;


/**
 * Facade 内部实现被隐藏,对客户端提供 统一的 convertVideo 接口
 * 如果需要修改功能，只需修改convertVideo 内部实现，而对客户端来说，并没有任何影响
 */
public class VideoConversionFacade {

    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        // 获取sourceCodec
        Codec sourceCodec = CodecFactory.getCodec(file.getCodecType());
        // target Codec
        Codec destinationCodec = CodecFactory.getCodec(format);

        VideoFile buffer = BitrateReader.read(file, sourceCodec);

        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);

        File result = (new AudioMixer()).fix(intermediateResult);

        System.out.println("VideoConversionFacade: conversion completed.");

        return result;
    }
}
