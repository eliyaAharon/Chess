package com.company;

import com.company.GameScene;
import com.company.Tool;

import javax.swing.*;
import java.awt.*;

public class Bishop extends Tool{

    public Bishop(int inxX, int inxY, Color color) {
        super(inxX, inxY, color);
        this.type= "Bishop";
    }
    public boolean AvailableToMove (int x, int y)
    {
        double shipua;
        Tool[][]tools = GameScene.tools;

        shipua = (x-this.inxX)/(y-this.inxY);
        if(shipua==1.0)
        {
           for(int i=1; i<(Math.abs(x-this.inxX));i++)
           {
              if(tools[Math.min(x,this.inxX)+i][Math.min(this.inxY,y)-i]!=null)
              {
                  return false;
              }
           }
        }
        else {
            if(shipua == -1.0)
            {
                for(int i=1; i<(Math.abs(x-this.inxX));i++)
                {
                    if(tools[Math.min(x,this.inxX)+i][Math.max(this.inxY,y)+i]!=null)
                    {
                        return false;
                    }
                }

            }
            else
                return false;
        }
        return  true;
    }
    public void Move(int toX,int toY)
    {
        this.inxY = toX;
        this.inxX = toX;
    }
}
