package at.redlinghaus;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String[] mov = {"Alien", "Terminator", "Star Wars", "Biene Maja"};
        double[][] times = {{20.00, 22.15}, {18.30, 20.15, 22.00}, {18.00, 20.15}, {14.00, 16.00}};
        boolean[][] isFull = {{false, true}, {true, false, true}, {false, true}, {false, false}};
        int[] saal = {1, 2, 3, 3};
        String line = "  ___________________________________________";
        String dots = "  ...........................................";

        Scanner myScan = new Scanner(System.in);
        Date now = new Date();
        SimpleDateFormat day = new SimpleDateFormat("E dd.MM.yyyy");

        System.out.println(line);
        System.out.printf(" | %-4s | %-15s | %-7s | %-6s |%n", "Saal", "Filmtitel", "Uhrzeit", "Plätze");
        System.out.println(dots);

        for (int i = 0; i < mov.length; i++) {
            for (int j = 0; j < times[i].length; j++) {
                System.out.printf(java.util.Locale.US, " | %-4d | %-15S | %-7.2f | %-6s |%n", saal[i], mov[i], times[i][j], isFull[i][j] ? "voll" : "frei");
            }
        }

        System.out.println(line);

        String titleChoice;
        int index = 0;
        int timeChoice = 0;
        boolean titleIsWrong = true;

        do {
            while (titleIsWrong) {
                System.out.printf("Bitte gib den gewünschten Titel ein: ");
                titleChoice = myScan.nextLine();

                for (int i = 0; i < mov.length; i++) {
                    if (mov[i].equalsIgnoreCase(titleChoice)) {
                        index = i;
                        titleIsWrong = false;
                        break;
                    }
                }
            }

            boolean indexIsWrong = true;

            while (indexIsWrong) {
                System.out.printf("Bitte gib die gewünschte Vorstellung ein (1-%d): ", times[index].length);
                timeChoice = myScan.nextInt();
                indexIsWrong = false;
            }
            System.out.printf(java.util.Locale.US, "Du hast %s um %5.2f ausgewählt!%n", mov[index], times[index][timeChoice - 1]);
            if (isFull[index][timeChoice - 1]) {
                System.out.println("Die Vorstellung ist leider voll. Bitte wähle eine andere Zeit.");
            } else {
                System.out.println(line);
                System.out.printf("  |%n  |  Kinoticket%n");
                System.out.println(dots);
                System.out.printf(java.util.Locale.US, "  |%n  |  %s um %5.2f Uhr%n  |%n  |      am %s%n  |%n", mov[index], times[index][timeChoice - 1], day.format(now));
                System.out.println(line);

                FileWriter fw = new FileWriter("ticket.txt");
                BufferedWriter bw = new BufferedWriter(fw);
                String ticketText = "\n  |\n  |  " + mov[index] + " um " + times[index][timeChoice - 1] + " Uhr\n  |\n  |      am " + day.format(now) + "\n  |\n";

                bw.write(line);
                bw.write("\n  |\n  |  Kinoticket\n");
                bw.write(dots);
                bw.write(ticketText);
                bw.write(line);

                bw.close();

                System.out.printf("%n%n  Dein Ticket wurde unter ticket.txt gespeichert.%n");
            }
            System.out.println();
        } while (isFull[index][timeChoice - 1]);

        int minStart = (int) (Math.ceil((times[index][timeChoice - 1] - Math.floor(times[index][timeChoice - 1])) * 100));
        int hourStart = (int) times[index][timeChoice - 1] % 12;

        Calendar today = Calendar.getInstance();
        long millNow = today.getTimeInMillis();

        today.set(Calendar.HOUR, hourStart);
        today.set(Calendar.MINUTE, minStart);

        long start = today.getTimeInMillis();
        int diffInMin = (int) (start - millNow) / 1000 / 60;
        if (diffInMin <= 10) {
            System.out.println("Wir wünschen dir viel Spaß bei deinem Film. Die Zeit bis zum Film reicht noch für einen Besuch der Toiletten.");
        } else {
            
            double geld = 53.60;
            System.out.println("Du entscheidest dich für Popcorn und Cola.");
            System.out.println("Das macht 6,80 EUR.");
            if ()
        }
    }
}
