/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frand;

/**
 *
 * @author lenna
 */

    public class FRAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      String Letters = ("abcdefghijklmnoprstuvwxyzq");
           int x;
           x = (int) (Math.random()*26);
           System.out.println(x);
      System.out.println(Letters.charAt(x));
      int i;
        switch (x) {
            case 0:
                i = (int) ((Math.random()*53)+1);
                System.out.println(i);
                break;
            case 1:
                i = (int) ((Math.random()*18)+1);
                System.out.println(i);
                break;
            case 2:
                i = (int) ((Math.random()*31)+1);
                System.out.println(i);
                break;
            case 3:
                i = (int) ((Math.random()*24)+1);
                System.out.println(i);
                break;
            case 4:
                i = (int) ((Math.random()*28)+1);
                System.out.println(i);
                break;
            case 5:
                i = (int) ((Math.random()*6)+1);
                System.out.println(i);
                break;
            case 6:
                i = (int) ((Math.random()*10)+1);
                System.out.println(i);
                break;
            case 7:
                i = (int) ((Math.random()*8)+1);
                System.out.println(i);
                break;
            case 8:
                i = (int) ((Math.random()*9)+1);
                System.out.println(i);
                break;
            case 9:
                i = (int) ((Math.random()*39)+1);
                System.out.println(i);
                break;
            case 10:
                i = (int) ((Math.random()*40)+1);
                System.out.println(i);
                break;
            case 11:
                i = (int) ((Math.random()*25)+1);
                System.out.println(i);
                break;
            case 12:
                i = (int) ((Math.random()*30)+1);
                System.out.println(i);
                break;
            case 13:
                i = (int) ((Math.random()*19)+1);
                System.out.println(i);
                break;
            case 14:
                i = (int) ((Math.random()*4)+1);
                System.out.println(i);
                break;
            case 15:
                i = (int) ((Math.random()*11)+1);
                System.out.println(i);
                break;
            case 16:
                i = (int) ((Math.random()*17)+1);
                System.out.println(i);
                break;
            case 17:
                i = (int) ((Math.random()*26)+1);
                System.out.println(i);
                break;
            case 18:
                i = (int) ((Math.random()*13)+1);
                System.out.println(i);
                break;
            case 19:
                i = (int) ((Math.random()*1)+1);
                System.out.println(i);
                break;
            case 20:
                i = (int) ((Math.random()*8)+1);
                System.out.println(i);
                break;
            case 21:
                i = (int) ((Math.random()*3)+1);
                System.out.println(i);
                break;
            case 22:
                i = (int) ((Math.random()*1)+1);
                System.out.println(i);
                break;
            case 23:
                i = (int) ((Math.random()*3)+1);
                System.out.println(i);
                break;
            case 24:
                i = (int) ((Math.random()*4)+1);
                System.out.println(i);
                break;
            case 25: System.out.print("Not an option.");
                break;
                
            default: System.out.println("Error, no valid option was selected by the program.");
                break;
        }
        
    }
    
}
