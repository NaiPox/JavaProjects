/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vp;

import java.util.Scanner;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
/**
 *
 * @author Lennard
 */
public class VP {
    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws InterruptedException, IOException {
        // TODO code application logic here
    Scanner Kinput = new Scanner(System.in);
    double DKK;
    double EUR;
    double ED = 7.46;
    double DE = 0.13;
    double DKK_K;
    double EUR_K;
    byte valg;
    boolean reset = true;
    
    while(reset = true){
    System.out.println("Vælg valuta til konvertering");
    System.out.println("");
    System.out.println("Tast 1 for at omregne DKK til EUR");
    System.out.println("Tast 2 for at omregne EUR til DKK");
    
    valg = Kinput.nextByte();
    if(valg == 1)
    {
        System.out.println("Du har valgt DKK til EUR");
        Thread.sleep(1000);
        System.out.println("");
        System.out.println("Indtast det beløb du ønsker at omregne");
        DKK = Kinput.nextDouble();
        EUR = DKK*DE;
        EUR_K = (EUR/100)*2;
        if(EUR_K < 0.5)
                            {
        EUR_K = 0.5;
        System.out.println("Kommissionen er " + EUR_K);
        EUR = EUR + EUR_K;
        System.out.println("Dit beløb i Euro er "+ EUR);
        Thread.sleep(4000);
            try {
        Robot robot = new Robot();
        
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_L);
        robot.keyPress(KeyEvent.VK_BACK_SPACE);
        robot.keyRelease(KeyEvent.VK_BACK_SPACE);
        robot.keyPress(KeyEvent.VK_BACK_SPACE);
        robot.keyRelease(KeyEvent.VK_BACK_SPACE);
        Thread.sleep(1000);
} catch (AWTException e) 
{


}
        
                            }
        else 
                                 {
            System.out.println("Kommissionen er " + EUR_K);
            EUR = EUR + EUR_K;
            System.out.println("Dit beløb i Euro er " + EUR);
            Thread.sleep(4000);
                try {
        Robot robot = new Robot();
        
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_L);
        robot.keyPress(KeyEvent.VK_BACK_SPACE);
        robot.keyRelease(KeyEvent.VK_BACK_SPACE);
        robot.keyPress(KeyEvent.VK_BACK_SPACE);
        robot.keyRelease(KeyEvent.VK_BACK_SPACE);
        Thread.sleep(1000);
} catch (AWTException e) 
{}
                                 }                                   
    }
    else if(valg == 2)
    {
        System.out.println("Du har valgt EUR til DKK");
        Thread.sleep(1000);
        System.out.println("");
        System.out.println("Indtast det beløb du ønsker at omregne");
        DKK = Kinput.nextDouble();
        DKK = DKK*ED;
        DKK_K = (DKK/100)*2;
        if(DKK_K < 0.5)
                               {
        DKK_K = 0.5;
        System.out.println("Kommissionen er " + DKK_K);
        DKK = DKK + DKK_K;
        System.out.println("Dit beløb i Danske Kroner er "+ DKK);
        Thread.sleep(4000);
            try {
        Robot robot = new Robot();
        
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_L);
        robot.keyPress(KeyEvent.VK_BACK_SPACE);
        robot.keyRelease(KeyEvent.VK_BACK_SPACE);
        robot.keyPress(KeyEvent.VK_BACK_SPACE);
        robot.keyRelease(KeyEvent.VK_BACK_SPACE);
        Thread.sleep(1000);
} catch (AWTException e) 
{}
                               }
        else 
                                {
            System.out.println("Kommissionen er " + DKK_K);
            DKK = DKK + DKK_K;
            System.out.println("Dit beløb i Danske Kroner er " + DKK);
            Thread.sleep(4000);
                try {
        Robot robot = new Robot();
        
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_L);
        robot.keyPress(KeyEvent.VK_BACK_SPACE);
        robot.keyRelease(KeyEvent.VK_BACK_SPACE);
        robot.keyPress(KeyEvent.VK_BACK_SPACE);
        robot.keyRelease(KeyEvent.VK_BACK_SPACE);
        Thread.sleep(1000);
} catch (AWTException e) 
{}         
            
                                } 
    }
    else
                            {
    System.out.println("Beklager, du har indtastet en forkert mulighed");
    System.out.println("");
    Thread.sleep(1000);
    try {
        Robot robot = new Robot();
        
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_L);
        robot.keyPress(KeyEvent.VK_BACK_SPACE);
        robot.keyRelease(KeyEvent.VK_BACK_SPACE);
        robot.keyPress(KeyEvent.VK_BACK_SPACE);
        robot.keyRelease(KeyEvent.VK_BACK_SPACE);
        Thread.sleep(1000);
} catch (AWTException e) 
{


}
    
                            }            
      }                    
     }   
    }




