package at.redlinghaus;

public abstract class Member implements Membership{
    protected int memberDiscount;

    @Override
    public int getDiscount() {
        return memberDiscount;
    }
}
