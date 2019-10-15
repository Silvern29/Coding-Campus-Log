package at.redlinghaus;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static List<Photo> myPhotoBook = new LinkedList<>();
    public static List<Camera> myCameras = new LinkedList<>();
    public static List<Objective> myObjectives = new LinkedList<>();
    public static Calendar myDate = Calendar.getInstance();
    public static int weekDay = myDate.get(Calendar.DAY_OF_WEEK);

    public static Camera aCameraPerWeekDay(){
        if (weekDay == 1 || weekDay == 7) {
            System.out.println("Achtung, vergiss nicht dein Wochenendequipment einzupacken!");
        }
        return myCameras.get((weekDay-1) % myCameras.size());
    }

    public static void main(String[] args) {
        Camera myNikD800 = new Camera("Nikon", "D800", "7360x4912", true, 24, 500);
        Camera myNikD700 = new Camera("Nikon", "D700", "5568x3712", true, 50, 200);
        Camera myNikD500 = new Camera("Nikon", "D500", "5568x3712", true, 50, 200);
        Camera myNikD300 = new Camera("Nikon", "D300", "3500x1200", true, 16, 350);
        Objective myTamron2470 = new Objective("Tamron", 24, 70);

        myNikD800.setActualObjective(myTamron2470);
        myNikD800.takePhoto();
        myNikD800.takePhoto();
        myNikD500.takePhoto();
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

        for (Objective i : myObjectives) {
            System.out.println(i);
        }

        for (Photo i : myPhotoBook) {
            System.out.println(i);
        }
        System.out.println(aCameraPerWeekDay());
    }
}
