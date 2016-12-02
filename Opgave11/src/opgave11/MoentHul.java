/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgave11;

/**
 *
 * @author Lennard Martensen Thomsen
 */

public class MoentHul {
    public final int Uhul = 0;
    public final int Hul = 1;
    private int LavHul;
    public final int runder = 1000;
    
    public void Moent()        
        {
          System.out.println("Mønt med eller uden hul skabes om et øjeblik.");
          Kjield();
          System.out.println("Test mønt "+this);
        }
      //Kjield er den arbejder som laver hul i mønterne!
    public void Kjield()
    {     
    LavHul = (int) (Math.random()*2);      
        }
    
   public int getLavHul()
   {
    return LavHul;   
   }

   
    @Override
   public String toString()
           {
               String LavHulName, txt;
               if (LavHul == Uhul)
               {
                LavHulName = " ikke hul i";
               }
                else
                {
                 LavHulName = " hul i";
                }
               txt = "Jeg er en mønt og har lige nu"+LavHulName;
                 return txt;
           }
}


