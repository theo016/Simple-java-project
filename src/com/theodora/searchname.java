package com.theodora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class searchname extends JFrame{
    private JPanel panel4;
    private JTextField searchName;
    private JButton searchButton;


    public searchname(){
        setPreferredSize(new Dimension(600,600));
        setContentPane(panel4);
        pack();
        setVisible(true);
        setTitle("Search By Name");
        setLocationRelativeTo(null);
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enteredName=searchName.getText();

            }
        });
    }
}
