package com.theodora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class page1 extends JFrame {
    private JPanel panel1;
    private JButton availableAnimalsButton;
    private JButton addAnAnimalButton;
    private JButton searchAnimalByNameButton;
    private JButton searchAnimalByCodeButton;
    private JButton editAnimalByCodeButton;
    private JButton deleteAnimalByCodeButton;
    private JButton EXITButton;


    public page1() {
        setPreferredSize(new Dimension(600,600));
        setContentPane(panel1);
        setTitle("WELCOME");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);


        availableAnimalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new available();
            }
        });
        EXITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        addAnAnimalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new addanimal();
            }
        });
        searchAnimalByNameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new searchname();
            }
        });
        searchAnimalByCodeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new searchcode();
            }
        });

        deleteAnimalByCodeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new delete();
            }
        });
        editAnimalByCodeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new edit();
            }
        });
    }


}
