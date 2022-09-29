package com.company;

import java.awt.*;

public class Queen extends Tool{
    private Bishop bishop;
    private Castle castle;
    public Queen(int inxX, int inxY, Color color) {
        super(inxX, inxY, color);
        if(color==Color.BLACK){
            this.type = "Icons\\Black_Queen.png";
        }else{
            this.type = "Icons\\White_Queen.png";
        }
        bishop = new Bishop(inxX,inxY,color);
        castle = new Castle(inxX,inxY,color);

    }
    public boolean ableToMove(int x , int y){
        return (bishop.ableToMove(x,y)|| castle.ableToMove(x,y));
    }
}
