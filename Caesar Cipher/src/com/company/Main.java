package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner myScan = new Scanner(System.in);
        Crypt myCrypt = new Crypt();

        int shift = 0;
        int mode = 0;
        String readType = "";
        String writeType = "";
        String msg = "";
        String processedMsg = "";

        System.out.print("Do you want to choose a file to read from (Y/N)? ");
        readType = myScan.nextLine();
        if (readType.equals("y") || readType.equals("Y")) {
            Reader myRead = new Reader();
            System.out.print("Please type the path and filename: ");
            String ReadFilePath = myScan.nextLine();
            msg = myRead.read(ReadFilePath);
        } else {
            System.out.print("Please type your message: ");
            msg = myScan.nextLine();
        }

        System.out.print("How much do you want the shift to be? Type a number or '0' to brute force while decrypting: ");
        shift = myScan.nextInt();
        myScan.nextLine();

        boolean modeCorrect = false;
        while (!modeCorrect) {
            System.out.print("Do you want to (1)encrypt or (2)decrypt?");
            mode = myScan.nextInt();
            myScan.nextLine();

            if (mode == 1) {
                processedMsg = myCrypt.encode(msg, shift);
                modeCorrect = true;
            } else if (mode == 2){
                if (shift == 0) {
                    for (int i = 0; i < 26; i++) {
                        processedMsg += " (" + i + ") = " + myCrypt.decode(msg, i);
                    }
                } else {
                    processedMsg = myCrypt.decode(msg, shift);
                }
                modeCorrect = true;
            }
        }

        System.out.println(processedMsg);

        System.out.print("Do you want to write the message to a file (Y/N)? ");
        writeType = myScan.nextLine();
        if (writeType.equals("y") || writeType.equals("Y")) {
            Writer myWrite = new Writer();
            System.out.print("Please type the path and filename: ");
            String WriteFilePath = myScan.nextLine();
            myWrite.write(WriteFilePath, processedMsg);
        }
    }
}
