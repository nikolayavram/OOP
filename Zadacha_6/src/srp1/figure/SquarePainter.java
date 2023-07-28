package srp1.figure;

public class SquarePainter {
    public void draw(Square square) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < square.getSide(); i++) {
            builder.append("* ");
        }
        System.out.println(builder);
        for (int i = 0; i < square.getSide(); i++) {
            if (i < square.getSide() - 2) {
                System.out.print("*");
            } else {
                continue;
            }

            for (int j = 1; j < square.getSide() - 1; j++) {
                System.out.print(" *");
            }
            System.out.println(" *");
        }

        System.out.println(builder);
    }
}
