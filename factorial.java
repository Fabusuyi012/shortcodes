/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments.on.java;

import javax.swing.JOptionPane;

/**
 *
 * @author Fabusuyi012
 */
public class Factoria {
    public static void main(String[] args){ 
        String number = JOptionPane.showInputDialog(null, "Enter the number");
        int num = Integer.parseInt(number);
        int fac=1; 
        int x=0;

        for(int i=num;i>=1;i--){
           x = num-- ;
           fac*=x;
        }

        System.out.println(number+" factorial is "+fac);
    
    } 
}
