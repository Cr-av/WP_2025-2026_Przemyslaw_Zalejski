package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame
{
    public App() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        private String operator = ""; //brak wyboru operatora
        private int value_01;
        private int value_02;


        JPanel panelButton = new JPanel(new GridLayout(5, 4)); // panel z 4 kolumnami i 5 wierszami
        JTextField textFieldSreen = new JTextField("0",10);

        JButton button_09 = new JButton("9");
        button_09.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = textFieldSreen.getText();
                textFieldSreen.setText(value + "9");
            }
        });
        panelButton.add(button_09);

        JButton button_08 = new JButton("8");
        button_08.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = textFieldSreen.getText();
                textFieldSreen.setText(value + "8");
            }
        });
        panelButton.add(button_08);

        JButton button_07 = new JButton("7");

        button_07.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = textFieldSreen.getText();
                textFieldSreen.setText(value + "7");
            }
        });
        panelButton.add(button_07);

        JButton button_06 = new JButton("6");
        button_06.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = textFieldSreen.getText();
                textFieldSreen.setText(value + "6");
            }
        });
        panelButton.add(button_06);

        JButton button_05 = new JButton("5");
        button_05.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = textFieldSreen.getText();
                textFieldSreen.setText(value + "5");
            }
        });
        panelButton.add(button_05);


        JButton button_04 = new JButton("4");
        button_04.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = textFieldSreen.getText();
                textFieldSreen.setText(value + "4");
            }
        });
        panelButton.add(button_04);

        JButton button_03 = new JButton("3");
        button_04.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = textFieldSreen.getText();
                textFieldSreen.setText(value + "3");
            }
        });
        panelButton.add(button_03);

        JButton button_02 = new JButton("2");
        button_04.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = textFieldSreen.getText();
                textFieldSreen.setText(value + "2");
            }
        });
        panelButton.add(button_02);

        JButton button_01 = new JButton("1");
        button_04.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = textFieldSreen.getText();
                textFieldSreen.setText(value + "1");
            }
        });
        panelButton.add(button_01);

        JButton button_00 = new JButton("0");
        button_00.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = textFieldSreen.getText();
                textFieldSreen.setText(value + "0");
            }
        });
        panelButton.add(button_00);

        JButton buttonplus = new JButton("+");
        buttonplus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = "+";

            }
        });
        panelButton.add(buttonplus);

        JButton buttonminus = new JButton("-");
        buttonminus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = textFieldSreen.getText();
                textFieldSreen.setText(value + "-");
            }
        });
        panelButton.add(buttonminus);


        setLayout(new BorderLayout());

        add(textFieldSreen, BorderLayout.NORTH);
        add(panelButton, BorderLayout.CENTER);
        pack();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new App().setVisible(true);
            }
        });
    }
}

