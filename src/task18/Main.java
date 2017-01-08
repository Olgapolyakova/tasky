package task18;

/**
 * Created by Владимир on 08.01.2017.
 */
public class Main  implements Colorable{
    public static void main(String[] args) {
        Circle circle = new Circle(Color.RED, 5);
        Rectangle rectangle = new Rectangle(Color.GREEN, 3, 8);
        Square square = new Square(Color.BLUE, 6);

        System.out.println(circle.getColor() + " площадь " + circle.square(5));
        System.out.println(rectangle.getColor() + " площадь " + rectangle.square(3,8));
        System.out.println(square.getColor()+ " площадь " + square.square(6));

    }
    @Override
    public void getColor(Color color) {
        getColor(color);
    }

}
