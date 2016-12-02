/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgave11;
import java.util.Scanner;
        
/**
 *
 * @author EUC
 */

public class MoentHul {
    
Scanner Kinput = new Scanner(System.in);

    private boolean hul = false;
    
    public void Moent()        
        {
            valg();
        System.out.println("Jeg er en mønt uden hul."+this);
        }
    
    public void Moent(String hul)
        {
            valg();
        System.out.println("Jeg er en mønt med hul i."+this);
        }
    
    public void valg()
        {
            int v;
        v = Kinput.nextInt();
        
            if(v == 1)
            {
            hul = true;
            }
            else if(v == 2)
                {
                hul = false;
                }
            else
            {
            hul = false;
            }
        }

public String toString()
    {
    String HulEllerEj, txt;
    
    }

}


