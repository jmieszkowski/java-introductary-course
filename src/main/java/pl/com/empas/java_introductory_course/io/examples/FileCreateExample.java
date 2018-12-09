package pl.com.empas.java_introductory_course.io.examples;

import java.io.IOException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.HashSet;
import java.util.Set;

public class FileCreateExample {

    public static void main(String[] args) {

        //URL url = FileCreateExample.class.getResource("Test.txt");
        Path path = Paths.get("Text.txt");
        System.out.println(Files.exists(path));
        if(!Files.exists(path)) {
            try {
                //Path createdFile = Files.createFile(path);

                Set<StandardOpenOption> options = new HashSet<>();
                options.add(StandardOpenOption.APPEND);
                options.add(StandardOpenOption.CREATE);
                SeekableByteChannel byteChannel = Files.newByteChannel(path, options);
                ByteBuffer buffer = ByteBuffer.wrap("This is\r\n a multiline\r\n text".getBytes());
                byteChannel.write(buffer);
            } catch(IOException e) {
                e.printStackTrace();
            }

        }
    }
}
