package com.jeandev.qrcode.generator.Ports;

public interface StoragePort {
    String uploadFile(byte[] fileData,String fileName, String contentType);

}
