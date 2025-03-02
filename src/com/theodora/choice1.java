package com.theodora;

import javax.swing.*;
import java.awt.*;

public class choice1 extends JFrame{
    private JPanel panelc;
    private JButton buttonc;
    private JComboBox comboBox1;


    public choice1(){
        setPreferredSize(new Dimension(600,600));
        setContentPane(panelc);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);

        System.out.println(comboBox1.getSelectedItem());

    }
}
