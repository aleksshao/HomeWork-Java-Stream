package com.company;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyJpgFile {
    public static void main(String[] args) throws IOException {
        String path1 = "C:\\Users\\ALEKSANDAR\\Desktop";
        String fileName = "my-copied-picture.jpeg";
        String path2 = "C:\\Users\\ALEKSANDAR\\IdeaProjects\\HomeWorks-Java-Streams";

        File oldFile = new File(path1, fileName);
        File newFile = new File(path2, fileName);

            FileInputStream input = new FileInputStream(oldFile);
            FileOutputStream output = new FileOutputStream(newFile);

                int currentByte = input.read();
                while (currentByte != -1){
                    output.write(currentByte);
                    currentByte = input.read();
                }

        input.close();
        output.close();

        }
    }


