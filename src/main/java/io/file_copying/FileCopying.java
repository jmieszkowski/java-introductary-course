package io.file_copying;

import java.io.*;
import java.nio.channels.FileChannel;
import java.util.Scanner;

public class FileCopying {
    private static Scanner inputReader = new Scanner(System.in);
    public static void main(String[] args) {

        try {
            File fileToRead = getReadFile();
            File fileToWrite = getWriteFile();

            FileChannel src = new FileInputStream(fileToRead).getChannel();
            FileChannel dest = new FileOutputStream(fileToWrite).getChannel();
            dest.transferFrom(src, 0, src.size());

        } catch (FileNotFoundException exc){
            exc.printStackTrace();
        } catch (IOException exc){
            exc.printStackTrace();
        }

    }


    public static File getReadFile(){
        System.out.println("Path to reading file: ");
        String pathToFile = inputReader.nextLine();
        return new File(pathToFile);
    }

    public static File getWriteFile(){
        System.out.println("Path to writting file: ");
        String pathToFile = inputReader.nextLine();
        return new File(pathToFile);
    }
}
