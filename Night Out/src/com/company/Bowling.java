package com.company;

public class Bowling {
    public int[] gameChart = {10, 3, 8, 6, 4, 7, 9, 1, 0, 5, 2};

    public void bowling(int drinks) {
        if (drinks < 4) {
            for (int i : gameChart) {
                System.out.println(cheer(i));
            }
            int rnd = (int) Math.floor(Math.random()*3)+1;
            switch (rnd) {
                case 1:
                    pullUpsFor(20);
                    break;
                case 2:
                    sitUpsWhile(20);
                    break;
                case 3:
                    pushUpDo(20);
                    break;
                default:
                    System.out.println("Uuuuuuups!!");
                    break;
            }
        } else {
            System.out.printf("Du hattest %d Drinks! Du kommst hier nicht rein!%n", drinks);
        }
    }

    public String cheer(int pins) {
        if (pins == 10) {
            return "X-Strike";
        } else if (pins >= 7) {
            return "Guter Treffer";
        } else if (pins >= 4) {
            return "Normaler Treffer";
        } else if (pins >= 1) {
            return "Schwacher Treffer";
        } else {
            return "Miss";
        }
    }

    public void pullUpsFor(int count) {
        for (int i = 0; i < count; i++) {
            if (i == 10) {
                System.out.println("Puh ich hoffe das ist bald vorbei");
            } else if (i == 15) {
                System.out.println("Ich glaub ich schaff das nicht");
            } else if (i == 19) {
                System.out.println("JA ICH SCHAFFE ES!!!!!");
            } else if (i == 20) {
                System.out.println("OLEOLEOLEEEEE");
            } else {
                System.out.printf("%d Klimmzüge%n", i+1);
            }
        }
    }

    public void pushUpDo(int count) {
        int i = 0;
        do {
            i++;
            if (i == 10) {
                System.out.println("Puh ich hoffe das ist bald vorbei");
            } else if (i == 15) {
                System.out.println("Ich glaub ich schaff das nicht");
            } else if (i == 19) {
                System.out.println("JA ICH SCHAFFE ES!!!!!");
            } else if (i == 20) {
                System.out.println("OLEOLEOLEEEEE");
            } else {
                System.out.printf("%d Liegestütze%n", i);
            }
        } while (i < count);
    }

    public void sitUpsWhile(int count) {
        int i = 0;
        while (i < count) {
            i++;
            if (i == 10) {
                System.out.println("Puh ich hoffe das ist bald vorbei");
            } else if (i == 15) {
                System.out.println("Ich glaub ich schaff das nicht");
            } else if (i == 19) {
                System.out.println("JA ICH SCHAFFE ES!!!!!");
            } else if (i == 20) {
                System.out.println("OLEOLEOLEEEEE");
            } else {
                System.out.printf("%d Situps%n", i);
            }
        }
    }
}
