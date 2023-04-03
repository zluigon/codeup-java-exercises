package shapes;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getPerimeter(){
        return 4 * side;
    }

    @Override
    public double getArea(){
        return Math.pow(side,2);
    }
}
