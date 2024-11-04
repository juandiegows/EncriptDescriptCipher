/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.areandina.encriptstring.models;

import com.areandina.encriptstring.encript.SymmetricEncryption;
import javax.crypto.SecretKey;

/**
 *
 * @author mejia
 */
public class EncriptSymmetric {

    private String text;
    private SecretKey key;

    public EncriptSymmetric(String text, SecretKey key)  {
        this.text = text;
        this.key = key;
    }

    
    
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public SecretKey getKey() {
        return key;
    }

    public void setKey(SecretKey key) {
        this.key = key;
    }

    public String getTextEncript() throws Exception {
        return  SymmetricEncryption.encrypt(this.text, this.key);
    }
    
}
