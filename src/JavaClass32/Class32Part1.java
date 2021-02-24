package JavaClass32;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import java.awt.*;

public class Class32Part1 extends JFrame {
    private JTextField amountField = new JTextField(12);
    private Document amountText = amountField.getDocument();
    private JTextArea report = new JTextArea(8, 40);

    public Class32Part1() {
        setSize(500, 500);
        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Amount:"));
        topPanel.add(amountField);

        getContentPane().add(topPanel, BorderLayout.NORTH);
        getContentPane().add(new JScrollPane(report));

        setBackground(Color.LIGHT_GRAY);
        setTitle("Changer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        amountText.addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                showResult();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                showResult();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                showResult();
            }

        });
    }

    public void showResult() {
        report.setText("Result will show here.");
    }

    public static void main(String[] args) {
        new Class32Part1();

    }
}