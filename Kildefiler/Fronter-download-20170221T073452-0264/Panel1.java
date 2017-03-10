import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panel1 extends JPanel//klassen Panel nedarver fra JPanel
{
  public Panel1()
  {
    //her kommer kode som udføres ved oprettelse af panel objekt 
  }//slut konstruktør for Panel klassen
  //her hentes grafikobjekt med en række metoder til tegning osv.
  //paintComponent() metoden fra JComponent klassen tilsidesættes
  public void paintComponent(Graphics g)
  {
    g.setColor(Color.yellow);
    g.fillRect(10, 10, 100, 50);
    g.setColor(Color.red);
    g.drawOval(130, 10, 75, 75);
    g.setColor(Color.magenta);
    g.drawLine(10, 200, 300, 30);
    g.setColor(Color.GREEN);
    Font skrifttype = new Font("Serif",Font.ITALIC,36);
    g.setFont(skrifttype);
    g.drawString("Her er tekst med font Italic", 20, 250);
  }
}//slut Panel klasse
