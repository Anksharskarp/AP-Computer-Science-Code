import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Class25Part1 {
    private JFrame frame;

    public Main () {
        frame = new JFrame("DrawGrid");
        frame.setSize(1000, 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(frame.getSize());
        frame.add(new cPanel(frame.getSize()));
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String... argv) {
        new Main();
    }

    public static class cPanel extends JPanel  implements MouseListener {
        /**
         *
         */
        private static final long serialVersionUID = 1L;
        int cellSize = 70;
        int turn = 0;
        int rows = 7;
        int cols = 7;
        boolean winner=false;
        String ccolor = "";
        Color[][] grid = new Color[rows][cols];
        
        public cPanel(Dimension dimension) {
            setSize(dimension);
            addMouseListener(this);
            //1. initialize grid here
            for (int i = 0; i < rows; i++) 
                for (int j = 0; j < cols; j++) 
                    grid[i][j] = Color.white;
            
        }

        @Override
        public void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D)g;
            Dimension d = getSize();
            g2.setColor(new Color(0, 100, 200));
            g2.fillRect(0,0,d.width,d.height);
 
            //draw grid here
            int xPos = 0;
            int yPos = 0;
            for (int i = 0; i < rows; i++)
                for (int j = 0; j < cols; j++) {
                    g2.setColor(grid[i][j]);
                    g2.fillOval(xPos, yPos, cellSize);
                    xPos += cellSize;
                }
        }

        public void mousePressed(MouseEvent e) {
        	
        	// drop a checker
          
        }

                
		public void mouseReleased(MouseEvent e) {
		
		}

        public void mouseEntered(MouseEvent e) {

        }

        public void mouseExited(MouseEvent e) {
           
        }

        public void mouseClicked(MouseEvent e) {

        }
        

        public void reset(){
        	//  reset
            
                
            
        }

		
    }
}
