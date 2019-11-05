package at.redlinghaus;

public interface Movable {
    void moveUp(int amount);

    void moveDown(int amount);

    void moveLeft(int amount);

    void moveRight(int amount);

    MovablePoint getPosition();
}
