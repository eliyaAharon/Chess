package com.company;

import java.awt.*;


public class Castle extends Tool {

    public Castle(int inxX, int inxY, Color color) {
        super(inxX, inxY, color);
        this.type = "Castle";
    }

    public boolean ableToMove(int toX , int toY) {
        Tool[][]tools = GameScene.tools;

        if (!(toX == this.inxX && toY != this.inxY) || (toY == this.inxY && toX != this.inxX))
            return false;
        for (int x = this.inxX; x < toX ; x++)
        {
            if(tools[x][this.inxY]!= null)
                return false;
        }

        for (int y = this.inxY; y < toY; y++)
        {
            if(tools[this.inxX][y]!= null)
                return false;
        }
        return true;
    }
    public void Move(int toX,int toY)
    {
        this.inxY = toX;
        this.inxX = toX;
    }


}
