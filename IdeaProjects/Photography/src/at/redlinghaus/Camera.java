package at.redlinghaus;

import static at.redlinghaus.Main.myCameras;

public class Camera {
    private String brand;
    private String model;
    private double megaPixel;
    private String displaySize;
    private boolean isStable;
    private boolean isColor = true;
    private int focalDistanceMin;
    private int focalDistanceMax;
    private Objective actualObjective;
    private int nextPic;

    public Camera(String brand, String model, String displaySize, boolean isStable, int focalMin, int focalMax) {
        this.brand = brand;
        this.model = model;
        this.displaySize = displaySize;
        this.megaPixel = (Integer.parseInt(this.displaySize.substring(0, this.displaySize.indexOf("x"))) * Integer.parseInt(this.displaySize.substring(this.displaySize.indexOf("x") + 1))) / 1000000;
        this.isStable = isStable;
        this.actualObjective = new Objective(brand, focalMin, focalMax);
        this.focalDistanceMin = focalMin;
        this.focalDistanceMax = focalMax;
        myCameras.add(this);
    }

    public int getNextPic() {
        return nextPic;
    }

    public void setNextPic(int nextPic) {
        this.nextPic = nextPic;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(String displaySize) {
        this.displaySize = displaySize;
    }

    public boolean isColor() {
        return isColor;
    }

    public void setColor(boolean color) {
        isColor = color;
    }

    public Objective getActualObjective() {
        return actualObjective;
    }

    public void setActualObjective(Objective actualObjective) {
        this.actualObjective = actualObjective;
        this.setFocalDistanceMin(actualObjective.getFocalDistanceMin());
        this.setFocalDistanceMax(actualObjective.getFocalDistanceMax());
    }

    public boolean isStable() {
        return isStable;
    }

    public void setStable(boolean stable) {
        isStable = stable;
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
        return "Camera{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", megaPixel=" + megaPixel +
                ", displaySize='" + displaySize + '\'' +
                ", isStable=" + isStable +
                ", isColor=" + isColor +
                ", focalDistanceMin=" + focalDistanceMin +
                ", focalDistanceMax=" + focalDistanceMax +
                ", actualObjective=" + actualObjective +
                '}';
    }

    public void takePhoto() {
        System.out.println("Click!");
        new Photo(this);
    }
}
