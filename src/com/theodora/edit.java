package com.theodora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class edit extends JFrame{
    private JPanel panel6;
    private JTextField textField1;
    private JButton editButton;


    public edit(){

        setPreferredSize(new Dimension(600,600));
        setContentPane(panel6);
        pack();
        setVisible(true);
        setTitle("Edit By Code");
        setLocationRelativeTo(null);

        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new choice1();
            }
        });
    }





}
