package com.company;

import java.awt.*;

public class King extends Tool{
    private Horse horse;
    public King(int inxX, int inxY, Color color) {
        super(inxX, inxY, color);
        horse = new Horse(inxX,inxY,color);
        if(color==Color.BLACK){
            this.type = "Icons\\Black_King.png";
        }else{
            this.type = "Icons\\White_King.png";
        }
    }
    public boolean Check(int x, int y){
        if (horse.ableToMove(x,y)){
            return true;
        }
        return false;
    }
    public boolean ableToMove(int x, int y){
        if (Math.abs(this.inxX-x)==1||Math.abs(this.inxY-y)==1||Math.abs(this.inxX)==0^Math.abs(this.inxY)==0){
            return true;

        }
        return false;
    }
    public void move(int toX,int toY)
    {
        this.inxY = toX;
        this.inxX = toX;
    }
}
