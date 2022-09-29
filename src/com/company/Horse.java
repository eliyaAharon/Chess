package com.company;

import java.awt.*;

public class Horse extends Tool{

    public Horse(int inxX, int inxY, Color color) {
        super(inxX, inxY, color);
        if(color==Color.BLACK){
            this.type = "Icons\\Black_Horse.png";
        }else{
            this.type = "Icons\\White_Horse.png";
        }
    }
    public boolean ableToMove(int x,int y)
    {
        if (this.inxX-x != 0)
            return((Math.abs(this.inxX-x) < 3 && Math.abs(this.inxY-y) < 3)&&(Math.abs((this.inxY-y)/(this.inxX-x)) == 2 || Math.abs((this.inxY-y)/(this.inxX-x)) == 0.5));
        else
            return false;
    }

}
