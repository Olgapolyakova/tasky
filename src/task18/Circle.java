package task18;

/**
 * Created by Владимир on 08.01.2017.
 */
public class Circle extends Shape {
    Color color;
    int r;

    @Override
    int square(int a, int b) {
        return 0;
    }

    @Override
    int square(int r) {
        return getR()*getR();
    }

    public Circle(Color color, int r) {
        this.color = color;
        this.r = r;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
