package at.redlinghaus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Grid {
    private TestPane pane;
    private int key;

    public Grid(Game game) {
        JFrame frame = new JFrame("Lager aufrämen");
        this.pane = new TestPane(game.getMyStock().getMatrix());

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
                frame.addKeyListener(new KeyListener() {

                    @Override
                    public void keyTyped(KeyEvent e) {}

                    @Override
                    public void keyReleased(KeyEvent e) {}

                    @Override
                    public void keyPressed(KeyEvent e) {
                        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                            key = KeyEvent.VK_RIGHT;
                        }
                        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                            key = KeyEvent.VK_LEFT;
                        }
                        if (e.getKeyCode() == KeyEvent.VK_UP) {
                            key = KeyEvent.VK_UP;
                        }
                        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                            key = KeyEvent.VK_DOWN;
                        }
                        game.play();
                    }
                });
            }
        });
    }

    public TestPane getPane() {
        return pane;
    }

    public int getKey() {
        return key;
    }
}