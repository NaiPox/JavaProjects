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
public class ASCIITANK
{

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException
    {
        // TODO code application logic here
        //Scanner defineres
        Scanner Kinput = new Scanner(System.in);
        //Klar metoden kaldes
        Clear();
        //Introduktion til programmet
        System.out.print("Welcome to ASCII-TANK\n"
        + "Please choose your desired text speed (1 for slow , 2 for medium or 3 for fast): ");
        
        int tSpeed, x, Contr, MainM;
       
        tSpeed = 0;
        Contr = 0;
        MainM = 0;
       
       if(Kinput.hasNextInt())
       {
       tSpeed = Kinput.nextInt();
       }   
      
       switch (tSpeed) 
       {
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
       //Clear metode kaldt
       Clear();
       
      String Controls = 
              ("CONTROLS:\n"
              + "To promt an action, type and enter the the number to the left of it.\n\n "
              + "Example:\n\n"
              + "1. Shoot High Explosive Grenade\n\n"
              + "Try it now!\n\n ");
      
              //Forløkke som laver intervalprint af bogstaver
              for(int Ctrl = 0; Ctrl < Controls.length(); Ctrl++)
              {
              System.out.print(Controls.charAt(Ctrl));
              Thread.sleep(x);
              }
              
        String nextLine;
        nextLine = Kinput.nextLine();
             System.out.print("Input: ");
             
             if(Kinput.hasNextInt())
              {
              Contr = Kinput.nextInt();
              }
             
               if(Contr == 1)
              {
                  String SHG = ("You fired a High Explosive Grenade! \n\n");
                          for(int S = 0; S < SHG.length(); S++)
                          {
                              System.out.print(SHG.charAt(S));
                              Thread.sleep(x);
                          }
                          Thread.sleep(2000);
                          Clear();
              }
               
              else
              {
                  System.out.print("You exploded, game over. \n");
                  Thread.sleep(2000);
                          Clear();
              }
               
              String MainMenu =
                      ("MAIN MENU\n\n"
                      + "1. TEST\n");
              
              for(int MM = 0; MM < MainMenu.length(); MM++)
              {
              System.out.print(MainMenu.charAt(MM));
              Thread.sleep(x);
              }
              
              nextLine = Kinput.nextLine();
              System.out.print("Input: \n");
              
              if  (Kinput.hasNextInt())
              {
                  MainM = Kinput.nextInt();
              }
              
              if(MainM == 1)
              {
                  Clear();
                  
                String ATANK1 =
                        ("THIS IS A TEST PRINT OF AN ASCII-TANK\n"
                        + "     +---------+\n"
                        + "   +-------------------------+\n"
                        + "   |-------------------------+\n"
                        + "+------------------|\n"
                        + "|------------------|\n"
                        + "|-| ASCII-TANK 1 |-|\n"
                        + "|------------------|\n"
                        + "|X+->X+->X+->X->X-v+\n"
                        + "XX^-X<-+X<-+X<+X<-+X\n");  
                
                for(int AT1 = 0; AT1 < ATANK1.length(); AT1++ )
                {
                 System.out.print(ATANK1.charAt(AT1));
                 Thread.sleep(20);
                }
              }
              
              else
              {
              System.out.print("You really did it this time.\n"
                      + "No more ASCII-TANK for you, game over.");
              Thread.sleep(3000);
              Clear();
              }
              
    }
       
              
//Metode der tømmer skærmen for tekst når Clear(); metoden bliver kaldt i koden           
public static void Clear()
    {
    for(int clear = 0; clear < 50; clear++)
        {
        System.out.println("\b");
        }
    }
}

