/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8v1.pkg2;
import java.util.Scanner;
/**
 *
 * @author EUC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Kinput = new Scanner(System.in);
        int årstal;
        System.out.println("Dette program udregner om et år er skudår.");
        System.out.print("\n\nIndtast årstal her: ");
        årstal = Kinput.nextInt();
        if(årstal%400==0 || årstal%4==0 && årstal%100!=0)
        {
        System.out.println("Årstallet "+årstal+" er et skudår.");
        }
       else
        {
        System.out.println("Årstallet "+årstal+" er ikke et skudår.");
        }
    }
    
}
