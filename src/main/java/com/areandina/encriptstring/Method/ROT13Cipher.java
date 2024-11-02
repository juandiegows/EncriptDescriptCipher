/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.areandina.encriptstring.Method;

/**
 *
 * @author mejia
 */

public class ROT13Cipher {
    public static String encrypt(String text) {
        StringBuilder result = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                // Realizar el desplazamiento
                ch = (char) ((ch - base + 13) % 26 + base);
            }
            result.append(ch);
        }

        return result.toString();
    }

    public static String decrypt(String text) {
        // El desencriptado es el mismo que el cifrado en ROT13
        return encrypt(text);
    }
}



