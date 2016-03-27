package com.company;

import java.io.*;
import java.util.ArrayList;

public class SumLines {
    private static final String FILE_INPUT = "lines.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(FILE_INPUT));
        String line;
        while ((line = input.readLine()) != null) {
            String str = line;
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                int p = (int) ch;
                sum += p;
            }
            System.out.println(sum);


        }
        input.close();
    }
}