package at.redlinghaus;

public class Printer {

    public static void draw(Rectangle rect) {
        Printer.printCoords(rect.getMaxX());

        int k = 0;
        for (int i = 0; i <= rect.getMaxY(); i++) {
            System.out.printf("  %2d|", k++);
            for (int j = 0; j <= rect.getMaxX(); j++) {
                if (j >= rect.getMinX() && i >= rect.getMinY() && j <= rect.getMaxX() && i <= rect.getMaxY()) {
                    int pIndex = rect.isPoint(j,i);
                    if (pIndex >= 0) {
                        System.out.printf("P%d ", pIndex + 1);
                    } else { System.out.print(" # "); }
                } else { System.out.print("   "); }
            } System.out.println();
        }
    }

    public static void printCoords(int maxX) {
        System.out.println();
        System.out.print("    |");
        for (int i = 0; i <= maxX; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.println();
        for (int i = -2; i <= maxX; i++) {
            System.out.print("---");
        }
        System.out.println();
    }
}
