import java.util.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calci
{
    public static void main(String[] args)
    {
        JFrame f1 = new JFrame("Calculator");
        f1.setLayout(null);
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setVisible(true);

        JLabel l1 = new JLabel("First number: ");
        l1.setBounds(10,20,120,30);
        f1.add(l1);

        JLabel l2 = new JLabel("Second number:");
        l2.setBounds(10,60,120,30);
        f1.add(l2);

        JTextField tf1 = new JTextField();
        tf1.setBounds(130,20,120,30);
        f1.add(tf1);

        JTextField tf2 = new JTextField();
        tf2.setBounds(130,60,120,30);
        f1.add(tf2);

        JTextField tf3 = new JTextField();
        tf3.setBounds(130,180,120,30);
        f1.add(tf3);

        JButton b1 = new JButton("+");
        b1.setBounds(10,120,45,40);
        f1.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int a1 = Integer.parseInt(tf1.getText());
                int b1 = Integer.parseInt(tf2.getText());
                int c1 = a1 + b1;
                tf3.setText(String.valueOf(c1));
            }
        });

        JButton b2 = new JButton("-");
        b2.setBounds(80,120,45,40);
        f1.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int a2 = Integer.parseInt(tf1.getText());
                int b2 = Integer.parseInt(tf2.getText());
                int c2 = a2 - b2;
                tf3.setText(String.valueOf(c2));
            }
        });

        JButton b3 = new JButton("*");
        b3.setBounds(150,120,45,40);
        f1.add(b3);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int a3 = Integer.parseInt(tf1.getText());
                int b3 = Integer.parseInt(tf2.getText());
                int c3 = a3 * b3;
                tf3.setText(String.valueOf(c3));
            }
        });

        JButton b4 = new JButton("/");
        b4.setBounds(220,120,45,40);
        f1.add(b4);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {

                int a4 = Integer.parseInt(tf1.getText());
                int b4= Integer.parseInt(tf2.getText());
                if(b4==0)
                {
                    tf3.setText("Undefined");
                }
                else {
                    int c4 = a4 / b4;
                    tf3.setText(String.valueOf(c4));
                }
            }
        });

        JLabel Result = new JLabel("Result:");
        Result.setBounds(10,180,120,30);
        f1.add(Result);

        JButton b6 = new JButton("Clear");
        b6.setBounds(10,220,80,30);
        f1.add(b6);
        b6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
            }
        });

    }
}
