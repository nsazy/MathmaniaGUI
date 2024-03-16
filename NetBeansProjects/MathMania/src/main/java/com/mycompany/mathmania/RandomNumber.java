/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
//package com.mycompany.mathmania;
//
//import java.util.ArrayList;
//import javax.swing.JTextField;
//import java.util.Random;
//import SingleDigitAddition.java;
//
///*
//*
//* @author nicholassazy
//*/
//public class RandomNumber {
//         String answer = "";
//         int userInput = 0;
//         int corrAnswer = 0;
//         int index = 0;
//         final int PROBLEMS = 10;
//         ArrayList<Integer> values = new ArrayList<Integer>();
//        JTextField userAnswer = new JTextField();
//  
//   private void quiz(){
//         
//       
//       Random rand  = new Random();
//       
//       //jLabel2.setText("Number " + (index + 1));
//        int sdsa = rand.nextInt(10,100);
//        int sdsb = rand.nextInt(10, 100);
//       corrAnswer = sdsa + sdsb;
//            if (sdsa > sdsb){
//            jLabel1.setText(Integer.toString(sdsa));
//            jLabel2.setText(Integer.toString(sdsb));
//        }else{
//           //jLabel1.setText(Integer.toString(sdsb));
//            //jLabel2.setText(Integer.toString(sdsa));
//       }
//        if (index == 10){
//            int a1 = values.size();
//            System.out.println("Number of correct " + a1);
//           PercentageCorrect.percentageCorrect(a1, PROBLEMS);
//           this.dispose();                
//
//            jTextField1.setText("");
//            jTextField1.requestFocus();       
//              index++;
//    }
//}
