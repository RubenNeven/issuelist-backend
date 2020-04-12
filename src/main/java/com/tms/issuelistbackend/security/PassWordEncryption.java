package com.tms.issuelistbackend.security;


import org.jasypt.exceptions.EncryptionOperationNotPossibleException;
import org.jasypt.util.password.StrongPasswordEncryptor;

public class PassWordEncryption {

    private PassWordEncryption(){
        throw new IllegalStateException("Utility class");
    }

    public static String encryptPassword(String password) {
        StrongPasswordEncryptor passwordEncryptor = new StrongPasswordEncryptor();
        return passwordEncryptor.encryptPassword(password);
    }

    public static boolean checkEncryptedPassword(String inputPassWord, String encryptedPassWord) {
        StrongPasswordEncryptor passwordEncryptor = new StrongPasswordEncryptor();
        boolean correctPassWord = false;
        try {
            correctPassWord = passwordEncryptor.checkPassword(inputPassWord, encryptedPassWord);
        } catch (EncryptionOperationNotPossibleException e){
            e.printStackTrace();
        }
        return correctPassWord;
    }
}
