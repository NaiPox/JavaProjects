/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysort;
//Import til udregning af sum
import java.util.stream.IntStream;
//Import til brug i sorteringsmetoden.
import java.util.Arrays;
/**
 *
 * @author Lennard Martensen Thomsen
 */
public class ArraySort {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Først defineres array og størrelse på array.
    int[] sTal = new int[100];
      
     //Løkke og tilegning af værdier til sTal arrayet
      for(int i=0; i<100; i++) 
      { 
        sTal[i] = 1+(int) (Math.random()*99);
      }
      
        System.out.println("Usorteret Array. ");
      
         //Metode kaldes til at lave formatering i vores array med printf.
             Form(sTal);
         
            System.out.println("Sorteret Array. ");
      
                 //Metode kaldes for at sortere arrays og eftørfølges af formateringsmetoden.
                 sTal = Sort(sTal);
                 Form(sTal);
      
                    System.out.print("Udregning af middelværdi: ");
      
                    //Metode for udregning af middelværdi og spredning kaldes.
                        AVG(sTal);
      
                            System.out.println("\n");
                                System.out.println("Størsteværdi, mindsteværdi og median:");
                                    System.out.println("Største værdi: "+sTal[99]);
                                        System.out.println("Mindste værdi: "+sTal[0]);
                                            System.out.println("Median: "+sTal[(49+50)/2]);    
    }
    
    //Metode, som foretager udregninger af middelværdi og spredning.
    public static void AVG( int[] sTal)
    {   
        double Spread;
        double X1 = 0;
        
        //Udregning af sum
        int sum = IntStream.of(sTal).sum();
        
        //Udregning af gennemsnit
        int AVGcalc = sum/sTal.length;
        System.out.print(AVGcalc+"\n");
        
        //Udregning af spredning
        for (int n1=0; n1<sTal.length; n1++)
        {
          X1 += (Math.pow((sTal[n1]-AVGcalc), 2));
        }
        
        Spread = Math.sqrt(X1/100-1);
        System.out.print("Udregning af spreding: ");
        System.out.print(Spread); 
    }
    
       //Udnytter Arrays.sort for at sortere array (sTal);
     public static int[] Sort(int[] sTal)
     {
        Arrays.sort(sTal);
        return sTal;
     }
     
          //Metode til formatering.
    public static void Form( int [] sTal)
    {  
      for(int n =0; n<sTal.length; n++){
          
          if(n % 10 == 0 /*&& n !=0*/)
          {
            System.out.println();
          }
            System.out.printf(" %3d", sTal[n]);
          }
             System.out.println();
               System.out.println();   
       
    }
    
}
