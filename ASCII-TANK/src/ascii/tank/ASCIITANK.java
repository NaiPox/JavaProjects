/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascii.tank;
import java.util.Scanner;
/**
 *
 * @author EUC
 */
public class ASCIITANK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        //Defines Scanner
        Scanner Kinput = new Scanner(System.in);
        System.out.println("Welcome to ASCII-TANK\n"
                + "Please choose your desired text speed (1 for slow , 2 for medium or 3 for fast): ");
       int tSpeed, x, x2;
       try{
       tSpeed = Kinput.nextInt();
       } catch (java.util.InputMismatchException err)
       {
       tSpeed = 4;    
       }
       
               
       switch (tSpeed) {
            case 1:
                x = 75;
                break;
            case 2:
                x = 50;
                break;
            case 3:
                x = 25;
                break;
            default:
                Clear();
                System.out.println("Valid option not chosen, defaulting to medium text speed.");
                x = 50;
                break;
        }
        
      String Controls = ("CONTROLS\n"
              + "On the left side of any given line of text which promts an action a number can be found which if typed and entered will promt said action.\n "
              + "Example:\n"
              + "1. Shoot Heavy Grenade\n"
              + "2. Repair Tank\n"
              + "Try it now!\n ");
              for(int Ctrl = 0; Ctrl < Controls.length(); Ctrl++)
              {
              System.out.print(Controls.charAt(Ctrl));
              Thread.sleep(x);
              }
             System.out.print("Input: ");
               x2 = Kinput.nextInt();
              
               if(x2 == 1)
              {
                  String SHG = ("You fired a Heavy Grenade! ");
                          for(int S = 0; S < SHG.length(); S++)
                          {
                              System.out.print(SHG.charAt(S));
                              Thread.sleep(x);
                          }
              }
              else
              {
                  System.out.print("Something went wrong.");
              }
              }
              
              
//Method that clears the console whenever Clear(); Is prompted in the code.             
public static void Clear()
    {
    for(int clear = 0; clear < 50; clear++)
    {
    System.out.println("\b");
    }
    }
}

