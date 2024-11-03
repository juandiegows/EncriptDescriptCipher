package com.areandina.encriptstring.method;

public class AtbashCipher {
     public static String encrypt(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                ch = (char) (base + ('Z' - ch));
            }
            result.append(ch);
        }
        return result.toString();
    }

    public static String decrypt(String text) {
        return encrypt(text); // Atbash is symmetric; encryption and decryption are the same
    }
}