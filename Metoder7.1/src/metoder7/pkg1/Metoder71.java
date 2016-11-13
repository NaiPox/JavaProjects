/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metoder7.pkg1;
//Scanner til bruger-input
import java.util.Scanner;
/**
 *
 * @author Lennard Martensen Thomsen
 */
public class Metoder71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        //Definerer bruger-iputsscanneren
        Scanner Kinput = new Scanner(System.in);
        System.out.println("Tast 1 for at udregne fødselsår");
        System.out.println("Tast 2 for at udrregne telefonregning");
        System.out.println("Tast 3 for at returnere to sammensatte tekststrenge");
        
        int valg = Kinput.nextInt();
        if( valg == 1)
        {
        //Kode, som retunerer et heltal
        int ÅrstalNu,alder,uddata;
        ÅrstalNu = 2016;
        System.out.print("Indtast din alder her: ");
        //Kode, der modtager bruger-input og gemmer dets data
        alder = Kinput.nextInt();
        uddata = ÅrstalDa(ÅrstalNu,alder);
        System.out.println("Du er født i "+ uddata);
        }
        //Kode, som håndterer telefonregning
        else if(valg == 2)
        {
            double minutpris, TidBrugt, uddata2;
        System.out.print("Indtast din minutpris: ");
        minutpris = Kinput.nextDouble();
        System.out.print("Indtast din brugte taletid (minutter: ");
        TidBrugt = Kinput.nextDouble();
        uddata2 = TlfRegning(minutpris,TidBrugt);
        System.out.println("Din regning er nu: "+uddata2+" Kr.");
                
        }
        //Kode, som retunerer en tekststreng
        else if(valg == 3)
        {
            String tekst1,tekst2,uddata3;
            System.out.print("Indtast valgfri tekst her: ");
            tekst1 = Kinput.next();
            System.out.print("Indsæt valgfri tekst igen her: ");
            tekst2 = Kinput.next();
            uddata3 = T1T2(tekst1, tekst2);
            UnderMetodePrint(uddata3);
        }
        //Besked hvis man ikke vælger en af de angivede muligheder
        else
        {
        System.out.println("Dette er ikke en mulighed, programmet lukker.");
        Thread.sleep(1000);
        }
        //Undermetode til demonstration af void vha. print.
    }
    public static void UnderMetodePrint(String uddata3)
    {
    System.out.println("Din tekst er: "+uddata3);
    }
    //Returnerer to sammensatte teksstrenge
    public static String T1T2(String tekst1, String tekst2)
        {
        String Tekst = tekst1+ " " + tekst2;
        return Tekst;
        }
    //Håndterer udregning af og returnerer et decimaltal
    public static double TlfRegning(double minutpris, double TidBrugt)
    {
    double Regning = TidBrugt*minutpris;
    return Regning;
    }
    //Metode, der håndterer udregninger til heltal
    public static int ÅrstalDa(int ÅrstalNu,int alder)
    {
    int Fødselsår = ÅrstalNu - alder;
    return Fødselsår;
    }
   }
