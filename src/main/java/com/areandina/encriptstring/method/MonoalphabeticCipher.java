/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.areandina.encriptstring.method;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mejia
 */
public class MonoalphabeticCipher {
     private static final Map<Character, Character> substitutionMap = new HashMap<>();
    private static final Map<Character, Character> reverseMap = new HashMap<>();

    static {
        String originalAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String substitutedAlphabet = "QWERTYUIOPASDFGHJKLZXCVBNM";

        for (int i = 0; i < originalAlphabet.length(); i++) {
            substitutionMap.put(originalAlphabet.charAt(i), substitutedAlphabet.charAt(i));
            substitutionMap.put(Character.toLowerCase(originalAlphabet.charAt(i)), Character.toLowerCase(substitutedAlphabet.charAt(i)));

            reverseMap.put(substitutedAlphabet.charAt(i), originalAlphabet.charAt(i));
            reverseMap.put(Character.toLowerCase(substitutedAlphabet.charAt(i)), Character.toLowerCase(originalAlphabet.charAt(i)));
        }
    }

    public static String encrypt(String text) {
        StringBuilder result = new StringBuilder();
        for (char ch : text.toCharArray()) {
            result.append(substitutionMap.getOrDefault(ch, ch));
        }
        return result.toString();
    }

    public static String decrypt(String text) {
        StringBuilder result = new StringBuilder();
        for (char ch : text.toCharArray()) {
            result.append(reverseMap.getOrDefault(ch, ch));
        }
        return result.toString();
    }
}
