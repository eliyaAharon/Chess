package com.company;

import java.awt.*;

public class King extends Tool{
    Tool[][] tools = new Tool[8][8];
    public King(int inxX, int inxY, Color color) {
        super(inxX, inxY, color);
        this.type= "King";
    }
    public boolean Check(){
        return touchAble(this.inxX,this.inxY);
    }
    public boolean ableToMove(int x, int y){
        if(!touchAble(x,y))
            return((Math.abs(this.inxX-x)==1 && Math.abs(this.inxY-y)==1)||(Math.abs(this.inxX-x)==0 && Math.abs(this.inxY-y)==1)||(Math.abs(this.inxX-x)==1 && Math.abs(this.inxY-y)==0));
        else
            return false;
    }
    public boolean touchAble(int x,int y)
    {
        for (int i = 0; i < 8; i++)
            for (int j = 0;j < 8;j++)
                if(tools[i][j]!= null)
                    if(tools[i][j].ableToMove(x,y))
                        return false;
        return true;
    }
}
