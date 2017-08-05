/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecimalBinary;

import java.util.Arrays;

/**
 *
 * @author Fabusuyi012
 */
public class BinaryToDecimal {
    public static void main(String[] args){
        int a1 = 1001;
        int[] a = {a1};
        String n = Arrays.toString(a);
        int b=0;
        int total=0;
        int calc=1;
        for(int i = 0;i<=n.length()-1;i++){
            b = (int) ((n.charAt(i)-48)*Math.pow(2.0, i));
            total+=b;
        }
        System.out.println(total);
    }
    
}
 
