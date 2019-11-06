package at.redlinghaus;

public class Venue extends Visitable {

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDiscount() {
        return shopDiscount;
    }
}
