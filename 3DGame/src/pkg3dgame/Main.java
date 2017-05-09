/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3dgame;

import java.awt.Canvas;
import javax.swing.JFrame;

/**
 *
 * @author lenna
 */
public class Main extends Canvas implements Runnable {
    
    public static final int W = 800;
    public static final int H = 600;
    public final static String TITLE = "3DGAME";

    /**
     * @param args the command line arguments
     */
    private Thread thread;
    public boolean running = false;
    
    private void  start() {
        
        if (running) {
            running = true;
            thread = new Thread(this);
            thread.start();
            
        
            
        }
    }
    
    public static void main(String[] args) {

        // TODO code application logic here
        Main display = new Main();
        JFrame frame1 = new JFrame();
        frame1.setTitle(TITLE);
        frame1.add(display);
        frame1.setResizable(false);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(W, H);
        frame1.setLocationRelativeTo(null);
        frame1.pack();
        
    }
    
    private void stop() {
        if (!running) {
            running = false;
            try {
                thread.join();
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(0);
            }
        }
    }
    
    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
