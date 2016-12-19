/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f.sort;
import java.util.Scanner;
/**
 *
 * @author EUC
 */
public class FSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Kinput = new Scanner(System.in);
        String[] SortF = {"A1", "A2", "A3"};
        int i;
        i = (int)(Math.random()*3);
        
        
        System.out.println(SortF[i]);
    }
    

}