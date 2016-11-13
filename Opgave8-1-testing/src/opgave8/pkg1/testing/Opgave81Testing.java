/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgave8.pkg1.testing;
import java.util.Scanner;
/**
 *
 * @author EUC
 */
public class Opgave81Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Kinput = new Scanner(System.in);
    int tal;
    System.out.print("\n\nIndtast et tal, der skal undersøges(lige/ulige): ");
    tal = Kinput.nextInt();
    //? evaluerer hvor vidt et tal er sandt eller faslk, hvis sandt, evalueres lige, hvis falsk ulige.
    System.out.println("\nTallet er " +(tal%2==0  ? "lige": "ulige"));
        
        
    }
    

   
}
