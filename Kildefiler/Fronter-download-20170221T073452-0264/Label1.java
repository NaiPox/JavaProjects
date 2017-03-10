import javax.swing.*;

public class Label1
{
  public static void main(String[] args)
  {
    JFrame vindue = new JFrame("JLabel demo");;
    JLabel label = new JLabel();
    label.setIcon(new ImageIcon(System.getProperty("user.dir")+"/src/Bro.JPG"));
    
    vindue.add(label);//tilføj label til vindue
    
    vindue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//luk ved tryk på x
    vindue.pack();
    vindue.setVisible(true);
  }
}