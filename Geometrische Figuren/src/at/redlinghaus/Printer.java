package at.redlinghaus;

public class Printer {
    public static void draw(Point p) {
        System.out.println("____________________________________________________________");
        for (int i = 0; i <= p.getY(); i++){
            for (int j = 0; j <= p.getX(); j++) {
                if (j == p.getX() && i == p.getY()) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("____________________________________________________________");
    }

    public static void draw(Rectangle rect) {
        int minY = Math.min(rect.p1.getY(), rect.p3.getY());
        int maxY = Math.max(rect.p1.getY(), rect.p3.getY());
        int minX = Math.min(rect.p1.getX(), rect.p3.getX());
        int maxX = Math.max(rect.p1.getX(), rect.p3.getX());
        System.out.println("____________________________________________________________");
        for (int i = 0; i <= maxY; i++){
            for (int j = 0; j <= maxX; j++) {
                if (j >= minX && i >= minY && j <= maxX && i <= maxY) {
                    System.out.print(" # ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println("____________________________________________________________");
    }
}
