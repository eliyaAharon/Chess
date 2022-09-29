package com.company;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public static void main(String[] args) {

        Main window = new Main();
    }

    public Main() {
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Chess");
        this.setSize(800, 800);
        this.setLocationRelativeTo(null);
        this.setBackground(Color.BLACK);
        this.setVisible(true);

        GameScene gameScene = new GameScene(800, 800);
        this.add(gameScene) ;


    }
}
