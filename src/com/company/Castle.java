package com.company;

import java.awt.*;


public class Castle extends Tool {

    public Castle(int inxX, int inxY, Color color ) {
        super(inxX, inxY, color);
        if(color==Color.BLACK){
            this.type = "Icons\\Black_Castle.png";
        }else{
            this.type = "Icons\\White_Castle.png";
        }

    }

    public boolean ableToMove(int X , int Y) {
        Tool[][]tools = GameScene.tools;

        if (!(X == this.inxX && Y != this.inxY) || (Y == this.inxY && X != this.inxX))
            return false;
        for (int x = Math.min(this.inxX, X)+1; x <Math.max(this.inxX, X) ; x++)
        {
            if(tools[x][this.inxY]!= null)
                return false;
        }

        for (int y = Math.min(this.inxY,Y)+1; y < Math.max(this.inxY,Y); y++)
        {
            if(tools[this.inxX][y]!= null)
                return false;
        }
        return true;
    }


}
