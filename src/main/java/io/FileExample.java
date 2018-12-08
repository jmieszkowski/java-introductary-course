package io;

import java.io.*;

public class FileExample {
    public static void main(String[] args) {

        File maybeFile = new File("/home/arch/Desktop/tekst.txt");
        System.out.println("Do file exist?: " + maybeFile.exists());
        System.out.println("Is it a file?: " + maybeFile.isFile());

        try {
            Reader reader = new FileReader("/home/arch/Desktop/tekst.txt");
            int readChar = reader.read();

            while ((readChar = reader.read()) != -1) {
                System.out.println("readChar: " + readChar);

            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }



    }
}
