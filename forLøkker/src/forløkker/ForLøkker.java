/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forløkker;
import java.util.Scanner;
/**
 *
 * @author EUC
 */
public class ForLøkker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Kinput = new Scanner(System.in);
            
        // TODO code application logic here
  
      
    //Her under er  Alder4 programmet fra lektion 5
    int alder;
    for (alder = 15; alder<18; alder++ )
    {
       System.out.println("Du er "+alder+" år. Vent til du bliver ældre.");
       System.out.println("Tillykke med fødselsdagen");
    } 
      System.out.println("Nu er du "+alder+" år og myndig. ");
                
    }
    
}
