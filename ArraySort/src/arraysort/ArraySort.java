/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysort;
import java.util.stream.IntStream;

/**
 *
 * @author Lennard Martensen Thomsen
 */
//Import til brug i sorteringsmetoden.
import java.util.Arrays;
public class ArraySort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Først defineres array og størrelse på array.
    int[] sTal = new int[100];
      int x = 0;
     //Løkke og tilegning af værdier til sTal arrayet
      for(int i=1; i<=100; i++) 
      { 
       sTal[x] = 1+(int) (Math.random()*99);
       x++;
      }
      System.out.println("Usorteret Array. ");
      //Metode kaldes til at lave formatering i vores array med printf.
         Gen(sTal);
      System.out.println("Sorteret Array. ");
      //Metode kaldes for at sortere arrays og eftørfølges af formateringsmetoden.
      sTal = Sort(sTal);
      Gen(sTal);
      System.out.print("Udregning af middelværdi: ");
      //Metode for udregning af middelværdi og spredning kaldes.
      AVG(sTal);
     System.out.println("\n");
     System.out.println("Største-, mindsteværdi og median:");
     System.out.println("Største værdi: "+sTal[99]);
     System.out.println("Mindste værdi: "+sTal[0]);
     System.out.println("Median: "+sTal[49]);
       
    }
    //Metode, som foretager udregninger af middelværdi og spredning.
    public static void AVG( int[] sTal)
    {   
        int S1;
        int X1 = 0;
        //Udregning af sum
        int sum = IntStream.of(sTal).sum();
        //Udregning af gennemsnit
        int AVGcalc = sum/sTal.length;
        System.out.print(AVGcalc+"\n");
        for (int n1=0; n1<sTal.length; n1++)
        {
        X1=(int) (Math.pow((sTal[n1]-AVGcalc), 2))+X1;
        }
        S1=(int) Math.sqrt(X1/100-1);
        System.out.print("Udregning af spreding: ");
        System.out.print(S1);
       
      
        //Udnytter Arrays.sort for at sortere array (sTal);
    }
     public static int[] Sort(int[] sTal)
     {
        Arrays.sort(sTal);
        return sTal;
     }
          //Metode til formatering.
    public static void Gen( int [] sTal)
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
