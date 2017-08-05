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
//Program to calculate the Highest Common divisor of the two numbers
//using the Euclidean Algorithm
public class Euclidean {
    public static void main(String[] args){
        int A; //declaration for storage of 1st number
        int B; //declaration for storage of 2nd number
        String s1 =JOptionPane.showInputDialog("Enter the first integer"); //accepts 1st number input
        A = Integer.parseInt(s1); //converts 1st number to Integer
        String s2 =JOptionPane.showInputDialog("Enter the second integer"); //accepts 1st number input
        B = Integer.parseInt(s2);  //converts 1st number to Integer
        int rem; //rem- Remainder
        int full;
        String form;
        try{
        while(A>0||B>0){      
            rem = A%B; //remainder when A is divided by B
            full = A/B; //value of A divided by B
            form = A+" = "+B+"*"+full+" + "+rem;
            System.out.println(form);
            A=B; //asigns value of B as new value of A
            B=rem; //asigns value of rem as new value of B
        }
         //start of catch statement   
        }catch(ArithmeticException ex){ 
            System.out.println("");
        }
         //end of catch statement
        System.out.println("Therefore the GCD IS "+A); //printing of results
        
        
    }
    
}
