/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciovariable3;


public class Ejerciciovariable3 {
    
     int a=1;
     int b=2;
     int c=3;
     int d=4;
    
    public static void main(String[] args) {
        
        int b=c;
        int c=a;
        int a=d;
        int d=b;
        
        System.out.print("los valores de las variables son:  " + (b,c,a,d));
        
        
        
    }
    
}
