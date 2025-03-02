package com.theodora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class delete extends JFrame{
    private JPanel panel7;
    private JTextField textField1;
    private JButton deleteButton;


    public delete() {
        setPreferredSize(new Dimension(600,600));
        setContentPane(panel7);
        pack();
        setVisible(true);
        setTitle("Delete");
        setLocationRelativeTo(null);


        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new permanentdel();
            }
        });
    }


}
