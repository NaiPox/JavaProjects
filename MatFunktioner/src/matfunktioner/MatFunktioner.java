/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matfunktioner;
//Scanner til potentielt brugerinput
import java.util.Scanner;

/**
 *
 * @author EUC
 */
public class MatFunktioner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Definition af scanner til brugerinput, hvis programmet udvikles vidre
        Scanner Kinput = new Scanner(System.in);
        
        //Find Diskriminanten
        System.out.println("Diskriminant for ligning x^2+2x-9=0 udregnes.");
        System.out.println("Andengradsligning: a*x^2+b*x+c=0");         
        System.out.println("Formel: d = b^2-4*a*c");
        //Definerer værdier
        double b;
        b = 2.0;
        double a;
        a = 1.0;
        double c;
        c = -9.0;
        double d;
        //Math.pow fra Math biblioteket udregner den anden potens af b
        d = Math.pow(b, 2)-4*a*c;
        System.out.println("Diskriminanten er: "+ d);
        System.out.println("x1 og x2 findes");
        
       double x1;
       x1 = (-b+Math.sqrt(d))/(2*a);
       System.out.println("x1 er: "+ x1);
       double x2;
       x2 = (-b-Math.sqrt(d))/(2*a);
       System.out.println("x2 er: "+x2); 
       
        
    }
    
}
