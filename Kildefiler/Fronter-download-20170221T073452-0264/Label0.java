import java.awt.Font;
import javax.swing.*;

public class Label0
{
  public static void main(String[] args)
  {
    JFrame vindue = new JFrame("JLabel demo");;
    JLabel label = new JLabel();
    label.setText("Hej, her er et eksempel på JLabel");
    label.setFont(new Font("Serif",Font.PLAIN,30));
    vindue.add(label);//tilføj label til vindue
    
    vindue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//luk ved tryk på x
    vindue.pack();
    vindue.setVisible(true);
  }
}
