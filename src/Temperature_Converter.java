import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Temperature_Converter extends JFrame {

    JButton Celsius_TO_Fahrenheit_Btn, Fahrenheit_TO_Celsius_Btn;
    JLabel Celsius_Label;
    JTextField Celsius_Txt;
    JLabel Fahrenheit_Label;
    JTextField Fahrenheit_Txt;

    public Temperature_Converter() {
        super("Temperature Converter");
        JPanel mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 5, 5, 5));

        JPanel row1 = new JPanel();
        JPanel row2 = new JPanel();
        JPanel row3 = new JPanel();
        JPanel row4 = new JPanel();

        Celsius_Label = new JLabel("Celsius:");
        Celsius_Txt = new JTextField(35);

        Fahrenheit_Label = new JLabel("Fahrenheit:");
        Fahrenheit_Txt = new JTextField(35);

        Celsius_TO_Fahrenheit_Btn = new JButton("Convert C to F");
        Fahrenheit_TO_Celsius_Btn = new JButton("Convert F to C");

        Celsius_TO_Fahrenheit_Btn.setFont(new Font("San Serif", Font.BOLD, 25));
        Celsius_TO_Fahrenheit_Btn.setPreferredSize(new Dimension(355, 150));
        Celsius_TO_Fahrenheit_Btn.setBackground(new Color(223, 201, 138));

        Fahrenheit_TO_Celsius_Btn.setFont(new Font("San Serif", Font.BOLD, 25));
        Fahrenheit_TO_Celsius_Btn.setPreferredSize(new Dimension(355, 150));
        Fahrenheit_TO_Celsius_Btn.setBackground(new Color(200, 169, 81));

        Celsius_Label.setFont(new Font("San Serif", Font.BOLD, 25));
        Celsius_Label.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 60));

        Celsius_Txt.setMaximumSize(new Dimension(200, 50));
        Celsius_Txt.setFont(new Font("San Serif", Font.BOLD, 20));
        Celsius_Txt.setDisabledTextColor(Color.BLACK);
        Celsius_Txt.setMargin(new Insets(5, 5, 5, 5));
        Celsius_Txt.setBackground(new Color(178, 211, 194));

        Fahrenheit_Label.setFont(new Font("San Serif", Font.BOLD, 25));
        Fahrenheit_Label.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 20));

        Fahrenheit_Txt.setMaximumSize(new Dimension(300, 50));
        Fahrenheit_Txt.setFont(new Font("San Serif", Font.BOLD, 20));
        Fahrenheit_Txt.setDisabledTextColor(Color.BLACK);
        Fahrenheit_Txt.setMargin(new Insets(5, 5, 5, 5));
        Fahrenheit_Txt.setBackground(new Color(178, 211, 194));

        Celsius_TO_Fahrenheit_Btn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String cText = Celsius_Txt.getText();
                double c = Double.parseDouble(cText);
                double f = (c * 9 / 5) + 32;
                Fahrenheit_Txt.setText(String.valueOf(String.format("%.2f", f)));

            }

        });

        Fahrenheit_TO_Celsius_Btn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String fText = Fahrenheit_Txt.getText();
                double f = Double.parseDouble(fText);
                double c = (f - 32) * 5 / 9;
                Celsius_Txt.setText(String.valueOf(String.format("%.2f", c)));

            }

        });

        row1.setLayout(new BoxLayout(row1, BoxLayout.LINE_AXIS));
        row1.setBorder(BorderFactory.createEmptyBorder(15, 10, 20, 5));
        row1.setBackground(new Color(237, 232, 186));

        row2.setLayout(new BoxLayout(row2, BoxLayout.LINE_AXIS));
        row2.setBorder(BorderFactory.createEmptyBorder(5, 10, 20, 5));
        row2.setBackground(new Color(237, 232, 186));

        row3.setLayout(new BoxLayout(row3, BoxLayout.LINE_AXIS));
        row3.setBorder(BorderFactory.createEmptyBorder(20, 10, 0, 10));
        row3.setBackground(new Color(237, 232, 186));

        row4.setLayout(new BoxLayout(row4, BoxLayout.LINE_AXIS));
        row4.setBorder(BorderFactory.createEmptyBorder(0, 10, 20, 10));
        row4.setBackground(new Color(237, 232, 186));

        row1.add(Box.createHorizontalGlue());
        row1.add(Celsius_Label);
        row1.add(Celsius_Txt);

        row2.add(Box.createHorizontalGlue());
        row2.add(Fahrenheit_Label);
        row2.add(Fahrenheit_Txt);

        row3.add(Box.createHorizontalGlue());
        row3.add(Celsius_TO_Fahrenheit_Btn);

        row4.add(Box.createHorizontalGlue());
        row4.add(Fahrenheit_TO_Celsius_Btn);

        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        mainPanel.setBackground(new Color(237, 232, 186));
        mainPanel.add(Box.createRigidArea(new Dimension(5, 5)));
        mainPanel.add(row1);
        mainPanel.add(row2);
        mainPanel.add(row3);
        mainPanel.add(row4);

        this.add(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setBounds(550, 200, 300, 250);
        this.setVisible(true);
        this.setSize(400, 400);

    }

    public static void main(String[] args) {
        new Temperature_Converter();
    }
}
