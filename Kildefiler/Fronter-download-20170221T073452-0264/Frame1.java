import javax.swing.JFrame;//importer JFrame
/**
 *
 * @author euc,JUJ
 */
public class Frame1
{

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args)
  {
    JFrame vindue = new JFrame("Demo JFrame");//opret JFrame container
    
    //oprettelse af panel objekt
    Panel1 panel1=new Panel1();
    //tilføj panel objekt til vindue
    vindue.add(panel1);
    
    vindue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//luk ved tryk på x
    vindue.setSize(500,300);//antal pixels i vandret og lodret
    //vindue.setResizable(false);//låser vinduets størrelse
    
    
    vindue.setVisible(true);//gør vinduet synligt
  }
  
}
