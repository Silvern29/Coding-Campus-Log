package at.redlinghaus;

public class Lens {
    private String brand;
    private int focalDistanceMin;
    private int focalDistanceMax;
    private boolean isInUse = false;

    public Lens(String brand, int focalMin, int focalMax) {
        this.brand = brand;
        this.focalDistanceMin = focalMin;
        this.focalDistanceMax = focalMax;
    }

    public Lens(String brand, int focal) {
        this.brand = brand;
        this.focalDistanceMin = focal;
        this.focalDistanceMax = focal;
    }

    public boolean isInUse() {
        return isInUse;
    }

    public void setInUse(boolean inUse) {
        isInUse = inUse;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getFocalDistanceMin() {
        return focalDistanceMin;
    }

    public void setFocalDistanceMin(int focalDistanceMin) {
        this.focalDistanceMin = focalDistanceMin;
    }

    public int getFocalDistanceMax() {
        return focalDistanceMax;
    }

    public void setFocalDistanceMax(int focalDistanceMax) {
        this.focalDistanceMax = focalDistanceMax;
    }

    @Override
    public String toString() {
        return "Objektiv " + brand + " " + focalDistanceMin + "mm - " + focalDistanceMax + "mm";
    }

}
