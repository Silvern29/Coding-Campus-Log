package at.redlinghaus;

public class Photo {
    private String picName;
    private int picWidth;
    private int picHeight;
    private int countPx;
    private boolean isColor;
    private String cameraBrand;
    private String cameraModel;

    public Photo(Camera camera) {
        this.cameraBrand = camera.getBrand();
        this.cameraModel = camera.getModel();
        this.picWidth = Integer.parseInt(camera.getDisplaySize().substring(0, camera.getDisplaySize().indexOf("x")));
        this.picHeight = Integer.parseInt(camera.getDisplaySize().substring(camera.getDisplaySize().indexOf("x") + 1));
        this.countPx = picWidth * picHeight;
        this.picName = this.cameraBrand + this.cameraModel + "_" + camera.getNextPic();
        this.isColor = camera.isColor();
        camera.setNextPic(camera.getNextPic() + 1);
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }

    public int getPicWidth() {
        return picWidth;
    }

    public void setPicWidth(int picWidth) {
        this.picWidth = picWidth;
    }

    public int getPicHeight() {
        return picHeight;
    }

    public void setPicHeight(int picHeight) {
        this.picHeight = picHeight;
    }

    public int getCountPx() {
        return countPx;
    }

    public void setCountPx(int countPx) {
        this.countPx = countPx;
    }

    public boolean isColor() {
        return isColor;
    }

    public void setColor(boolean color) {
        isColor = color;
    }

    public String getCameraBrand() {
        return cameraBrand;
    }

    public void setCameraBrand(String cameraBrand) {
        this.cameraBrand = cameraBrand;
    }

    public String getCameraModel() {
        return cameraModel;
    }

    public void setCameraModel(String cameraModel) {
        this.cameraModel = cameraModel;
    }

    @Override
    public String toString() {
        return "Photo " + picName + ", " + picWidth + " x " + picHeight + ", countPx = " + countPx + ", " + (isColor ? "Farbig " : "Schwarz-Weiß ") + ", Kamera " + cameraBrand + " " + cameraModel;
    }
}
