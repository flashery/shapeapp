/**
 * Square shape class
 * @author flashery
 */
import java.awt.*;

public class Square extends Shape {

    protected int size;
    protected int area;

    public Square() {
        super();
    }

    public void setS(int value) {
        size = value;
    }

    public int getS() {
        return size;
    }

    public void computeArea() {
        area = size * size;
    }

    public int getArea() {
        return area;
    }

    public void setDefault() {
        this.setFillColor(Color.blue);
        this.setLineColor(Color.blue);
        this.setName("Square");
        this.setS(100);
        this.setX(50);
        this.setY(50);
    }
}
