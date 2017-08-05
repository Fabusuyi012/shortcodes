/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecimalBinary;

/**
 *
 * @author Fabusuyi012
 */
public class DecimalToBinary {
    public static void main(String[] args){
        int num = 8;
         int remainder;
        int base = 2;
        String rem = "";
        String remain = "";
        for(num=num;num>0;){
            remainder=num%base; 
            num/=base;      
            rem+=remainder;
            remain = new StringBuilder(rem).reverse().toString();
        } 
            System.out.print(remain);
    }
    
}
