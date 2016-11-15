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
    public static void main(String[] args) {
        // TODO code application logic here
        //Defines Scanner
        Scanner Kinput = new Scanner(System.in);
        System.out.println("Welcome to ASCII-TANK\n"
                + "Please choose your desired text speed (1 for slow , 2 for medium or 3 for fast): ");
       int tSpeed, x;
       tSpeed = Kinput.nextInt();
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
      String Controls = ("Placeholder");
              
      
    //Method that clears the console whenever Clear(); Is prompted in the code.

   
}

public static void Clear()
    {
    for(int clear = 0; clear < 50; clear++)
    {
    System.out.println("\b");
    }
    }
}