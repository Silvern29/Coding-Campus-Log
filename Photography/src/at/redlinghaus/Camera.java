package at.redlinghaus;

import java.util.LinkedList;
import java.util.List;

public class Camera {
    private String brand;
    private String model;
    private double megaPixel;
    private String displaySize;
    private boolean isStable;
    private boolean isColor = true;
    private int focalDistance;
    private int focalDistanceMin;
    private int focalDistanceMax;
    private Lens actualLens;
    private int nextPic;
    private List<Photo> photoCache;

    public Camera(String brand, String model, String displaySize, boolean isStable, int focalMin, int focalMax) {
        this.brand = brand;
        this.model = model;
        this.displaySize = displaySize;
        this.megaPixel = (Integer.parseInt(this.displaySize.substring(0, this.displaySize.indexOf("x"))) * Integer.parseInt(this.displaySize.substring(this.displaySize.indexOf("x") + 1))) / 1000000;
        this.isStable = isStable;
        this.focalDistanceMin = focalMin;
        this.focalDistanceMax = focalMax;
        photoCache = new LinkedList<>();
    }

    public List<Photo> getPhotoCache() {
        return photoCache;
    }

    public void addPhotoToCache(Photo newPhoto) {
        this.photoCache.add(newPhoto);
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

    public double getMegaPixel() {
        return megaPixel;
    }

    public void setMegaPixel(double megaPixel) {
        this.megaPixel = megaPixel;
    }

    public Lens getActualLens() {
        return actualLens;
    }

    public void switchLens(Lens newLens) {
        if (!newLens.isInUse()) {
            if (newLens.getFocalDistanceMin() >= this.getFocalDistanceMin() && newLens.getFocalDistanceMax() <= this.getFocalDistanceMax()) {
                if(this.actualLens != null){
                    this.actualLens.setInUse(false);
                }
                this.actualLens = newLens;
                newLens.setInUse(true);
                this.setFocalDistance(newLens.getFocalDistanceMin());
            } else {
                System.out.println("Kamera und Objektiv sind nicht kompatibel!");
            }
        } else {
                System.out.println("Objektiv ist nicht verfügbar!");
        }
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

    public int getFocalDistance() {
        return focalDistance;
    }

    public void setFocalDistance(int focalDistance) {
        this.focalDistance = focalDistance;
    }

    public void takePhoto() {
        if(actualLens != null) {
            System.out.println("Click!");
            Photo tmp = new Photo(this);
            this.addPhotoToCache(tmp);
        } else {
            System.out.println("Bitte ein Objektiv aufsetzen!");
        }
    }

    public String printPhotoCache(){
        String cacheString = "";
        for (Photo i : this.getPhotoCache()) {
            cacheString += i + " \n";
        }
        return cacheString;
    }

    @Override
    public String toString() {
        return "Kamera " + brand + " " + model + " " + megaPixel + " MP, " + displaySize + ", isStable " + isStable + ", " + focalDistanceMin + "mm - " + focalDistanceMax + "mm" + '\n' + actualLens + '\n' + printPhotoCache();
    }
}
