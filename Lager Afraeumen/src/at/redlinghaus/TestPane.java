package at.redlinghaus;

import javax.swing.*;
import java.awt.*;

public class TestPane extends JPanel {
    private Field[][] matrix;

    public TestPane(Field[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 200);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        int size = Math.min(getWidth() - 4, getHeight() - 4) / 10;

        int y = (getHeight() - (size * 10)) / 2;
        for (int horz = 0; horz < 10; horz++) {
            int x = (getWidth() - (size * 10)) / 2;
            for (int vert = 0; vert < 10; vert++) {
                g.drawRect(x, y, size, size);
                if (matrix[horz][vert].getTrolleyOnField() != null) {
                    g.drawString("T", x + size / 2, y + size / 2);
                } else if (matrix[horz][vert].getProductsOnField().size() != 0) {
                    g.drawString("P", x + size / 2, y + size / 2);
                }
                x += size;
            }
            y += size;
        }
        g2d.dispose();
    }
}
