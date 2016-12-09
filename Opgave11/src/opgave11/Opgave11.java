/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgave11;

/**
 *
 * @author EUC
 */
public class Opgave11 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    final int Limit = 1000;
    int sum_mhul = 0, sum_uhul = 0;
    
    System.out.println("\nMønter produceres af Kjield. !!!WIP!!!");
    MoentHul nyMønt = new MoentHul();
    
        for(int i = 1; i <= Limit; i++)
        {
        nyMønt.Kjield();
        
            if(nyMønt.getLavHul() == nyMønt.Uhul)
            {
                 sum_mhul++;
            }
                else
                {
                    sum_uhul++;
                }
        }
        String KjieldProduktion = ("\nAntal af producerede mønter var: "+Limit
                + "\nantallet af mønter med hul i var: "+sum_mhul
                + "\nantallet af mønter uden hul i var: "+sum_uhul
                + "\nMønt: "+nyMønt);
        System.out.println(KjieldProduktion);
        
   
                                            }
}

