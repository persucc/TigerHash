package com.crazy.MessageSafe;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;

public class Main {
    public static  void main(String args[]) throws UnsupportedEncodingException {
        final String testString1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ=abcdefghijklmnopqrstuvwxyz+0123456789";
        final String testString2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+-";
        final String testString3 = "Tiger - A Fast New Hash Function, by Ross Anderson and Eli Biham";


        TigerHash test1 = new TigerHash(testString1);
        System.out.println("Tiger Hash: " + testString1);
        test1.getFinalMac();

        TigerHash test2 = new TigerHash(testString2);
        System.out.println("Tiger Hash: " + testString2);
        test2.getFinalMac();

        TigerHash test3 = new TigerHash(testString3);
        System.out.println("Tiger Hash: " + testString3);
        test3.getFinalMac();
/*
        TEAJpg test = new TEAJpg("./src/com/crazy/MessageSafe/alice.jpg","./src/com/crazy/MessageSafe/alice2.jpg");
        test.getData();


 */
         /*
         TEA tea = new TEA();

         tea.intialData("./src/com/crazy/MessageSafe/alice.bmp");
         tea.teaEncryption();
         tea.recoverBmp("./src/com/crazy/MessageSafe/alice2.bmp");

          */
    }
}
