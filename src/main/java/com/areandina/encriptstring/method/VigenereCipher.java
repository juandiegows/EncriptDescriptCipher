/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.areandina.encriptstring.method;

/**
 *
 * @author mejia
 */
public class VigenereCipher {
    public static String encrypt(String text, String key) {
        StringBuilder result = new StringBuilder();
        key = key.toLowerCase();
        for (int i = 0, j = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                ch = (char) ((ch - base + (key.charAt(j % key.length()) - 'a')) % 26 + base);
                j++;
            }
            result.append(ch);
        }
        return result.toString();
    }

    public static String decrypt(String text, String key) {
        StringBuilder result = new StringBuilder();
        key = key.toLowerCase();
        for (int i = 0, j = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                // Ajustamos el índice de la clave utilizando módulo
                ch = (char) ((ch - base - (key.charAt(j % key.length()) - 'a') + 26) % 26 + base);
                j++;
            }
            result.append(ch);
        }
        return result.toString();
    }
}

