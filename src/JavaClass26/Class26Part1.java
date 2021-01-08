import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Class26Part1 {
    private JFrame frame;

    public Class26Part1() {
        frame = new JFrame("DrawGrid");
        frame.setSize(1000, 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(frame.getSize());
        frame.add(new cPanel(frame.getSize()));
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String... argv) {
        new Class26Part1();
    }

    public static class cPanel extends JPanel {       
        
        /**
		 *
		 */
		private static final long serialVersionUID = 6722892851360287178L;

		public cPanel(Dimension dimension) {
            setSize(dimension);            
        }

        @Override
        public void paintComponent(Graphics g) {
        }

        public void drawYinYang(Graphics g, int diameter, Color c1, Color c2) {
            Graphics2D g2 = (Graphics2D)g;
            Dimension d = getSize();

            g2.setColor(c1);
            g2.fillArc(0, 0, diameter, diameter, 0, 180);
            g2.setColor(c2);
            g2.fillArc(0, 0, diameter, diameter, 0, -180);
            
            g2.setColor(c2); 
            g2.fillArc(0, diameter/ 4, diameter / 2, diameter / 2, 0, 180);
            
            g2.setColor(c1); 
            g2.fillArc(diameter / 2, diameter / 4, diameter / 2, diameter / 2, 0, -180);
            
            g2.setColor(c2); 
            g2.fillArc(diameter / 4 - diameter / 8, diameter / 2 - diameter / 8, diameter / 4, diameter / 4, 0, 360);
 
            g2.setColor(Color.black); 
            g2.fillArc(50, 25, 50, 50, 0, -180);

            g2.setColor(Color.black); 
            g2.fillArc(13, 37, 25, 25, 0, 360);
 
            g2.setColor(Color.white); 
            g2.fillArc(63, 37, 25, 25, 0, 360);
        }

    }
}   