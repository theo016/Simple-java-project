package com.theodora;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class available extends JFrame{
    private JPanel panel2;
    private JTextArea getinfo;



    public available() {
        setPreferredSize(new Dimension(600, 600));
        setContentPane(panel2);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);




        FileReader reader = null;
        try {
            reader = new FileReader("textFieldOutput.txt"); //Διαβάζω το αρχείο και
        } catch (FileNotFoundException fileNotFoundException) {
        }

        BufferedReader br = new BufferedReader(reader);
        {try {
            getinfo.read(br, null);//εμφανίζω το περιεχόμενο στο παράθυρο

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        try {
            br.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        getinfo.requestFocus(); //για να φαίνεται το παράθυρο
        }



        }

    }



