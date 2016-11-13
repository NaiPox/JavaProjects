/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andetprogram;
import java.util.Scanner;
/**
 *
 * @author EUC
 */
public class  AndetProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            //Definerer Kinput som en scanner
        Scanner Kinput = new Scanner(System.in);
        System.out.println("Tast 1 for at beregne volumen af en kugle");
        System.out.println("Tast 2 for at beregne volumen af en cylinder");
        System.out.println("Tast 3 for at beregne arealet af et cirkeludsnit");
        int Valg_beregning;
        Valg_beregning = Kinput.nextInt();
        
        
        if(Valg_beregning == 1){
         System.out.println("Indstast kuglens radius");
         Double radius_kugle;
         radius_kugle = Kinput.nextDouble();
         System.out.println("Kuglens radius er: " + radius_kugle);
         Double Volumen_kugle;
         Volumen_kugle = (4/3)*Math.PI*(radius_kugle*radius_kugle*radius_kugle);
         System.out.println("Kuglens volumen er: " + Volumen_kugle);
        }
        
        else if (Valg_beregning == 2) {
             //Skriver en string
        System.out.println("Indtast cylinderens radius:");
        // Definerer at variablen radius_cirkel nu er en Double
        Double radius_cylinder;
        //Tillader bruger input til bestemmelse af radius_cirkel variabel
        radius_cylinder = Kinput.nextDouble();
        //Skriver string
        System.out.println("Indtast cylinderens højde:");
        //Definerer at variablen højde_cirkel nu er en Double
        Double højde_cylinder;
        //Tillader bruger input til bestemmelse af højde_cirkel variabel
        højde_cylinder = Kinput.nextDouble();
        //Skriver valgte radius og højde
        System.out.println("Radius:" + radius_cylinder);
        System.out.println("Højde:" + højde_cylinder);
        //Udregner volumen
        Double volumen;
        volumen = radius_cylinder * radius_cylinder * højde_cylinder * Math.PI;
        //Skriver volumen
        System.out.println("Volumen: " + volumen);
            
            
        } 
        
        else if (Valg_beregning == 3){
                System.out.println("Angiv radianen");
                Double r1;
                r1 = Kinput.nextDouble();
                System.out.println("indtast vinklen");
                Double vinkel;
                vinkel = Kinput.nextDouble();
                Double areal;
                areal = ((r1*r1)*vinkel)/2;
                System.out.println("Cirkeludsnittets areal er: " + areal);
                
        }
        }
        }
                
   

