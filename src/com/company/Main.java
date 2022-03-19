package com.company;

public class Main {

    public static void main(String[] args) {
        int a=5;
        int b=3;

        String msg = "AN TOAN";

        // Calling encryption function
        String cipherText = ApphinCipher.encryptMessage(msg.toCharArray(),a,b);
        System.out.println("Encrypted Message is : " + cipherText);

        // Calling Decryption function
        System.out.println("Decrypted Message is: " + ApphinCipher.decryptCipher(cipherText,a,b));

    }
}
