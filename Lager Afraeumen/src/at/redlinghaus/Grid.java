package at.redlinghaus;

import java.awt.*;
import javax.swing.*;

public class Grid {
    private TestPane pane;

    public Grid(Field[][] matrix) {
        this.matrix = matrix;
        this.pane = new TestPane(matrix);
        JFrame frame = new JFrame("Testing");

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }

                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(pane);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    private Field[][] matrix;

    public Field[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(Field[][] matrix) {
        this.matrix = matrix;
    }

    public TestPane getPane() {
        return pane;
    }

    public void setPane(TestPane pane) {
        this.pane = pane;
    }
}