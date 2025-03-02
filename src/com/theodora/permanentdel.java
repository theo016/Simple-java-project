package com.theodora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class permanentdel extends JFrame{
    private JPanel panel8;
    private JButton GOBACKButton;
    private JButton YESButton;


    public permanentdel() {
        setPreferredSize(new Dimension(600,600));
        setContentPane(panel8);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        GOBACKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   setVisible(false);
                } //Κρύβει το παραθυράκι αν ο χρήστης επιλέξει 'GO BACK' ώστε να φαίνεται το προηγούμενο παράθυρο


            });
        }



}
