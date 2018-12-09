package pl.com.empas.java_introductory_course.io.old;

import java.io.*;
import java.net.URL;

public class WriteFileExample {

    public static void main(String[] args) {
        URL url = WriteFileExample.class.getResource("TextInput.txt");
        File file = new File(url.getPath());
        if(file.exists()) {
            if(file.canWrite()) {
                try {
                    FileOutputStream fos = new FileOutputStream(file, true);
                    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos));
                    writer.newLine();
                    writer.append("New appended line");
                    writer.newLine();
                    writer.append("and another one");
                    writer.flush();
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }
}
