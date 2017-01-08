package task18;

/**
 * Created by Владимир on 08.01.2017.
 */
public class Square extends Shape {
    Color color;
    int a;

    public Square(Color color, int a) {
        this.color = color;
        this.a = a;
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

    @Override
    int square(int a, int b) {
        return 0;
    }

    @Override
    int square(int a) {
        return getA()*getA();
    }
}
