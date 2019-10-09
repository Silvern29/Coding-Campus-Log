package at.redlinghaus;

public class Printer {
    public void draw(Point p) {
        for (int i = 0; i <= p.getY(); i++){
            for (int j = 0; i <= p.getX(); j++) {
                if (i == p.getX() && j == p.getY()) {
                    System.out.print("#");
                }
            }
            System.out.print(" ");
        }
    }
}
