package at.redlinghaus;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class TestPane extends JPanel {
    private Field[][] matrix;
    static String imageFileName = "examples/duke_skateboard.jpg";
    private URL imageSrc;
    private BufferedImage b1, b2, b3, b4, b5, t, t1, t2, t3, t4, t5;
    public TestPane(Field[][] matrix) throws IOException {
        this.matrix = matrix;
        b1 = ImageIO.read(new File("C:\\Users\\flori\\Documents\\GitHub\\Coding-Campus-Log\\Lager Afraeumen\\src\\at\\redlinghaus\\box1.jpg"));
        b2 = ImageIO.read(new File("C:\\Users\\flori\\Documents\\GitHub\\Coding-Campus-Log\\Lager Afraeumen\\src\\at\\redlinghaus\\box2.jpg"));
        b3 = ImageIO.read(new File("C:\\Users\\flori\\Documents\\GitHub\\Coding-Campus-Log\\Lager Afraeumen\\src\\at\\redlinghaus\\box3.jpg"));
        b4 = ImageIO.read(new File("C:\\Users\\flori\\Documents\\GitHub\\Coding-Campus-Log\\Lager Afraeumen\\src\\at\\redlinghaus\\box4.jpg"));
        b5 = ImageIO.read(new File("C:\\Users\\flori\\Documents\\GitHub\\Coding-Campus-Log\\Lager Afraeumen\\src\\at\\redlinghaus\\box5.jpg"));
        t = ImageIO.read(new File("C:\\Users\\flori\\Documents\\GitHub\\Coding-Campus-Log\\Lager Afraeumen\\src\\at\\redlinghaus\\trolley.jpg"));
        t1 = ImageIO.read(new File("C:\\Users\\flori\\Documents\\GitHub\\Coding-Campus-Log\\Lager Afraeumen\\src\\at\\redlinghaus\\trolley1.jpg"));
        t2 = ImageIO.read(new File("C:\\Users\\flori\\Documents\\GitHub\\Coding-Campus-Log\\Lager Afraeumen\\src\\at\\redlinghaus\\trolley2.jpg"));
        t3 = ImageIO.read(new File("C:\\Users\\flori\\Documents\\GitHub\\Coding-Campus-Log\\Lager Afraeumen\\src\\at\\redlinghaus\\trolley3.jpg"));
        t4 = ImageIO.read(new File("C:\\Users\\flori\\Documents\\GitHub\\Coding-Campus-Log\\Lager Afraeumen\\src\\at\\redlinghaus\\trolley4.jpg"));
        t5 = ImageIO.read(new File("C:\\Users\\flori\\Documents\\GitHub\\Coding-Campus-Log\\Lager Afraeumen\\src\\at\\redlinghaus\\trolley5.jpg"));
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
                    switch (matrix[horz][vert].getTrolleyOnField().getWeight()) {
                        case 0: g.drawImage(t, x /*+ size / 2*/, y /*+ size / 2*/, size,size, this);
                        break;
                        case 1: g.drawImage(t1, x /*+ size / 2*/, y /*+ size / 2*/, size,size, this);
                        break;
                        case 2: g.drawImage(t2, x /*+ size / 2*/, y /*+ size / 2*/, size,size, this);
                        break;
                        case 3: g.drawImage(t3, x /*+ size / 2*/, y /*+ size / 2*/, size,size, this);
                        break;
                        case 4: g.drawImage(t4, x /*+ size / 2*/, y /*+ size / 2*/, size,size, this);
                        break;
                        default: g.drawImage(t5, x /*+ size / 2*/, y /*+ size / 2*/, size,size, this);
                    }
                } else {
                    switch (matrix[horz][vert].totalWeight()) {
                        case 0:
                            break;
                        case 1: g.drawImage(b1, x /*+ size / 2*/, y /*+ size / 2*/, size,size, this);
                        break;
                        case 2: g.drawImage(b2, x /*+ size / 2*/, y /*+ size / 2*/, size,size, this);
                        break;
                        case 3: g.drawImage(b3, x /*+ size / 2*/, y /*+ size / 2*/, size,size, this);
                        break;
                        case 4: g.drawImage(b4, x /*+ size / 2*/, y /*+ size / 2*/, size,size, this);
                        break;
                        default: g.drawImage(b5, x /*+ size / 2*/, y /*+ size / 2*/, size,size, this);
                    }
                }
                x += size;
            }
            y += size;
        }
        g2d.dispose();
    }
}
