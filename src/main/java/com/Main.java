package com;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    static int mynumber = ThreadLocalRandom.current().nextInt(0, 100 + 1);
    static int tries = 0;
    static JLabel text = new JLabel("guess a number between 0 and 100");
    static JTextField textField = new JTextField();

    public static void main(String[] args) {
        openUI();
        //newround();
    }

    public static void openUI() {
        JFrame frame = new JFrame("guess the number");
        frame.setSize(400, 300);
        frame.setLocation(100, 150);
        frame.setDefaultLookAndFeelDecorated(true);


        text.setBounds(50, 50, 200, 30);


        textField.setBounds(50, 100, 200, 30);


        JButton button = new JButton("guess");
        button.setBounds(50, 150, 200, 30);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textFromTextfield = textField.getText();
                int number = Integer.parseInt(textFromTextfield);
                guess(number);
            }
        });

        frame.add(text);
        frame.add(textField);
        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.add(text);
        frame.setVisible(true);

    }

    public static void newround() {
        tries++;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please guess a number :");
        int number = scanner.nextInt();
        guess(number);
    }

    public static void guess(int number) {

        if (number == mynumber) {
            System.out.println("you guess the right number");
            System.out.println(" it took you " + tries + " tries ");
        } else {
            System.out.println("unfortunately this number is wrong please try again");

            if (number < mynumber) {
                System.out.println("you are to low");
            } else {
                System.out.println("you are to high");
            }
            textField.setText("");
            newround();
        }
    }
}
