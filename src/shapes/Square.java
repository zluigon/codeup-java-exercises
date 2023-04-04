package shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }
//
//    public Square(double side) {
//        super(side, side);
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 4 * length;
//    }
//
//    @Override
//    public double getArea() {
//        return Math.pow(length, 2);
//    }
}
