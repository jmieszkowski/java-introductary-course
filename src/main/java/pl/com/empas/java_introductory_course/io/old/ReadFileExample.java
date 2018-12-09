package pl.com.empas.java_introductory_course.io.old;

import java.io.*;
import java.net.URL;

public class ReadFileExample {
    public static void main(String[] args) {
        URL path = ReadFileExample.class.getResource("TextInput.txt");
        File file = new File(path.getPath());
        if(file.exists()) {
            if(file.canRead()) {
                FileInputStream inputStream = null;
                try {
                    inputStream = new FileInputStream(file);

                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    StringBuilder sb = new StringBuilder();
                    while(true) {
                        String line = bufferedReader.readLine();
                        if(line == null) {
                            break;
                        }
                        sb.append(line).append("\n");
                    }
                    System.out.println(sb.toString());
                    inputStream.close();
                } catch(IOException e) {
                    e.printStackTrace();
                } finally {

                }
            }
        }

    }
}
