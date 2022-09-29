package com.company;
import javax.swing.*;
import java.awt.*;

public class Pown extends Tool{

    Tool[][] tools = new Tool[8][8];

    public Pown(int inxX, int inxY, Color color) {
        super(inxX, inxY, color);
        this.type = "Pown";
    }
    public boolean ableToMove(int x,int y)
    {
        if(color.getRGB() == 0)//שחור
        {
            if(y-1 == this.inxY && x == this.inxX && tools[x][y]== null)
                return true;
            else
                if(y == 1 && y-2 == this.inxY && x == this.inxX && tools[x][y]== null)
                    return true;
                else
                    if(y-1 == this.inxY)
                        if((x+1 == this.inxX && tools[x][y]!= null) || (x-1 == this.inxX && tools[x][y]!= null))
                            return true;
        }
        else {//לבן
            if(y+1 == this.inxY && x == this.inxX && tools[x][y]== null)
                return true;
            else
            if(y == 6 && y+2 == this.inxY && x == this.inxX && tools[x][y]== null)
                return true;
            else
            if(y+1 == this.inxY)
                if((x+1 == this.inxX && tools[x][y]!= null) || (x-1 == this.inxX && tools[x][y]!= null))
                    return true;
        }
        return false;
    }

}
