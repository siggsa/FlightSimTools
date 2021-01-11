package com.company;

import javax.swing.*;
import java.awt.*;

public class GUI {

    public static void main(String[] args){
        //Create frame
        JFrame frame = new JFrame("Flight Simulator Tools");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(720,720);

        //Create menu
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("Initialization");
        JMenu m2 = new JMenu("Calculator");
        JMenu m3 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Plane name");
        JTextField tf = new JTextField(10);
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        panel.add(label);
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        //JButton button1 = new JButton("");
        //JButton button2 = new JButton("Push");
        //frame.getContentPane().add(button1); // Adds Button to content pane of frame
        //frame.getContentPane().add(button2);

        //Adding components to frame
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setVisible(true);
    }
}
