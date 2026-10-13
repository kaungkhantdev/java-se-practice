package com.astronity.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {
    public static void main(String[] args) {
        File file = new File("./src/main/resources/input.txt");
        System.out.println("abs: "+file.getAbsolutePath());

        File outFile = new File("./src/main/resources/output.txt");
        System.out.println("outFile: "+outFile.getAbsolutePath());
        try(FileInputStream fin = new FileInputStream(file);
            FileOutputStream fout = new FileOutputStream(outFile);) {
            int ch;
            do
            {
                ch = fin.read();
                if(ch!=-1)
                {
                    fout.write(ch);
                    System.out.print((char)ch);
                }

            }while(ch != -1);

        } catch (Exception e ) {
            e.printStackTrace();
        }

    }
}
