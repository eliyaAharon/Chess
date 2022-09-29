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
setBord();
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
                    if(j != 7)flag = true;
                } else {
                    Squares[i][j].setBackground(new Color(100, 50, 10));
                    if(j != 7)flag = false;
                }
            }
        }


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(tools[i][j]!=null)
                  Squares[i][j].setIcon(new ImageIcon(tools[i][j].type));
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(e.getSource() == Squares[i][j]){
                    System.out.println(i + " " + j);
                }
            }
        }
    }

    public void setBord() {

        tools[0][0] = new Castle(0, 0, Color.BLACK);
        tools[0][1] = new Horse(1, 0, Color.BLACK);
        tools[0][2] = new Bishop(2, 0, Color.BLACK);
        tools[0][3] = new Queen(3, 0, Color.BLACK);
        tools[0][4] = new King(4, 0, Color.BLACK);
        tools[0][5] = new Bishop(5, 0, Color.BLACK);
        tools[0][6] = new Horse(6, 0, Color.BLACK);
        tools[0][7] = new Castle(7, 0, Color.BLACK);

        for (int i = 0; i < 8; i++) {
            tools[1][i] = new Pown(i, 1, Color.BLACK);
        }

        tools[7][0] = new Castle(0, 7, Color.WHITE);
        tools[7][1] = new Horse(1, 7, Color.WHITE);
        tools[7][2] = new Bishop(2, 7, Color.WHITE);
        tools[7][3] = new Queen(3, 7, Color.WHITE);
        tools[7][4] = new King(4, 7, Color.WHITE);
        tools[7][5] = new Bishop(5, 7, Color.WHITE);
        tools[7][6] = new Horse(6, 7, Color.WHITE);
        tools[7][7] = new Castle(7, 7, Color.WHITE);

        for (int i = 0; i < 8; i++) {
            tools[6][i] = new Pown(i, 6, Color.WHITE);
        }
    }
}
