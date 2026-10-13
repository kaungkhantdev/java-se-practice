package com.astronity.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File("./src/main/resources/input.txt");
        System.out.println("Abs: " + file.getAbsolutePath());

        try(FileInputStream fis = new FileInputStream(file);) {
            int ch;
            do
            {
                ch = fis.read();
                if(ch!=-1)
                {
                    System.out.print((char)ch);
                }

            }while(ch != -1);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
