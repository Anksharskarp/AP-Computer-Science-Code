import java.awt.*;       
import java.awt.event.*; 
import javax.swing.*; 
//Find all numbers between 1-10,000 with the following feature: 
//the sum of the cubes of its digits is equal to the number itself.

public class Class15Part1 extends JFrame {
	
	
    /**
     *
     */
    private static final long serialVersionUID = 7190266490764570542L;
    private int count1 = 0, count2 = 0, count3 = 0;
    private JTextField field1, field2, field3;
    private JButton button1;
   
    public Class15Part1() {
	    Container c1 = getContentPane();
	    c1.setLayout(new FlowLayout());
        c1.add(new JLabel("Fahrenheit"));
        field1 = new JTextField(10);
        c1.add(field1);
        //field2 = new JTextField(10);
        //c1.add(field2);
        c1.add(new JLabel("Celsius"));

        field3 = new JTextField(10);
        c1.add(field3);
        button1 = new JButton("Convert");
        c1.add(button1); 
        button1.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
	    count1++; 
		count2 += 2;
        count3 +=3;
        String f = field1.getText();

		field1.setText(count1+"");
		field2.setText(count2+"");
		field3.setText(count3+"");
	}

    	 
     });
     setSize(600, 600);
     setVisible(true);

   }
   	
   public static void main(String[] args) {
 
	   new Class15Part1();
   }
}