package com.company;
import java.io.*;
import java.util.ArrayList;


public class AllCapitals {
    private static final String FILE_INPUT = "lines1.txt";


    public static void main(String[] args) throws IOException{

        BufferedReader input = new BufferedReader(new FileReader(FILE_INPUT));

        String line;
        String finest = "";
        while ((line = input.readLine()) != null){
             finest += line.toUpperCase()+"\n";
        }
        String outputFormat = String.format("%s", finest);

        FileWriter writer = new FileWriter("lines1.txt");
        PrintWriter printWriter = new PrintWriter(writer);
        printWriter.write(outputFormat);
        input.close();
        printWriter.close();
    }
}
