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
    public boolean ableToMove(int Tox, int Toy)
    {
        double shipua;
        Tool[][]tools = GameScene.tools;

        shipua = (Tox-this.inxX)/(Toy-this.inxY);
        if(shipua==1.0)
        {
           for(int i=1; i<(Math.abs(Tox-this.inxX));i++)
           {
              if(tools[Math.min(Tox,this.inxX)+i][Math.min(this.inxY,Toy)-i]!=null)
              {
                  return false;
              }
           }
        }
        else {
            if(shipua == -1.0)
            {
                for(int i=1; i<(Math.abs(Tox-this.inxX));i++)
                {
                    if(tools[Math.min(Tox,this.inxX)+i][Math.max(this.inxY,Toy)+i]!=null)
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

}
