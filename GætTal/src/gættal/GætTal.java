/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gættal;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;
/**
 *
 * @author EUC
 */
public class GætTal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, AWTException {
        // TODO code application logic here
         java.util.Scanner Kinput = new java.util.Scanner(System.in);    
    int Rtal;
        Rtal = (int) (100*Math.random())+1;
        System.out.println("Du skal gætte et tal mellem 1 og 100:");
    int Gæt;
    Gæt = Kinput.nextInt();   
     int Tæl;
     Tæl = 1;
    
    while(Rtal!= Gæt && Tæl<5){
        Robot r=new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_L);
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_L);
Thread.sleep(500);
    System.out.println("Du har gættet forkert, prøv igen.");
    Thread.sleep(2000);
    Gæt = Kinput.nextInt();
    Tæl = Tæl+1;
    
    
    
    }

    
    
    
    
    
    }
   
  
}
