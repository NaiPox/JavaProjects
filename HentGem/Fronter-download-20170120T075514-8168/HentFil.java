import java.io.*;

public class HentFil
{

  public static void main(String[] args)
  {
  final int EOF= -1; //End Of File
  int ind;
  String filnavn;

  System.out.print("\nIndtast filnavn paa fil, der skal hentes: ");
  filnavn = Keyboard.readString();
  try
    {
    FileInputStream IndFil = new FileInputStream(filnavn);
    DataInputStream IndStroem = new DataInputStream(IndFil);

    while ((ind = IndStroem.read()) != EOF)//Så længe fil ikke slut
       System.out.print((char)ind);
    IndFil.close();
    }
  catch (IOException fejl)
    {
    System.out.println("\nFejlkode: " + fejl);
    }
  finally    //Kan udelades
    {
    System.out.println("\nHvis noget vigtigt skal opryddes...\n");
    }
  System.out.println("\nHer kommer resten af programmet...\n");
  }

}