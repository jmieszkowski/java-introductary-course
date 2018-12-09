package my_package.io.file_copying;

import java.io.*;
import java.util.Scanner;

public class FileCopying2 {
    private static Scanner inputReader = new Scanner(System.in);
    public static void main(String[] args) {
        Reader reader=null;
        Writer fileWriter=null;
        try {

            reader = getReader();
            fileWriter = getWriter();

            int readChar;
            for(int i=0;(readChar = reader.read()) != -1;i++){
                fileWriter.write(readChar);
            }
            fileWriter.flush();

        }catch(FileNotFoundException exc){
            exc.printStackTrace();
        }   catch (IOException exc){
            exc.printStackTrace();
        } finally {
            if(null != fileWriter){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(null != reader){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        }

        public static Reader getReader() throws FileNotFoundException {
            System.out.println("Give me path of file to read: ");
            String pathToFile = inputReader.nextLine();

            return new FileReader(pathToFile);

    }

        public static FileWriter getWriter() throws IOException {
            System.out.println("Give me path of file to write: ");
            String pathToFile = inputReader.nextLine();
            return new FileWriter(pathToFile);
        }

}
