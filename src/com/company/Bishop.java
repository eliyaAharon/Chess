package com.company;

import com.company.GameScene;
import com.company.Tool;

import javax.swing.*;
import java.awt.*;

public class Bishop extends Tool{

    public Bishop(int inxX, int inxY, Color color) {
        super(inxX, inxY, color);
        if(color==Color.BLACK){
            this.type = "Icons\\Black_Bishop.png";
        }else{
            this.type = "Icons\\White_Bishop.png";
        }
    }
    public boolean ableToMove(int x, int y)
    {
        int i;
        Tool[][]tools = GameScene.tools;
        if(y-this.inxY == 0)
            return false;
        else
        if((x-this.inxX)/(y-this.inxY) == 1.0)
           for(i=1; i<(Math.abs(x-this.inxX));i++)
              if(tools[Math.min(x,this.inxX)+i][Math.max(this.inxY,y)-i]!=null)
                  return false;
        else {
            if((x-this.inxX)/(y-this.inxY) == -1.0)
                for(i=1; i<(Math.abs(x-this.inxX));i++)
                    if(tools[Math.min(x,this.inxX)+i][Math.min(this.inxY,y)+i]!=null)
                        return false;
            else
                return false;
        }
        return  true;
    }
}
