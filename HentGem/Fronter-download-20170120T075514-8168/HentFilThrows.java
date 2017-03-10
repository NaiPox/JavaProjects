import java.io.*;

public class HentFilThrows
{

  public static void main(String[] args) throws IOException
  {
  final int EOF= -1; //End Of File
  int ind;
  String filnavn;

  System.out.print("\nIndtast filnavn paa fil, der skal hentes: ");
  filnavn = Keyboard.readString();

  FileInputStream IndFil = new FileInputStream(filnavn);
  DataInputStream IndStroem = new DataInputStream(IndFil);

    while ((ind = IndStroem.read()) != EOF)//Så længe fil ikke slut
       System.out.print((char)ind);

  IndFil.close();
  System.out.println("\nMon dette bliver udskrevet?");
  }

}