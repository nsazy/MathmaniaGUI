/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mathmania;

import java.util.ArrayList;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author nicholassazy
 */
public class PercentageCorrect {
    LinkedHashMap<String, String> div = new LinkedHashMap<String, String>();
    
    
    
    
    
    //ArrayList<Integer> values;
    public static void percentageCorrect(LinkedHashMap<String, String> div) {
    
    ArrayList <String> nCnt = new ArrayList<String>();
    String answerFlag = "";
    String question = "";
    int count = 0;
    String number = "";
    int totalCorrect = 0;
    
        
        for (var entry : div.entrySet()){
            // System.out.println(entry.getKey() + " : " + entry.getValue());
             question = entry.getKey();
             answerFlag = entry.getValue();
             if (answerFlag.contains("N")){
                 
                 //String [] parts = answerFlag.split("N");
                 //System.out.println(parts[1]);
                 count++;
                 
                 
             }
        }
        totalCorrect = div.size() - count;
        System.out.println("You have " + count + " wrong out of a total of " + div.size() + " problems");
//        if (parts[1] != "N"){
//            count++;
//        }
//        //values = new ArrayList<Integer>();
//        //System.out.println(a1);
       if (totalCorrect >= 1 && totalCorrect < 4){
           System.out.println("You answered " + totalCorrect + " out of " + div.size() + " correctly.  Keep up the great effort!!");
           JOptionPane.showMessageDialog(null, "You answered " + totalCorrect + " out of " + div.size() + " correctly.  Keep up the great effort!!");
          
       }
       else if(totalCorrect >=4 && totalCorrect < 8){
           System.out.println("You answered " + totalCorrect + " out of " + div.size() + " correctly.  You are doing great!!");
           JOptionPane.showMessageDialog(null,"You answered " + totalCorrect + " out of " + div.size() + " correctly.  You are doing great!!");
       }
       else if(totalCorrect >=8 && totalCorrect <=10){
           System.out.println("You answered " + totalCorrect + " out of " + div.size() + " correctly.  Excellent work!!");
           JOptionPane.showMessageDialog(null,"You answered " + totalCorrect + " out of " + div.size() + " correctly.  Excellent work!!");
       }
       else {
           System.out.println("You answered " + totalCorrect + " out of " + div.size() + " correctly.");
            JOptionPane.showMessageDialog(null,"You answered " + totalCorrect + " out of " + div.size() + " correctly.");
       }
        
    }
}
