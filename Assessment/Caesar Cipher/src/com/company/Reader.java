package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    public String read(String path) throws IOException {
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);

        String row = "";
        String text = "";

        while ((row = br.readLine()) != null) {
            text += row;
        }

        br.close();
        return text;
    }
}
