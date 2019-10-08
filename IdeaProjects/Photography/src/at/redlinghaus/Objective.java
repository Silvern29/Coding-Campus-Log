package at.redlinghaus;

import static at.redlinghaus.Main.myObjectives;

public class Objective {
    private String brand;
    private int focalDistanceMin;
    private int focalDistanceMax;

    public Objective(String brand, int focalMin, int focalMax) {
        this.brand = brand;
        this.focalDistanceMin = focalMin;
        this.focalDistanceMax = focalMax;
        myObjectives.add(this);
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
        return "Objective{" +
                "brand='" + brand + '\'' +
                ", focalDistanceMin=" + focalDistanceMin +
                ", focalDistanceMax=" + focalDistanceMax +
                '}';
    }

}
