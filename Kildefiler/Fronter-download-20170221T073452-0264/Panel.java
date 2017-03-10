import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panel extends JPanel//klassen Panel nedarver fra JPanel
{
  BufferedImage billede;//opretter variabel til billede
  //konstruktør til Panel klassen
  public Panel()
  {
    try
    {
      billede = ImageIO.read(new File(System.getProperty("user.dir")+"/src/Bro.JPG"));
      //System.getProperty("user.dir") henter brugerens sti til aktuelle mappe
      //i Netbeans er det projektmappen
      //se javabog.dk platformuafhængige filnavne 
    }catch(IOException e)
    {
      e.printStackTrace();
    }
  }//slut konstruktør for Panel klassen
  //her hentes grafikobjekt med en række metoder til tegning osv.
  //paintComponent() metoden fra JComponent klassen tilsidesættes
  public void paintComponent(Graphics g)
  {
    g.drawImage(billede,0,0,null);
  }
}//slut Panel klasse

