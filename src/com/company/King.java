package com.company;

import java.awt.*;

public class King extends Tool{
    private Horse horse;
    public King(int inxX, int inxY, Color color) {
        super(inxX, inxY, color);
        horse = new Horse(inxX,inxY,color);
    }
    public boolean Check(int x, int y){
        if (horse.ableToMove(x,y)){
            return true;
        }
        return false;
    }
}
