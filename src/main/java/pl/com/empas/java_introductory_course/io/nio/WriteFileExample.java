package pl.com.empas.java_introductory_course.io.nio;

import java.io.IOException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashSet;
import java.util.Set;

public class WriteFileExample {
    public static void main(String[] args) {

        ByteBuffer byteBuffer = ByteBuffer.wrap("New file content".getBytes());

        URL url = ReadFileExample.class.getResource("TextInputNio.txt");
        Path path = Paths.get(url.getPath());

        Set<StandardOpenOption> options = new HashSet<>();
        options.add(StandardOpenOption.CREATE);
        options.add(StandardOpenOption.APPEND);

        try {
            SeekableByteChannel byteChannel = Files.newByteChannel(path, options);
            byteChannel.write(byteBuffer);
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}
