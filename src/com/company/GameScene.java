package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GameScene extends JPanel {

    public static JButton[][] Squares = new JButton[8][8];

    public static Tool[][] tools = new Tool[8][8];

    boolean flag;

    GameScene(int height , int width){
        this.setBounds(0,0,width , height);
        this.setLayout(new GridLayout(8,8));
        flag = false;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Squares[i][i] = new JButton();
                Squares[i][i].addActionListener((ActionListener) this);
                Squares[i][i].setFocusable(false);
                if(!flag){
                    Squares[i][i].setBackground(new Color(200,100,10));
                    flag = true;
                }else {
                    Squares[i][i].setBackground(new Color(100, 50, 10));
                    flag = false;
                }
            }
        }


    }
}
