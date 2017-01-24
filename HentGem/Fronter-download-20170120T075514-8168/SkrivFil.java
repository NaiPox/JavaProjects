import java.io.*;

public class SkrivFil
{

  public static void main(String[] args)
  {
  final int CR= 13; //Carrier return = Enter
  int udKarakter;
  String filnavn;

  System.out.print("\nIndtast filnavn paa fil, der skal skrives/overskrives i: ");
  filnavn = Keyboard.readString();
  try
    {
    FileOutputStream UdFil = new FileOutputStream(filnavn);
    DataOutputStream UdStroem = new DataOutputStream(UdFil);

    System.out.println("\nBegynd indtastning: ");
    while ((udKarakter = System.in.read()) != CR)//Så længe ikke "enter"
       UdStroem.write(udKarakter);

    UdFil.close();
    }
  catch (IOException fejl)
    {
    System.out.println("\nFejlkode: " + fejl);
    }
  
  System.out.println("\nHer kommer resten af programmet...\n");
  }

}