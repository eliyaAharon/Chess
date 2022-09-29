import java.awt.*;

public class Horse extends Tool{

    public Horse(int inxX, int inxY, Color color) {
        super(inxX, inxY, color);
    }
    public boolean ableToMove(int x,int y)
    {
        if (this.inxX-x != 0)
            return((Math.abs(this.inxX-x) < 3 && Math.abs(this.inxY-y) < 3)&&(Math.abs((this.inxY-y)/(this.inxX-x)) == 2 || Math.abs((this.inxY-y)/(this.inxX-x)) == 0.5));
        else
            return false;
    }
    public void Move(int x,int y)
    {
        this.inxX = x;
        this.inxY = y;
    }
}
