import javax.swing.JFrame;//importer JFrame
/**
 *
 * @author euc,JUJ
 */
public class Frame0
{

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args)
  {
    JFrame vindue = new JFrame("Demo JFrame");//opret JFrame container
    vindue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//luk ved tryk på x
    vindue.setSize(500,300);//antal pixels i vandret og lodret
    vindue.setResizable(false);//låser vinduets størrelse
    
    //System.out.println("sti: "+System.getProperty("user.dir"));
    vindue.setVisible(true);//gør vinduet synligt
  }
  
}
