import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class TekstFelt
{
  JFrame vindue = new JFrame("JTextField demo");
  JTextField tekstfelt = new JTextField("Hej, her er et eksempel på JTextField");
  
  public static void main(String[] args)
  {
    SwingUtilities.invokeLater(new Runnable(){public void run(){new TekstFelt();}});
    //måde at få ting til at køre på i trådet programmering mv. se dokumentation Oracle
  }
  //konstruktør
  public TekstFelt()
  {
    //tekstfelt.setFont(new Font("Verdana",Font.PLAIN,20));//afprøv
    //tekstfelt.setEditable(false);//afprøv
    //tekstfelt.setEnabled(false);//afprøv
    tekstfelt.setText("Dette er en ny tekst fra programmet!");
    String s = tekstfelt.getText();
    vindue.setTitle(s);
    vindue.add(tekstfelt);
    vindue.setDefaultCloseOperation(vindue.DISPOSE_ON_CLOSE);
    vindue.pack();//tilpasser vindue til tekstfelts størrelse
    vindue.setVisible(true);
  }
}
