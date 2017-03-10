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
    JFrame vindue = new JFrame("WIP");//opret JFrame container
    vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//luk ved tryk på x
    vindue.setSize(800,600);//antal pixels i vandret og lodret retning
    vindue.setResizable(false);//låser vinduets størrelse
    
    //System.out.println("sti: "+System.getProperty("user.dir"));
    vindue.setVisible(true);//gør vinduet synligt
  }
  
}
