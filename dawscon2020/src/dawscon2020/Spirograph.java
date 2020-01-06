/*
*
*/
package dawscon2020;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author markee
 */
public class Spirograph extends JFrame {
    
    public Spirograph() {
        
        BufferedImage image = new BufferedImage(500, 500, BufferedImage.TYPE_INT_ARGB);
        
        Graphics2D g2 = image.createGraphics();
        
        /**
         * cool stuff we are going to edit to draw our picture
         */
        
        g2.setPaint(Color.RED);
        
        g2.drawRect(0, 0, 499, 499);
        
        for( int x = 0; x <500; x=x+20){
            
            g2.setPaint(Color.BLACK);
            g2.drawLine(x, 0, 0, 500- x);
            
            //WHAT HAPPENS WHEN YOU UNCOMMENT THIS CODE?
            //  g2.setPaint(Color.GREEN);
            //  g2.drawLine(x, 500, 500, 500- x);
            
            //CAN YOU ADD THE 2 MISSING SIDES?
            
        }
        
        displayImage(image);
    }
    
    /////////////////////////////////////////////////////////////////////////////
    /**
     * ALL THE STUFF BELOW WE CAN IGNORE UNTIL DAWSCON 2021!
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Spirograph colorShape = new Spirograph();
        
    }
    
    private void displayImage(BufferedImage image) throws HeadlessException {
        final ImagePanel display = new ImagePanel(image);
        setLayout(new BorderLayout());
        
        //set sizes
        final int width = image.getWidth();
        final int height = image.getHeight();
        
        setSize(new Dimension(width + 10, height + 10));
        
        JOptionPane.showConfirmDialog(null, display, "Dawscon", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
        
        System.exit(0);
    }
    
    private class ImagePanel extends JPanel {
        
        private BufferedImage image;
        
        ImagePanel(final BufferedImage image) {
            if (image != null) {
                this.image = image;
                
                this.setPreferredSize(new Dimension(image.getWidth(), image.getHeight()));
            }
        }
        
        @Override
        public final void paintComponent(final Graphics g) {
            super.paintComponent(g);
            final Graphics2D g2 = (Graphics2D) g;
            g2.drawImage(image, 0, 0, this);
        }
        
    }
}
