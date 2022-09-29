package com.company;

import java.awt.*;

public class Game {
    GameScene bord = new GameScene(100, 100);
    Tool[][] tools = bord.tools;

    public Game() {

        tools[0][0] = new Castle(0, 0, Color.BLACK);
        tools[1][0] = new Horse(1, 0, Color.BLACK);
        tools[2][0] = new Bishop(2, 0, Color.BLACK);
        tools[3][0] = new Queen(3, 0, Color.BLACK);
        tools[4][0] = new King(4, 0, Color.BLACK);
        tools[5][0] = new Bishop(5, 0, Color.BLACK);
        tools[6][0] = new Horse(6, 0, Color.BLACK);
        tools[7][0] = new Castle(7, 0, Color.BLACK);

        for (int i = 0; i < 8; i++) {
            tools[i][1] = new Pown(i, 1, Color.BLACK);
        }

        tools[0][7] = new Castle(0, 7, Color.WHITE);
        tools[1][7] = new Horse(1, 7, Color.WHITE);
        tools[2][7] = new Bishop(2, 7, Color.WHITE);
        tools[3][7] = new Queen(3, 7, Color.WHITE);
        tools[4][7] = new King(4, 7, Color.WHITE);
        tools[5][7] = new Bishop(5, 7, Color.WHITE);
        tools[6][7] = new Horse(6, 7, Color.WHITE);
        tools[7][7] = new Castle(7, 7, Color.WHITE);

        for (int i = 0; i < 8; i++) {
            tools[i][1] = new Pown(i, 7, Color.WHITE);
        }
    }
}
