/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.areandina.encriptstring.models;

import com.areandina.encriptstring.encript.AsymmetricEncryption;
import java.security.KeyPair;

/**
 *
 * @author mejia
 */
public class EncriptAsymmetric {

    private String text;
    private KeyPair key;

    public EncriptAsymmetric(String text, KeyPair key) {
        this.text = text;
        this.key = key;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTextEncript() throws Exception {
        return AsymmetricEncryption.encrypt(text, key.getPublic());
    }



    public KeyPair getKey() {
        return key;
    }

    public void setKey(KeyPair key) {
        this.key = key;
    }

}
