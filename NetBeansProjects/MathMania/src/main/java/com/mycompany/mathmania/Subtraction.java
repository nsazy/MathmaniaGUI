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
/**
 *
 * @author nicholassazy
 */
public class Subtraction extends javax.swing.JFrame {
         String userAnswer = "";
         String userInput = "";
         String corrAnswer = "";
         int index = 0;
         //final int PROBLEMS = 5;
         String divQues = "";
         ArrayList<Integer> values = new ArrayList<Integer>();
         //JTextField userAnswer = new JTextField();
         LinkedHashMap<String, String> div = new LinkedHashMap<String, String>();


    /**
     * Creates new form Subtraction
     */
    public Subtraction() {
        initComponents();
        quiz();
    }

    private void quiz(){
         
        
       Random rand  = new Random();
        
        int sdsa = rand.nextInt(0,10);
        int sdsb = rand.nextInt(0, 10);
        
        if (sdsa > sdsb){
            corrAnswer = Integer.toString(sdsa - sdsb);
            //JOptionPane.showMessageDialog(null, corrAnswer);
            jLabel2.setText(Integer.toString(sdsa));
            jLabel3.setText(Integer.toString(sdsb));
            divQues = Integer.toString(sdsa) + "-" + Integer.toString(sdsb);
            if(div.containsKey(divQues)){
                jTextField1.setText("");
                jTextField1.requestFocus();
            }
            
        }else{
            corrAnswer = Integer.toString(sdsb - sdsa);
            //JOptionPane.showMessageDialog(null, corrAnswer);
            jLabel2.setText(Integer.toString(sdsb));
            jLabel3.setText(Integer.toString(sdsa));
            divQues = Integer.toString(sdsb) + "-" + Integer.toString(sdsa);
            if(div.containsKey(divQues)){
                jTextField1.setText("");
                jTextField1.requestFocus();
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
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Single Digit Subtraction");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setText("-");

        jTextField1.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        userAnswer = jTextField1.getText().trim();
        String ans = "N";
        //userInput = Integer.toString(answer);
        if (!userAnswer.isEmpty() && userAnswer.matches("[0-9]|[1-9][0-9]|[1-9][0-9][0-9]|[1-9][0-9][0-9][0-9]")){
            if (corrAnswer.equals(userAnswer)){
                System.out.println("Corranswer is " + corrAnswer + ", User Answer is: " + userAnswer);
               //values.add(userInput);
               div.put(divQues, userAnswer);
               JOptionPane.showMessageDialog(null, "You are right!");
            }
            else{
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
        //quiz();// TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Subtraction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Subtraction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Subtraction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Subtraction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Subtraction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
