package at.redlinghaus;

import static at.redlinghaus.Main.myPhotoBook;

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
        myPhotoBook.add(this);
        camera.setNextPic(camera.getNextPic() + 1);
    }

    @Override
    public String toString() {
        return "Photo{" +
                "picName='" + picName + '\'' +
                ", picWidth=" + picWidth +
                ", picHeight=" + picHeight +
                ", countPx=" + countPx +
                ", isColor=" + isColor +
                ", cameraBrand='" + cameraBrand + '\'' +
                ", cameraModel='" + cameraModel + '\'' +
                '}';
    }
}
