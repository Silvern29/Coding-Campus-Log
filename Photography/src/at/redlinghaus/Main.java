package at.redlinghaus;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static List<Photo> myPhotoBook = new LinkedList<>();
    public static List<Camera> myCameras = new LinkedList<>();
    public static List<Lens> myLens = new LinkedList<>();
    public static Calendar myDate = Calendar.getInstance();
    public static int weekDay = myDate.get(Calendar.DAY_OF_WEEK);

    public static Camera aCameraPerWeekDay(){
        System.out.println("Die Kamera des Tages ist:");
        if (weekDay == 1 || weekDay == 7) {
            System.out.println("Achtung, vergiss nicht dein Wochenendequipment einzupacken!");
        }
        return myCameras.get((weekDay-1) % myCameras.size());
    }

    public static Camera addNewCamera(String brand, String model, String displaySize, boolean isStable, int focalMin, int focalMax) {
        Camera tmp = new Camera(brand, model, displaySize, isStable, focalMin, focalMax);
        myCameras.add(tmp);
        return tmp;
    }

    public static Lens addNewLens(String brand, int focalMin, int focalMax) {
        Lens tmp = new Lens(brand, focalMin, focalMax);
        myLens.add(tmp);
        return tmp;
    }

    public static void main(String[] args) {
        Camera myNikD800 = addNewCamera("Nikon", "D800", "7360x4912", true, 24, 500);
        Camera myNikD700 = addNewCamera("Nikon", "D700", "5568x3712", true, 24, 500);
        Camera myNikD500 = addNewCamera("Nikon", "D500", "5568x3712", true, 16, 300);
        Camera myNikD300 = addNewCamera("Nikon", "D300", "3500x1200", true, 16, 300);
        Lens tam2470 = addNewLens("Tamron", 24, 70);
        Lens nik50 = addNewLens("Nikon", 50, 50);
        Lens sig70 = addNewLens("Sigma", 70, 70);
        Lens nik16200 = addNewLens("Nikon", 16, 200);


        myNikD800.switchLens(tam2470);
        myNikD800.switchLens(nik16200);
        myNikD700.switchLens(tam2470);
        myNikD700.switchLens(nik50);
        myNikD300.switchLens(nik16200);
        myNikD800.takePhoto();
        myNikD800.takePhoto();
        myNikD500.takePhoto();
        myNikD500.switchLens(sig70);
        myNikD500.takePhoto();
        myNikD800.takePhoto();
        myNikD700.takePhoto();
        myNikD800.setColor(false);
        myNikD300.takePhoto();
        myNikD300.takePhoto();
        myNikD800.takePhoto();


        for (Camera i : myCameras) {
            System.out.println(i);
        }

        for (Lens i : myLens) {
            System.out.println(i);
        }

        System.out.println(aCameraPerWeekDay());
    }
}
