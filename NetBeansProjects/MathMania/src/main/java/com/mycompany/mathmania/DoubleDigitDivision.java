/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mathmania;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.text.*;
import java.awt.event.ActionEvent;
import java.lang.Math;
import org.apache.commons.collections.map.MultiValueMap;

import java.util.LinkedHashMap;

/**
 *
 * @author nicholassazy
 */
public class DoubleDigitDivision extends javax.swing.JFrame {
         String userAnswer = "";
         int userInput = 0;
         String userString = "";
         int corrAnswer = 0;
         int divResult = 0;
         int index = 0;
         int corrRemainder = 0;
         int remainder = 0;
         final int PROBLEMS = 10;
         String divStringOne = "";
         String divStringTwo = "";
         String divQues = "";
         String convCorrAnswerToString = "";
         String divAns = "";
       
         
          //ArrayList<Integer> values = new ArrayList<Integer>();
         LinkedHashMap<String, String> div = new LinkedHashMap<String, String>();
    /**
     * Creates new form DoubleDigitDivision
     */
    public DoubleDigitDivision() {
        initComponents();
        quiz();
    }
    
    private void quiz(){
       Random rand  = new Random();
        
        int sdsa = rand.nextInt(10,100);
        int sdsb = rand.nextInt(10, 100);
        
        if (sdsa > sdsb){
            jLabel1.setText(Integer.toString(sdsa));
            jLabel2.setText(Integer.toString(sdsb));
            if (sdsb == 0){
                divQues = Integer.toString(sdsa) + "/" + Integer.toString(sdsb);
                if (div.containsKey(divQues)){
                  
                  jTextField1.setText("");
                  jTextField1.requestFocus();
                 
                }
                corrAnswer = 0;
                divAns = Integer.toString(corrAnswer);
                JOptionPane.showMessageDialog(null, divAns);
            }
            else{
                corrAnswer = sdsa / sdsb;
                remainder = sdsa % sdsb;
                if (remainder == 0){
                    divQues = Integer.toString(sdsa) + "/" + Integer.toString(sdsb);
                    if (div.containsKey(divQues)){
                        jTextField1.setText("");
                        jTextField1.requestFocus();
                     }
                    divAns = Integer.toString(corrAnswer);
                     JOptionPane.showMessageDialog(null, divAns);
                }
                else{
                    divQues = Integer.toString(sdsa) + "/" + Integer.toString(sdsb);
                    if (div.containsKey(divQues)){
                         jTextField1.setText("");
                         jTextField1.requestFocus();
                    }
                    divAns = Integer.toString(corrAnswer) + "R" + Integer.toString(remainder);
                     JOptionPane.showMessageDialog(null, divAns);
                   
                    //System.out.println("Answer is " + divAns);
                }
            }
            
        }else{
            jLabel1.setText(Integer.toString(sdsb));
            jLabel2.setText(Integer.toString(sdsa));
            if (sdsa == 0){
                divQues = Integer.toString(sdsb) + "/" + Integer.toString(sdsa);
                if (div.containsKey(divQues)){
                  jTextField1.setText("");
                  jTextField1.requestFocus();
                }
                corrAnswer = 0;
                divAns = Integer.toString(corrAnswer);
                 JOptionPane.showMessageDialog(null, divAns);
            }
            else{
                corrAnswer = sdsb / sdsa;
                remainder = sdsb % sdsa;
               
                if (remainder == 0){
                    divQues = Integer.toString(sdsb) + "/" + Integer.toString(sdsa);
                    if (div.containsKey(divQues)){
                     jTextField1.setText("");
                     jTextField1.requestFocus();
                    }
                    divAns = Integer.toString(corrAnswer);
                     JOptionPane.showMessageDialog(null, divAns);
                }
                else{
                    divQues = Integer.toString(sdsb) + "/" + Integer.toString(sdsa);
                    if (div.containsKey(divQues)){
                        jTextField1.setText("");
                        jTextField1.requestFocus();
                    }
                    divAns = Integer.toString(corrAnswer) + "R" + Integer.toString(remainder);
                     JOptionPane.showMessageDialog(null, divAns);
                   
                    
                }
            }
        }
        jTextField1.setText("");
        jTextField1.requestFocus();
        index++;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Double Digit Division");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setText("/");

        jTextField1.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jTextField1.setText("jTextField1");

        jButton1.setText("Check Answer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(223, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         userAnswer = jTextField1.getText().trim();
       if (userAnswer.contains("r")){
           userAnswer = userAnswer.toUpperCase();
       }
       
        String ans = "N";
        //userInput = Integer.toString(answer);
        if (!div.containsKey(divQues)){
            if (!userAnswer.isEmpty() && (userAnswer.matches("([0]|[1-9]|[1-9][0-9])([R])([1-9]|[1-9][0-9])") || userAnswer.matches("([0]|[1-9]|[1-9][0-9])"))){//^[0]|[0-9]|[0-9][Rr][0-9]$
                if (divAns.equals(userAnswer)){
                    div.put(divQues, divAns);
                    JOptionPane.showMessageDialog(null, ("You are right!"));
                    

                }else{
                    String wrongAnsFlag =  userAnswer + ans;
                    div.put(divQues, wrongAnsFlag);
                }
                if (div.size() == 10){
                    for (var entry : div.entrySet()){
                        System.out.println(entry.getKey() + " : " + entry.getValue());
                    }
                PercentageCorrect.percentageCorrect(div);
                System.exit(0);
                }
                quiz();
            }
            else
            {
            JOptionPane.showMessageDialog(null, "Please enter a valid number.");
            jTextField1.setText("");
            jTextField1.requestFocus();
            }
        }
        else{
            quiz();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DoubleDigitDivision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoubleDigitDivision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoubleDigitDivision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoubleDigitDivision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoubleDigitDivision().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
