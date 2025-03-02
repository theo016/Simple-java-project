package com.theodora;

import com.sun.source.tree.WhileLoopTree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class searchcode extends JFrame {


    private JPanel panel5;
    private JTextField codeSearch;
    private JButton searchButton;
    private JTextArea txtCode;

    public searchcode() {
        setPreferredSize(new Dimension(600, 600));
        setContentPane(panel5);
        pack();
        setVisible(true);
        setTitle("Search By Code");
        setLocationRelativeTo(null);


    }}


       /* String theCode = codeSearch.getText();      //Μια αποτυχημένη προσπάθεια για την αναζήτηση
        String lineNumber = "";
        String fileName = "textFieldOutput.txt";
        String stop = "Code:";
        String line = "";*/



       /* searchButton.addActionListener(new ActionListener() {
            @Override

           public void actionPerformed(ActionEvent e) {
                FileReader reader=null;
                try {
                  BufferedReader  br=new BufferedReader(reader=new FileReader(fileName));
                  try {
                      int k=0;
                      while(k==0) {
                          String[]words=line.split("");
                          for (String word:words){
                              if(word.equals(theCode)){
                                  k=1;
                                  while(word.equals("")==false ){

                                      try{
                                          try {
                                              txtCode.read(br,null);
                                          } catch (IOException ioException) {
                                              ioException.printStackTrace();
                                          }
                                          try {
                                              br.close();
                                          } catch (IOException ioException) {
                                              ioException.printStackTrace();
                                          }
                                          txtCode.requestFocus();
                                      } catch (Exception exception) {
                                          exception.printStackTrace();
                                      }
                                  }
                              }
                          }
                      }
                  } catch (Exception exception) {
                      exception.printStackTrace();
                  }


                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }

            }
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BufferedReader br = null;
                try {
                    br = new BufferedReader(new FileReader("file.txt"));
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
                try {
                    StringBuilder sb = new StringBuilder();
                    String line = null;
                    try {
                        line = br.readLine();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }

                    while (line != null) {
                        sb.append(line);
                        sb.append(System.lineSeparator());
                        try {
                            line = br.readLine();
                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                        }
                    }
                    String everything = sb.toString();
                } finally {
                    try {
                        br.close();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                }
                            }
                        });*/











