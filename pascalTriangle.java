/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments.on.java;

/**
 *
 * @author Fabusuyi012
 */
public class PascalTriangle {
    public static void main(String[] args){
        for(int i=1; i<=30; i*=2){
            String rev = "";
            for(int a=30; a>=i; a/=2){
                System.out.print(" ");
            }
            
            for(int a=1; a<=i; a*=2){
                System.out.print(a+" ");
            }
            if(i!=1){
                for(int a=1; a<=i-1; a*=2){
                    rev+= " "+a;
                }
                System.out.print(new StringBuffer(rev).reverse().toString());
            }
            System.out.println("");
        }
    }
    
}
