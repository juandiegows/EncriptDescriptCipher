/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.areandina.encriptstring;

import com.areandina.encriptstring.method.AtbashCipher;
import com.areandina.encriptstring.method.CaesarCipher;
import com.areandina.encriptstring.method.MonoalphabeticCipher;
import com.areandina.encriptstring.method.ROT13Cipher;
import com.areandina.encriptstring.method.VigenereCipher;
import javax.swing.JComboBox;

/**
 *
 * @author mejia
 */
public class FormEncript extends javax.swing.JFrame {

    /**
     * Creates new form FormEncript
     */
    public FormEncript() {
        initComponents();
    }
    
    private static final String KEY = "3";
     private static final String KEY_STRING = "KEYWORD";
    public static String decryptBasedOnCombo(String text, JComboBox<String> comboBox) {
        String selectedCipher = (String) comboBox.getSelectedItem();
        
        switch (selectedCipher) {
            case "Cifrado César" -> {
                int shift = Integer.parseInt(KEY); // Usamos la clave constante para el desplazamiento
                return CaesarCipher.decrypt(text, shift);
            }
            
            case "Cifrado Atbash" -> {
                return AtbashCipher.decrypt(text);
            }
            
            case "Cifrado Vigenere" -> {
                return VigenereCipher.decrypt(text, KEY_STRING); // Usamos la clave constante para Vigenere
            }
            case "ROT13" -> {
                return ROT13Cipher.decrypt(text);
            }
            
            case "Cifrado de Sustitución Monoalfabético" -> {
                return MonoalphabeticCipher.decrypt(text);
            }
            
            default ->
                throw new IllegalArgumentException("Método de cifrado no válido");
        }
    }
    
    public static String encryptBasedOnCombo(String text, JComboBox<String> comboBox) {
        String selectedCipher = (String) comboBox.getSelectedItem();
        
        switch (selectedCipher) {
            case "Cifrado César" -> {
                int shift = Integer.parseInt(KEY); // Asume que la clave es un número para el desplazamiento
                return CaesarCipher.encrypt(text, shift);
            }
            
            case "Cifrado Atbash" -> {
                return AtbashCipher.encrypt(text);
            }
            
            case "Cifrado Vigenere" -> {
                return VigenereCipher.encrypt(text, KEY_STRING); // Usa la clave proporcionada para Vigenere
            }
            case "ROT13" -> {
                return ROT13Cipher.encrypt(text);
            }
            
            case "Cifrado de Sustitución Monoalfabético" -> {
                return MonoalphabeticCipher.encrypt(text);
            }
            
            default -> {
                return "Método de cifrado no válido";
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtEncript = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextArea();
        cmbMethod = new javax.swing.JComboBox<>();
        btnDecrypt = new javax.swing.JButton();
        btnEncrypt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Encriptar");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Texto");
        jLabel2.setDoubleBuffered(true);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        txtEncript.setColumns(20);
        txtEncript.setRows(5);
        txtEncript.setMinimumSize(new java.awt.Dimension(13, 10));
        jScrollPane1.setViewportView(txtEncript);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Resultado");
        jLabel3.setDoubleBuffered(true);
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        txtResult.setEditable(false);
        txtResult.setColumns(20);
        txtResult.setRows(5);
        jScrollPane2.setViewportView(txtResult);

        cmbMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cifrado César", "Cifrado Atbash", "Cifrado Vigenere", "ROT13", "Cifrado de Sustitución Monoalfabético" }));
        cmbMethod.setMinimumSize(new java.awt.Dimension(72, 16));
        cmbMethod.setPreferredSize(new java.awt.Dimension(72, 16));

        btnDecrypt.setText("Desencriptar");
        btnDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecryptActionPerformed(evt);
            }
        });

        btnEncrypt.setText("Encriptar");
        btnEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncryptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cmbMethod, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDecrypt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEncrypt)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEncrypt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDecrypt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cmbMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncryptActionPerformed
        txtResult.setText(encryptBasedOnCombo(txtEncript.getText(), cmbMethod));
    }//GEN-LAST:event_btnEncryptActionPerformed

    private void btnDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecryptActionPerformed
        txtResult.setText(decryptBasedOnCombo(txtEncript.getText(), cmbMethod));        // TODO add your handling code here:
    }//GEN-LAST:event_btnDecryptActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormEncript.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEncript.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEncript.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEncript.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEncript().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDecrypt;
    private javax.swing.JButton btnEncrypt;
    private javax.swing.JComboBox<String> cmbMethod;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtEncript;
    private javax.swing.JTextArea txtResult;
    // End of variables declaration//GEN-END:variables
}
