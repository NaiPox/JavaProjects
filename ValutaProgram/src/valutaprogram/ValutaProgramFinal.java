/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valutaprogram;
import java.awt.AWTException;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.Console;
import java.io.IOException;
import static java.lang.System.console;
/**
 *
 * @author lenna
 */
public class ValutaProgramFinal {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
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
        
                            }
        else 
                                 {
            System.out.println("Kommissionen er " + EUR_K);
            EUR = EUR + EUR_K;
            System.out.println("Dit beløb i Euro er " + EUR);                          
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
        System.out.println("Dit beløb i Euro er "+ DKK);       
                               }
        else 
                                {
            System.out.println("Kommissionen er " + DKK_K);
            DKK = DKK + DKK_K;
            System.out.println("Dit beløb i Danske Kroner er " + DKK);    
                                } 
    }
    else
                            {
    System.out.println("Beklager, du har indtastet en forkert mulighed");
    System.out.println("");
    
    
    
                            }            
      }                    
     }   
    }





