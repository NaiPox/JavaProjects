/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f.sort;
import java.util.Scanner;
/**
 *
 * @author EUC
 */
public class FSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Kinput = new Scanner(System.in);
        System.out.println("Press 1 for F-randomizer.");    
        System.out.println("Press 2 to mark favourites");
        System.out.println("Press 3 to see favourites");
        int x = Kinput.nextInt();
        
        if (x == 1)
        {
        String[] SortF = {"A1", "A2", "A3","A4","A5","A6","A53"};
        int i;
        i = (int)(Math.random()*3);
        System.out.println(SortF[i]);
        }
        else 
        {
        System.out.println("W.I.P or invalid choice");
        }
    }
    

}