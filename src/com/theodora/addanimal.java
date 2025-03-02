package com.theodora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class addanimal extends JFrame {
    private JPanel panel3;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton addButton;
    private JTextField textField6;
    private JTextField textField7;
    static int h=0;

    public addanimal() {
        setPreferredSize(new Dimension(600, 600));
        setContentPane(panel3);
        pack();
        setVisible(true);
        setTitle("Add An Animal");
        setLocationRelativeTo(null);




        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String textField1Val = textField1.getText();
                String textField2Val = textField2.getText();
                String textField3Val = textField3.getText();
                String textField4Val = textField4.getText();
                String textField5Val = textField5.getText();
                String textField6Val= textField6.getText();
                String textField7Val=textField7.getText();

                try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("textFieldOutput.txt", true)))) {
                    writer.println("Code:");
                    writer.println(textField1Val);
                    writer.println("Name:");
                    writer.println(textField2Val);
                    writer.println("Homotaxy:");
                    writer.println(textField3Val);
                    writer.println("Weight:");
                    writer.println(textField4Val);
                    writer.println("Length:");
                    writer.println(textField5Val);
                    writer.println("Life Expectancy:");
                    writer.println(textField6Val);
                    writer.println("Origin:");
                    writer.println(textField7Val);
                    writer.println("");
                    writer.close();




                    new animaladded();

                } catch (IOException ioException) {

                }


            }
        });

    }







    }










