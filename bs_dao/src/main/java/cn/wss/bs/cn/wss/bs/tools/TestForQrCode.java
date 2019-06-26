package cn.wss.bs.cn.wss.bs.tools;

import com.google.zxing.WriterException;

import java.io.IOException;

public class TestForQrCode {
    public static void main(String[] args){
        try {
            if(QrCode.createQrCode("E:\\study\\our\\qrcode.jpg", "wssisbeauty",900,"JPEG")){
                System.out.println("succeed");
            }else{
                System.out.println("failed");
            }
        } catch (WriterException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
