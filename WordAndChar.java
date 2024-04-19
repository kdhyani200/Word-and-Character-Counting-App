package com.company;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
public class WordAndChar {
  public static void main(String args[]) {
    JFrame f = new JFrame("Words And Character Count");
    JLabel l1 = new JLabel("Enter the text Below");
    JLabel l2 = new JLabel("Words Count : ");
    JLabel l3 = new JLabel("Character Count(Including Spaces) : ");
    JLabel l4 = new JLabel("Character Count(Excluding Spaces) : ");
    JButton b1 = new JButton("Count");
    JButton b2 = new JButton("Clear");
    JTextArea t1 = new JTextArea();
    l1.setBounds(10, 15, 150, 15);
    l2.setBounds(10, 290, 100, 15);
    l3.setBounds(10, 315, 250, 15);
    l4.setBounds(10, 340, 250, 15);
    t1.setBounds(10, 35, 300, 250);
    b1.setBounds(10, 365, 80, 30);
    b2.setBounds(100, 365, 80, 30);
    Border blackline = BorderFactory.createLineBorder(Color.black);
    t1.setBorder(blackline);;
    t1.setLineWrap(true);
    t1.setWrapStyleWord(true);

    b1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String str = t1.getText().strip();
        int count = 0, i, word = 0;
        l3.setText("Character Count(Including Spaces) : " + str.length());
        for (i = 0; i < str.length(); i++) {
          if (str.charAt(i) != ' ') {
            count++;
          } else {
            word++;
          }
        }
        l2.setText("Words Count : " + (word + 1));
        l4.setText("Character Count(Excluding Spaces) : " + (count));
      }
    });

    b2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        t1.setText("");
        l3.setText("Character Count(Including Spaces) : ");
        l4.setText("Character Count(Excluding Spaces) : ");
        l2.setText("Words Count : ");
      }
    });

    f.add(l1);
    f.add(l2);
    f.add(l3);
    f.add(l4);
    f.add(t1);
    f.add(b1);
    f.add(b2);
    f.setSize(430, 450);
    f.setLayout(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}