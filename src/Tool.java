import java.awt.*;

public class Tool {
protected int inxX,inxY;

    public Tool(int inxX, int inxY, Color color) {
        this.inxX = inxX;
        this.inxY = inxY;
        this.color = color;
    }

    protected Color color;

    public int getInxX() {
        return inxX;
    }

    public void setInxX(int inxX) {
        this.inxX = inxX;
    }

    public int getInxY() {
        return inxY;
    }

    public void setInxY(int inxY) {
        this.inxY = inxY;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
