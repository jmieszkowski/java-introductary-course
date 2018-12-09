package pl.com.empas.java_introductory_course.io.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

public class ReadFileExample {

    public static void main(String[] args) {

        URL url = ReadFileExample.class.getResource("TextInputNio.txt");
        Path path = Paths.get(url.getPath());

        //readStringSimple(path);
        readStringFromReader(path);
        readStringFromByteChannel(path);
    }

    //simple
    public static Optional<String> readStringSimple(String path) {
        try {
            List<String> contents = Files.readAllLines(Paths.get(path));
            StringBuilder sb = new StringBuilder();
            contents.stream().forEach(x -> sb.append(x).append("\n"));
            return Optional.of(sb.toString());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return Optional.empty();
    }

    //proper :)
    public static void readStringFromReader(Path path) {

        Charset charset = Charset.forName("UTF8");
        try {
            BufferedReader bufferedReader = Files.newBufferedReader(path, charset);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //uber proper :):)
    public static void readStringFromByteChannel(Path path) {
        try {
            SeekableByteChannel byteChannel = Files.newByteChannel(path);
            ByteBuffer byteBuffer = ByteBuffer.allocate(10);

            Charset charset = Charset.forName("UTF8");
            while (byteChannel.read(byteBuffer) > 0) {
                byteBuffer.rewind();
                System.out.print(charset.decode(byteBuffer));
                byteBuffer.flip();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }


}
