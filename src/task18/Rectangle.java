package task18;

/**
 * Created by Владимир on 08.01.2017.
 */
public class Rectangle extends Shape {
    Color color;
    int a, b;

    public Rectangle(Color color, int a, int b) {
        this.color = color;
        this.a = a;
        this.b = b;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    int square(int a, int b) {
        return getA()*getB();
    }

    @Override
    int square(int b) {
        return 0;
    }
}
