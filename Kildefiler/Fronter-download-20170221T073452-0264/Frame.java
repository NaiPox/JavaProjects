import javax.swing.JFrame; //
/**
 * @author euc, JUJ
 */
public class Frame extends JFrame //klassen Frame nedarver fra klassen JFrame
{
  /**
   * @param args the command line arguments
   * her kan I oprette variable mv.
   */
  public static void main(String[] args)
  {
    Frame vindue = new Frame();//konstruktør for Frame kaldes
  }
  //konstruktør
  public Frame()
  {
    super("Demo JFrame");//kald til superklassens(JFrames) konstruktør
    setSize(500,300);//angiver størrelse på JFrame i pixels
    setResizable(false);//deFault kan man ændre på rammens størrelse
    setDefaultCloseOperation(EXIT_ON_CLOSE);//hvad skal der ske når man trykker
                                            //på x højre hjørne af vinduet
                                         //Man kunne også bruge DISPOSE_ON_CLOSE
    /*
      her kan I lave kode
    */
    setVisible(true);//gør rammen synlig
  }
}
