import java.awt.*;


public class Castle extends Tool {

    public Castle(int inxX, int inxY, Color color) {
        super(inxX, inxY, color);
    }

    public boolean ableToMove(int toX , int toY) {
        if (!(toX == this.inxX && toY != this.inxY) || (toY == this.inxY && toX != this.inxX))
            return false;
        for (int x = this.inxX; x < toX ; x++)
        {
        }

        for (int y = this.inxY; y < toY; y++)
        {
        }
        return true;
    }
    public void Move(int toX,int toY)
    {

    }


}
