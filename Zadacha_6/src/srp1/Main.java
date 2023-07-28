package srp1;

import srp1.figure.Point;
import srp1.figure.Square;
import srp1.figure.SquareAreaCalculator;
import srp1.figure.SquarePainter;

public class Main {
    public static void main(String[] args) {
        SquarePainter squarePainter = new SquarePainter();
        SquareAreaCalculator squareAreaCalculator = new SquareAreaCalculator();
        Square square = new Square(new Point(1,1), 5);
        System.out.printf("Square area: %d \n",squareAreaCalculator.getArea(square) );
        squarePainter.draw(square);
    }
}
