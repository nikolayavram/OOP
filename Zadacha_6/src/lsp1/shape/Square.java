package lsp1.shape;

public class Square extends Quadraliteral {
    private int side;
    public Square(int side) {
        this.side = side;
    }


    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (int) Math.pow(side,2);
    }
}
