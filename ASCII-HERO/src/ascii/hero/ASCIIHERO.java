/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascii.hero;
import java.util.Scanner;

/**
 *
 * @author EUC
*/
public class ASCIIHERO {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws InterruptedException {
        // TODO code application logic here/
        Scanner Kinput = new Scanner(System.in);
        System.out.println("Please input your desired text speed.\n"
                + "It is not recommended to use to high or too low text speeds.\n"
                + "The larger the number put in, the slower it will go.\n"
                + "Desired text speed: ");
        int x = Kinput.nextInt();
        //Clearing();
        Clear();
        String DIALOGUE1 = 
        ("THIS IS ASCII-HERO.\n" +
        "HE WILL BE YOUR HERO IN THIS ADVENTURE.");
        for (int D1 = 0; D1 < DIALOGUE1.length(); D1++)
        {
        System.out.print(DIALOGUE1.charAt(D1));
        Thread.sleep(x);
        }
        Thread.sleep(200);
   String Character = 
            ("\n+---------+"
           + "\n|         |"
           + "\n|        -+"
           + "\n|         |"
           + "\n|       ^-+"
           + "\n+---------+"
           + "\n|  +---+  ^"
           + "\n|  |   |  |"
           + "\n|  |   |  |"
           + "\n|  |   |  |"
           + "\n|  |   |  |"
           + "\n|  +---+  |"
           + "\n+-+-----+-+"
           + "\n  |     |"
           + "\n  |     |"
           + "\n  |     |"
           + "\n  |     |"
           + "\n  |     |"
           + "\n  |     |"
           + "\n  +-----+"
           + "\n");
   for (int i = 0; i < Character.length(); i++)
   {
   System.out.print(Character.charAt(i));
   Thread.sleep(25);
   }
   Thread.sleep(1000);
      String DIALOGUE2 =
      ("YOU WILL NOW GET TAKEN TO THE CHARACTER CREATION MENU\n");
              for (int D2 = 0; D2 < DIALOGUE2.length(); D2++)
        {
        System.out.print(DIALOGUE2.charAt(D2));
        Thread.sleep(x);
              
    } 
    System.out.println("CHOOSE THE CATEGORY YOU WISH TO CHANGE.\n"
            + "TYPE AND ENTER 1 TO CHANGE THE HEAD.\n"
            + "TYPE AND ENTER 2 TO CHANGE THE TORSO.\n"
            + "TYPE AND ENTER 3 TO CHANGE THE LEGS\n");
    
      int CaC = Kinput.nextInt();
      if(CaC == 1)
      {
      System.out.print("HEAD 1 (DEFAULT)\n");
      String Head1 =
              ( "+---------+\n"
              + "|         |\n"
              + "|        -+\n"
              + "|         |\n"
              + "|       ^-+\n"
              + "+---------+\n");
      
      for (int H1 = 0; H1 < Head1.length(); H1++)
      {
      System.out.print(Head1.charAt(H1));
      Thread.sleep(25);
      
      }
      }
    
      if(CaC == 2)
      {
      System.out.println("Head 2 (JACK)");
      String Head2
              ("");
      }
      
      
      
    }
    public static void Clear()
    {
    for(int clear = 0; clear < 50; clear++)
    {
    System.out.println("\b");
    }
    }
   }

