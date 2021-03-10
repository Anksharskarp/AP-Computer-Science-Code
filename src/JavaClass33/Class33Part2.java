package JavaClass33;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Class33Part2 extends JPanel implements ActionListener {

    static int score = 0;
    static int xPos, yPos;
    static int rounds = 0;
    //The timer is up every second.
    Timer t = new Timer(1000, this);

    public static void main(String[] args) {

        Class33Part2 c = new Class33Part2();

        JFrame j = new JFrame();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(700, 700);
        j.getContentPane().setBackground(Color.green);
        j.add(c);
        c.setOpaque(false);
        j.setVisible(true);

        j.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getX()) {
                    score++;
                }
            }
        });
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Color c = new Color(0, (int) (255 - Math.random()*20), 0);
        xPos = (int) (Math.random()*500);
        yPos = (int) (Math.random()*500);
        g.fillRect(xPos, yPos, 100, 100);
        g.setFont(new Font("Helvetica", Font.BOLD, 50));
        g.setColor(Color.black);
        g.drawString("Score: ", 0, 100);
        t.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

}




