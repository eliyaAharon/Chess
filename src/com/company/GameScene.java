package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameScene extends JPanel implements ActionListener{

    JButton[][] Squares = new JButton[8][8];
    public static Tool[][] tools = new Tool[8][8];


    boolean flag;

    GameScene(int height, int width) {

        this.setBounds(0, 0, width, height);
        this.setLayout(new GridLayout(8, 8));

        flag = false;

        //this.setBackground(Color.BLACK);

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Squares[i][j] = new JButton();
                Squares[i][j].addActionListener(this);
                Squares[i][j].setFocusable(false);
                Squares[i][j].setVisible(true);
                this.add(Squares[i][j]);
                if (!flag) {
                    Squares[i][j].setBackground(new Color(200, 100, 10));
                    flag = true;
                } else {
                    Squares[i][j].setBackground(new Color(100, 50, 10));
                    flag = false;
                }
            }
        }


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(e.getSource() == Squares[i][j]){
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
