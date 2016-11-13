/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krypto;
import java.util.Scanner;
/**
 *
 * @author EUC
 */
public class Krypto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Kinput = new Scanner(System.in);
        String Tekststreng, uddata;
        int KryptoMod;
        double KryptoKode;
                
        System.out.print("Angiv tekst til kryptering: ");
        Tekststreng = Kinput.next();
        System.out.println(Tekststreng);
        System.out.println("String length: "+Tekststreng.length());
        KryptoMod = Tekststreng.length();
        uddata = Tekststreng;
        System.out.println(KryptoKode);
        
    }
   public static void Metode(String uddata, int a, int KryptoMod, double KryptoKode)
   {
       KryptoKode = Math.random()*100+1*KryptoMod;
       
       }
  }
