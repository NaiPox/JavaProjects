/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsætninger;
import java.util.Scanner;
/**
 *
 * @author LMT
 */
public class IfSætninger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException 
    {
        // TODO code application logic here
        Scanner Kinput = new Scanner(System.in);
        System.out.println("Andengradsligning: a*x^2+b*x+c = 0");
        System.out.println("Diskriminant: d = b^2-4*a*c");
        System.out.println("");
        System.out.println("Angiv værdien a");
        
       double a;
       a = Kinput.nextDouble();
       System.out.println("Værdi a: "+a);
       System.out.println("");
       System.out.println("Angiv værdien b");
       double b;
       b = Kinput.nextDouble();
       System.out.println("Værdi b: "+b);
       System.out.println("");
       System.out.println("Angiv værdien c");
       Double c;
       c = Kinput.nextDouble();
       System.out.println("Værdi c: "+c);
       System.out.println();
       System.out.println("Diskriminanten udregnes...");
       Thread.sleep(1000);
       double d;
       double x1;
       double x2;
       d = Math.pow(b, 2.0)-4.0*a*c;
       System.out.println("Diskriminanten er: "+d);
       if(d > 0)
       {
         x1 = -b + Math.sqrt(d)/(2*a);
         x2 = -b - Math.sqrt(d)/(2*a);
         System.out.println("Værdi x1: " + x1);
         System.out.println("Værdi x2: " + x2); 
       }
       else if(d == 0)
       {
         System.out.println("Diskriminanten er 0, kun en løsning findes");
         System.out.println("Beregner diskriminanten...");
         Thread.sleep(1000);
         x1 = -b + Math.sqrt(d)/(2*a);
         System.out.println("Værdi x: " + x1 );
         
       
       }
       else if(d < 0)
       {
       System.out.println("Denne ligning skærer ikke x-aksen.");
       
       
       }
       
        
        
        
        
    }
    
}
